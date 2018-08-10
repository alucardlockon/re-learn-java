package com.alucardlockon.relearnjava.datastructure;

import java.util.ArrayList;
import java.util.Vector;

/**
 * List 有序数组集合
 * ArrayList是由数组实现的，方便查找，返回数组下标对应的值即可，适用于多查找的场景
 * LinkedList由链表实现，插入和删除方便，适用于多次数据替换的场景
 * Vector是ArrayList的线程安全版，方法前都加了synchronized锁
 */
public class List {
    public static void main(String[] args) {
        java.util.List<Integer> arrayList=new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);
        java.util.List<Integer> vector=new Vector<>();
        vector.add(3);
        vector.add(1);
        vector.add(2);
        System.out.println(vector);
        java.util.List<Integer> linkedList=new ArrayList<>();
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList);

    }
}
