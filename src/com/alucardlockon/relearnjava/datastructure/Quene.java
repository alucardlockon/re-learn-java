package com.alucardlockon.relearnjava.datastructure;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 队列
 * ﻿非阻塞队列：ConcurrentLinkedQueue(无界线程安全)，采用CAS机制（compareAndSwapObject原子操作）。
 * 阻塞队列：ArrayBlockingQueue(有界)、LinkedBlockingQueue（无界）、DelayQueue、PriorityBlockingQueue，采用锁机制；使用 ReentrantLock 锁。
 */
public class Quene {
    public static void main(String[] args) {
        runTest();
        runPriorityQueue();
        runConcurrentLinkedQueue();
        runArrayBlockingQueue();
        runLinkedBlockingQueue();
    }

    private static void runTest() {
    }

    /**
     * java优先队列 PriorityQueue
     * 优先队列不允许空值，而且不支持non-comparable（不可比较）的对象，比如用户自定义的类。
     * 优先队列要求使用Java Comparable和Comparator接口给对象排序，并且在排序时会按照优先级处理其中的元素。
     *
     * PriorityQueue是非线程安全的，所以Java提供了PriorityBlockingQueue（实现BlockingQueue接口）用于Java多线程环境。
     * @since 0.1
     */
    private static void runPriorityQueue(){
        PriorityQueue<String> priorityQueue=new PriorityQueue<>();
        priorityQueue.offer("1");
        priorityQueue.offer("2");
        priorityQueue.offer("3");
        priorityQueue.offer("4");
        priorityQueue.offer("5");
        priorityQueue.offer("6");
        priorityQueue.add("7");
        priorityQueue.offer("8");
        priorityQueue.offer("9");
        priorityQueue.offer("10");
        priorityQueue.offer("11");
        priorityQueue.offer("12");
        System.out.println(priorityQueue);
        //移除并返回第一个
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        //查看不移除
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }

    /**
     * ConcurrentLinkedQueue是一个基于链接节点的无界线程安全队列，它采用先进先出的规则对节点进行排序，
     * 当我们添加一个元素的时候，它会添加到队列的尾部，当我们获取一个元素时，它会返回队列头部的元素。
     */
    private static void runConcurrentLinkedQueue(){
        ConcurrentLinkedQueue<Integer> concurrentLinkedQueue=new ConcurrentLinkedQueue<>();
        concurrentLinkedQueue.offer(3);
        concurrentLinkedQueue.offer(1);
        concurrentLinkedQueue.offer(6);
        concurrentLinkedQueue.offer(4);
        System.out.println(concurrentLinkedQueue.poll());
    }

    /**
     * ArrayBlockingQueue在构造时需要指定容量， 并可以选择是否需要公平性，如果公平参数被设置true，
     * 等待时间最长的线程会优先得到处理（其实就是通过将ReentrantLock设置为true来 达到这种公平性的：即等待时间最长的线程会先操作）。
     * 通常，公平性会使你在性能上付出代价，只有在的确非常需要的时候再使用它。它是基于数组的阻塞循环队 列，
     * 此队列按 FIFO（先进先出）原则对元素进行排序。
     */
    private static void runArrayBlockingQueue(){
        ArrayBlockingQueue<Integer> arrayBlockingQueue=new ArrayBlockingQueue<>(10);
        arrayBlockingQueue.add(3);
        arrayBlockingQueue.add(1);
        arrayBlockingQueue.add(2);
        arrayBlockingQueue.add(4);
        System.out.println(arrayBlockingQueue);
    }

    /**
     * LinkedBlockingQueue的容量是没有上限的（说的不准确，在不指定时容量为Integer.MAX_VALUE，不要然的话在put时怎么会受阻呢），
     * 但是也可以选择指定其最大容量，它是基于链表的队列，此队列按 FIFO（先进先出）排序元素。
     */
    private static void runLinkedBlockingQueue(){
        LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>();
        linkedBlockingQueue.offer("231");
        linkedBlockingQueue.offer("431");
        linkedBlockingQueue.offer("441");
        linkedBlockingQueue.offer("322");
        linkedBlockingQueue.offer("499");
        System.out.println(linkedBlockingQueue);
    }

}
