package org.example;
//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах

import java.util.Arrays;
import java.util.Random;

//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)
public class HW1 {

    public static void main(String[] arg){
        
        int max_rnd = 2000;
        int i = new Random().nextInt(max_rnd+1);
        System.out.println("Случайное число в диапазоне от 0 до " + max_rnd + ": " + i);

        String n = String.valueOf(Integer.toBinaryString(i).length());
        int n1 = Integer.parseInt(n);
        System.out.println("Номер старшего значащего бита выпавшего числа: " + n);

        int max = Short.MAX_VALUE;
        int min = Short.MIN_VALUE;

        int[] arr1 = maxM(n1, i, max);
        System.out.println(Arrays.toString(arr1));
        System.out.println();

        int[] arr2 = minM(n1, min, i);
        System.out.println(Arrays.toString(arr2));

    }


    private static int[] minM(int num, int min1, int rndI) {//    Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int count = 0;
        for (int q = min1;  q < rndI ; q++) {
            if(q % num != 0) count++;
        }

        int[] arr = new int[count];
        count = 0;
        for (int q = min1;  q < rndI ; q++) {
            if(q % num != 0) arr[count++] = q;
        }
        return arr;
    }

    public static int[] maxM(int num, int rndI, int max1){
        int count = 0;
        for (int q = rndI;  q < max1 ; q++) {
            if(q % num == 0) count++;
        }

        int[] arr = new int[count];
        count = 0;
        for (int q = rndI;  q < max1 ; q++) {
            if(q % num == 0) arr[count++] = q;
        }
        return arr;
    }
}