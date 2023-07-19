package org.example.DesignPatterns;

import java.util.HashMap;

public class MyHashMap<K,V> {
    private static int initialCapacity =  1 << 4;
    private static int maxCapacity = 1 << 30;
    private Entry[] hashTable;
    public MyHashMap(){
        hashTable = new Entry[initialCapacity];
    }
    public MyHashMap(int capacity){
        int tableSize = tableForCreation(capacity);
        hashTable = new Entry[tableSize];
    }

    final int tableForCreation(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= maxCapacity) ? maxCapacity : n + 1;

    }

    class Entry<K,V>{
        public K key;
        public V value;
        Entry next;

        public K getK() {
            return key;
        }

        public void setK(K k) {
            this.key = k;
        }

        public V getV() {
            return value;
        }

        public void setV(V v) {
            this.value = v;
        }

        public Entry(K k, V v){
            this.key = k;
            this.value = v;
        }
    }

    public void put(K key, V value){
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        if(node == null){
            Entry newNode = new Entry(key,value);
            hashTable[hashCode] = newNode;
        }else {
            Entry prev = node;
            while (node != null){
                if(node.key == key){
                    node.value = value;
                    return;
                }
                prev = node;
                node = node.next;
            }
            Entry newNode = new Entry(key,value);
            prev.next = newNode;
        }
    }

    public V get(K key){
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];
        while(node != null){
            if(node.key.equals(key)){
                return (V)node.value;
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>(7);
        map.put(1, "hi");
        map.put(2, "my");
        map.put(3, "name");
        map.put(4, "is");
        map.put(5, "Shubhi");
        map.put(6, "how");
        map.put(7, "are");
        map.put(8, "you");
        map.put(9, "friends");
        map.put(10, "?");

        String v = map.get(10);
        System.out.println(v);


    }



}
