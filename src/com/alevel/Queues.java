package com.alevel;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(4);
        integerQueue.add(2);
        integerQueue.add(8);
        integerQueue.add(3);
        integerQueue.add(8);
        integerQueue.add(6);
        integerQueue.add(3);

        for (Integer i: integerQueue) {
            System.out.println(i);
        }

        integerQueue.remove();

        System.out.println("   ");
        for (Integer i: integerQueue) {
            System.out.println(i);
        }

        integerQueue.remove();

        System.out.println("   ");
        for (Integer i: integerQueue) {
            System.out.println(i);
        }

        integerQueue.remove();

        System.out.println("   ");
        for (Integer i: integerQueue) {
            System.out.println(i);
        }


        integerQueue.remove();

        System.out.println("   ");
        for (Integer i: integerQueue) {
            System.out.println(i);
        }

        integerQueue.poll();

        System.out.println("   ");
        for (Integer i: integerQueue) {
            System.out.println(i);
        }
    }
}
