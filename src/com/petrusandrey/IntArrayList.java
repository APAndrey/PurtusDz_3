package com.petrusandrey;

import java.util.Arrays;

public class IntArrayList implements IntList {


    private int[] array = new int[10];
    private int number = 0;

    @Override
    public void add(int value) {
        array = arrSize(array);
        array[number++] = value;
    }

    @Override
    public void add(int index, int element) {
        array = arrSize(array);
        int[] tmpArray = new int[array.length];
        for (int i = 0; i <= number; i++) {
            if (i < index) {
                tmpArray[i] = array[i];
            } else if (i == index) {
                tmpArray[i] = element;
            } else {
                tmpArray[i] = array[i - 1];
            }
        }
        array = tmpArray;
        number++;
    }

    @Override
    public void clear() {
        number = 0;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < number; i++) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        indexElement(index);
        return array[index];
    }

    @Override
    public boolean isEmpty() {
        return number == 0;
    }

    @Override
    public int remove(int index) {
        indexElement(index);

        int[] tmpArr = new int[array.length];
        int tmpIndex = array[index];
        for (int i = 0; i < number - 1; i++) {
            if (i < index) {
                tmpArr[i] = array[i];
            } else {
                tmpArr[i] = array[i + 1];
            }
        }
        array = tmpArr;
        number--;
        return tmpIndex;
    }

    @Override
    public void set(int index, int element) {
        indexElement(index);
        array[index] = element;
    }

    @Override
    public int size() {
        return number;
    }

    private int[] arrSize(int[] array) {
        if (number >= array.length) {
            int newSize = array.length * 3 / 2 + 1;
            int[] tmpArray = new int[newSize];
            System.arraycopy(array, 0, tmpArray, 0, number);
            return tmpArray;
        } else {
            return array;
        }
    }

    private void indexElement(int index) {
        if (index >= number) {
            throw new IndexOutOfBoundsException("Wrong index!");
        }
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "array=" + Arrays.toString(array) +
                ", number=" + number +
                '}';
    }
}


