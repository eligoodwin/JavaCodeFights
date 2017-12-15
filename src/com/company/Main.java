package com.company;

public class Main {
    /*Given a year, return the century it is in. The first century spans
    *from the year 1 up to and including the year 100, the second -
    *from the year 101 up to and including the year 200, etc.
    */
    public static int centuryFromYear(int year) {
        //int divide by 100
        int result = year /100;
        if(result * 100 != year){
            ++result;
        }
        return result;

    }

    /*Given an array of integers, find the pair of adjacent elements
    *that has the largest product and return that product.
    **/

    int adjacentElementsProduct(int[] inputArray) {
        int largestProduct = -1000;
        int compare = 0;

        for(int i = 1 ; i < inputArray.length; ++i){
            compare = inputArray[i] * inputArray[i - 1];
            if(compare > largestProduct){
                largestProduct = compare;
            }
        }

        return largestProduct;
    }

    /*Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
    each statue having an non-negative integer size. Since he likes to make things perfect,
    he wants to arrange them from smallest to largest so that each statue will be bigger
    than the previous one exactly by 1. He may need some additional statues to be able
    to accomplish that. Help him figure out the minimum number of additional statues needed.*/
    int makeArrayConsecutive2(int[] statues) {
        int max = statues[0];
        int min = statues[0];

        for (int i = 0; i < statues.length; ++i){
            if(statues[i] < min){
                min = statues[i];
            }
            if(statues[i] > max){
                max = statues[i];
            }
        }

        return (max - min) - statues.length + 1;
    }


    public static void main(String[] args) {
	// write your code here
    }
}
