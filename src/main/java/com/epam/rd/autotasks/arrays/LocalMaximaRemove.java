package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
      //  int[] array = new int[]{18, 1, 3, 6, 7, -5};
        int[] array = new int[]{ 15, 15, 20, 15, 15, 15};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        int[] array2 = new int[array.length];
        int exitArrayLenght = 0;

        //------------- Перевіка першого елементу
        if(array[0]<=array[1])
        {
            array2[0] = array[0];
            exitArrayLenght++;
        }
        //------------- Перевіка центральних елементів
        for(int i =1; i < array.length-1; i++)
        {
            if(array[i]<=array[i-1] || array[i]<=array[i+1])
            {
                array2[exitArrayLenght] = array[i];
                exitArrayLenght++;
            }
        }
        //--------------- Перевіка останнього елементу
        if(array[array.length-1]<=array[array.length-2])
        {
            array2[exitArrayLenght] = array[array.length-1];
            exitArrayLenght++;
        }


        //зменшення розміру із збереженням даних
        if(exitArrayLenght>0) array2 = Arrays.copyOf(array2, exitArrayLenght);
        else return array;

        return  array2;
       // throw new UnsupportedOperationException();
    }





}
