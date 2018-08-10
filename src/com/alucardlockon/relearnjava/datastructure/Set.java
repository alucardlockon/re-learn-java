package com.alucardlockon.relearnjava.datastructure;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * 集合
 * Set不会储存重复的元素
 */
public class Set {
    public static void main(String[] args) {
        // hashcode
        java.util.Set<Integer> s=new HashSet<>();
        s.add(1);
        System.out.println(s);
        // TreeSet compare
        java.util.Set<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(3);
        ts.add(2);
        ts.add(4);
        System.out.println(ts);
    }
}
