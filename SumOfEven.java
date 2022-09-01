/**
 * Illustrating to filter Even value of Array List and displaying Sum of Even number using Lambda Expression and Stream filter.
 * By Prashant Bansal
 */




package com.bankApp;

import java.util.Arrays;
import java.util.List;

public class SumOfEven {
    public static void main(String[] args){
        //TODO Auto-generated method stub

        //Convert array to List
        List<Integer> numbers = Arrays.asList(2,3,46,87,10,24,28,98,91);

        System.out.println("Sum of even numbers : ");

        //Use stream and lambda expression to filter and reduce sum of even numbers to print
        System.out.println(
                numbers.stream()
                        .filter(e->e%2==0)
                        .reduce(0,Integer::sum));
    }
}
