package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] x = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        QuickSort.quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}


class QuickSort{

    public static void quickSort(int[] array, int low, int high){

        //проверим, если длина массива не равна 0
        if(array.length==0)
            return;
        //проверим, если меньшая точка стала больше или равно большей
        if (low>=high)
            return;

        //найдём элемент по середине массива
        int middle = low + (high - low)/2;
        int opora = array[middle];
        //разделим на подмассивы, которые больше и меньше середины
        int i = low;
        int j = high;

        while (i<=j){
            while (array[i]<opora){
                i++;
            }
            while (array[j]>opora){
                j--;
            }
            //меняем метсами
            if(i<=j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            //вызов рекурсии для левой и правой части
            if (low<j) quickSort(array,low,j);
            if (high>i) quickSort(array,i,high);
        }
    }
}
