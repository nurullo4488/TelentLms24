package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Random rand = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rand.nextInt(2));
            linkedList.add(rand.nextInt(2));
        }
        sort(linkedList);
        sort(arrayList);
        sort();

    }

    private static void sort(LinkedList<Integer> linkedList) {
        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(linkedList);
    }

    private static void sort(ArrayList<Integer> arrayList) {
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(arrayList);
    }

    public static void sort() {
        Random rand = new Random();
        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = rand.nextInt(2);
        }
        int count;
        do {
            count = 0;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    int temp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = temp;
                    count++;
                }

            }
        } while (count > 0);
        System.out.println(Arrays.toString(massive));
    }
}


