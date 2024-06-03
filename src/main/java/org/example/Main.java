package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        객체 변수 = new 객체();

        변수.성 = "유";
        변수.이름 = "건혁";
        변수.나이 = 29;
        변수.키 = 180.7;

        System.out.println("이름 : " + 변수.성 + " " + 변수.이름);
        System.out.println("나이 : " + 변수.나이);
        System.out.println("키 : " + 변수.키);
    }
    }

    class 객체 {
        String 성;
        String 이름;
        int 나이;
        double 키;
    }