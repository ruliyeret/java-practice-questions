package grapqh;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Graph<T> {

    private Map<T, List<T>> map = new HashMap<>();

    public void addVertex(T s){
        map.put(s, new LinkedList<T>());
    }

    public Map getMap(){
        return this.map;
    }

    public void addEdge(T source, T destination, boolean biDirectional){
        map.computeIfAbsent(source, k-> new LinkedList<>());
        map.computeIfAbsent(destination, k-> new LinkedList<>());
        map.get(source).add(destination);
        if(biDirectional){
            map.get(destination).add(source);
        }
    }

    public int getVertexConut(){
        return map.keySet().size();
    }

    public int getEdgeCount(boolean biDirectional){

        int count = 0;
        for (T v: map.keySet() ) {
            count += map.get(v).size();
        }

        if(biDirectional){
            count = count /2;
        }
        return count;
    }

    public boolean hasVertex(T vertex){
        return map.containsKey(vertex);
    }

    public boolean hasEdge(T source, T destination){
        if (map.containsKey(source)) {
            return map.get(source).contains(destination);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        for (T v: map.keySet()) {
            builder.append(v + ": ");
            for (T e: map.get(v)) {
                builder.append(e.toString() + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public boolean hasPathBFS(T source, T destination) {

        HashSet<T> visitedNode = new HashSet<>();
        LinkedList<T> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
                T node  = queue.remove();

                if(node.equals(destination) ) {
                    return true;
                }
                queue.addAll(this.map.get(node).stream().filter(key -> !visitedNode.contains(key)).collect(Collectors.toList()));
                visitedNode.add(node);
        }

        return false;
    }

    public boolean hasPathDFS(T source, T destination) {

        HashSet<T> visitedNode = new HashSet<>();

        if(visitedNode.contains(source)){
            return false;
        }
        visitedNode.add(source);

        if(source.equals(destination)){
            return true;
        }

        return map.get(source).stream().anyMatch(node -> hasPathDFS(node,destination));
//        for (T current:map.get(source)) {
//            if(hasPathDFS(current,destination)){
//                return true;
//            }
//        }
//        return false;
    }
}
