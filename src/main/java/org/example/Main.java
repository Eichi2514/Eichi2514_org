package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//int a = 10;
//int b = 10;


        계산기.합(20, 10, 30);
        System.out.println();
        계산기.합(20, 40, 30);
        }
    }

class 계산기 {
    static void 합(int a, int b, int c) {
        System.out.printf(a + " + " + b);
        System.out.printf(" = ");
        System.out.println(c);
        if(a+b==c) {
            System.out.println("정답");
        }
        if(a+b!=c) {
            System.out.println("오답");
        }
    }
}