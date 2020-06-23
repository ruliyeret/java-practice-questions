package collections;

import java.util.*;

public class RandomizedSet<K>{

    private Map<K, Integer> map;
    private List<K> list;


    public RandomizedSet(){
        this.map  = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public void insert(K val){
        map.computeIfAbsent(val, (k) -> {
            this.list.add(val);
            return list.size();
        });
    }

    public void remove(K key){

        if(this.map.containsKey(key)){

            int indexToRemove = this.map.get(key);
            K valueLast = this.list.get(this.list.size() - 1);
            this.list.set(indexToRemove, valueLast);
            list.remove(list.size() - 1);
            this.map.put(valueLast, indexToRemove);
            this.map.remove(key);
        }
    }

    public K getRandom() { // will fail if set is empty.
        int index = new Random().nextInt(list.size());
        return list.get(index);
    }


    public static void main(String[] args) {
        RandomizedSet<Integer> randomizedSet = new RandomizedSet();

        System.out.println(1/2);
        randomizedSet.insert(3);
        randomizedSet.insert(6);
        randomizedSet.insert(2);

        randomizedSet.remove(6);

        System.out.println(randomizedSet.getRandom());
    }
}
