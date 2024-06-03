package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        자동차 a = new 자동차();
        a.최고속력 = 240;
        자동차 b = new 자동차();
        b.최고속력 = 260;

        System.out.println(a.최고속력);
        System.out.println(b.최고속력);

    }

    static class 자동차 {
        String 이름;
        String 색깔;
        int 번호;
        int 최고속력;
    }
}