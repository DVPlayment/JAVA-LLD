package org.example.HashmapImplementation;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class HashMapCustom <K,V> {

    // impleemtn & init vars
    private int defaultSize;
    private double loadFactor;
    private int capacity;
    private int currentSize;
    private List<LinkedListCustom> buckets;

    // implement funcs
    public HashMapCustom(int defaultSize, double loadFactor) {
        this.defaultSize = defaultSize;
        this.loadFactor = loadFactor;
        initializeMap();
    }

    private void initializeMap(){
        int size = getBucketSize();
        this.buckets = new ArrayList<LinkedListCustom>(size);
        for (int i = 0; i < size; i++) {
            this.buckets.add(null);
        }
        this.capacity = size;
    }

    public V get(K key) {
        int bucketIdx = hash(key);
        LinkedListCustom node = buckets.get(bucketIdx);
        while (node != null) {
            if (node.key.equals(key)) {
                return (V) node.value;
            } else {
                node = node.next;
            }
        }
        System.out.println("key doesn't exist");
        return null;
    }

    public void put(K key, V value) {
        int bucketIdx = hash(key);
        LinkedListCustom node = buckets.get(bucketIdx);
        LinkedListCustom tailNode = null;
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                break;
            } else {
                tailNode = node;
                node = node.next;
            }
        }
        LinkedListCustom newNode = new LinkedListCustom(key, value);
        if (tailNode != null) {
            tailNode.next = newNode;
        } else {
            buckets.set(bucketIdx, newNode);
        }
        currentSize++;
        checkLoad();
    }

    private int hash(K key) {
        return key.hashCode() % this.capacity;
    }

    private int getBucketSize(){
        if (this.defaultSize < 1) {
            return 1;
        }
        double log2 = Math.ceil(Math.log(this.defaultSize) / Math.log(2));
        return (int) (Math.pow(2, log2));
    }

    public int size() {
        return this.currentSize;
    }

    public int capacity() {
        return this.capacity;
    }

    private void checkLoad(){
        if (((double) currentSize / capacity) >=  loadFactor) {
            resize();
        }
    }

    private void resize() {
        this.capacity *= 2;
        System.out.println("Resizing to " + this.capacity);// 2^k to 2^(k+1)
        for (int i = 0; i < this.capacity; i++) {
            this.buckets.add(null);
        }
    }
}
