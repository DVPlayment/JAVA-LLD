package org.example.HashmapImplementation;

public class LinkedListCustom<K,V> {
    protected K key;
    protected V value;
    protected LinkedListCustom next;
    public LinkedListCustom(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
