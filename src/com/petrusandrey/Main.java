package com.petrusandrey;

public class Main {

    public static void main(String[] args) {
        IntArrayList arrayList = new IntArrayList();


        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);


        System.out.println(arrayList);

        arrayList.add(9, 1982);
        System.out.println("  ");

        System.out.println(arrayList);

        int numeral = arrayList.get(3);
        System.out.println("  ");
        System.out.println("numeral = " + numeral + ":");

        System.out.println("  ");

        arrayList.remove(5);
        System.out.println(arrayList);

        arrayList.set(8, 666);
        System.out.println("  ");
        System.out.println(arrayList);
        System.out.println("  ");
        System.out.println("Size = " + arrayList.size() + ":");


        arrayList.clear();


    }
}
