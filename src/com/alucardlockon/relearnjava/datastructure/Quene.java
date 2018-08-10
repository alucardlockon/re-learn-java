package com.alucardlockon.relearnjava.datastructure;

import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Quene {
    public static void main(String[] args) {
        //runTest();
        //runPriorityQueue();
        runConcurrentLinkedQueue();
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
}
