package org.example;

public class Main {

    public static void main(String[] args) {
        사람 a = new 사람();
        a.나이 = 23;
        a.이름 = "김철수";
        a.결혼여부 = false;
        a.hello();

        사람 b = new 사람();
        b.나이 = 33;
        b.이름 = "박영수";
        b.결혼여부 = true;
        b.hello();

        사람 c = new 사람();
        c.나이 = 28;
        c.이름 = "이재용";
        c.결혼여부 = true;
        c.hello();
    }
}

class 사람 {
    String 이름;
    int 나이;
    boolean 결혼여부;

    void hello() {
        System.out.println(이름 + "의 프로필");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
        System.out.println("결혼여부 : " + 결혼여부);
        System.out.println();
    }
}