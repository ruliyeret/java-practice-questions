package grapqh;

public class DfsExample {

    public static void main(String[] args){

        Graph<Integer> graph = new Graph<>();
        graph.addEdge(1,4,false);
        graph.addEdge(1,3,false);
        graph.addEdge(3,2,false);
        graph.addEdge(5,2,false);


        System.out.println("Has path between 1-3 "+ graph.hasPathDFS(1,3));

        System.out.println("Has path between 1-2 "+ graph.hasPathDFS(1,2));

        System.out.println("Has path between 1-5 "+ graph.hasPathDFS(1,5));
    }
}
