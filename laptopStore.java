/**
 * Illustrating to filter Laptop product of Array List and displaying products and apply Stream API features to sort and filter.
 * By Prashant Bansal
 */

package com.bankApp;

import java.util.ArrayList;

public class laptopStore {
    public static void main(String[] args){
        //TODO Auto-generated method stub

        laptop l1 = new laptop(101,"DELL","9 Inspiron 3511",45000,2022);
        laptop l2 = new laptop(102,"HP","HP Stream 14",35000,2021);
        laptop l3 = new laptop(103,"LENOVO","Lenovo Yoga",54000,2020);
        laptop l4 = new laptop(104,"ACER","Acer Travelmate",380000,2021);
        laptop l5 = new laptop(105,"ASUS","Asus Rog",67000,2019);


        ArrayList<laptop> a1 = new ArrayList<laptop>();

        a1.add(l5);
        a1.add(l4);
        a1.add(l3);
        a1.add(l2);
        a1.add(l1);

        a1.stream()
                .filter(pro-> {
                    return pro.lPrice>30000;
                })
                .forEach(pro->{
                    System.out.println(pro.lCompany+" "+pro.lName+" Rs: "+pro.lPrice);

                });


    }
}
