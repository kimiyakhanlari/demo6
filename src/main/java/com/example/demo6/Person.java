package com.example.demo6;

import java.util.Scanner;

public class Person {

    private static int age() {
        Scanner input =new Scanner(System.in);
        System.out.println("enter currentYear");
        int date= input.nextInt();
        System.out.println("enter your birthYear");
        int birthYear=input.nextInt();
        int age;
        age=date-birthYear;
        return age;
    }
    private static String name(){
        Scanner input =new Scanner(System.in);
        System.out.println("enter your name");
           String name =input.nextLine();
           return name;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("age="+age()+"\t"+"WellCome"+""+name());

    }
}
