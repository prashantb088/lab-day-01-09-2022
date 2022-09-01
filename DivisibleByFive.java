
/**
 * Illustrating to to print the Divisible of 5 using of Stream Iterate, filter method, limit method and forEach method.
 * By Prashant Bansal
 */


package com.bankApp;

import java.util.Scanner;
import java.util.stream.Stream;

public class DivisibleByFive {


    public static void main(String[] args){
        //TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
        System.out.println("Divisible by 5 " );
        int no = scan.nextInt();
        System.out.println("First 20 Divisible of 5 :");


        //Demonstration of Stream Iterate,filter method,limit method and foeEach method
        //limit method is used to control the no of iteration of stream Iterator
        //To print first 20 divisible of 5
        Stream.iterate(1,i->i+1).filter(i->i%5==0).limit(20).forEach(System.out::println);

        //closing the scanner object
        scan.close();

    }
}
