package org.example;

public class Main {

    public static void main(String[] args) {

        사람 a = new 사람();
        a.나이 = 23;
        a.성 = "김";
        a.이름 = "철수";
        a.결혼여부 = false;
        a.hello();

        a++;

        사람 a = new 사람();
        a.나이 = 33;
        a.성 = "박";
        a.이름 = "영수";
        a.결혼여부 = true;
        a.hello();

        a++;

        사람 a = new 사람();
        a.나이 = 28;
        a.성 = "이";
        a.이름 = "재용";
        a.결혼여부 = true;
        a.hello();
    }
}

class 사람 {
    String 성;
    String 이름;
    int 나이;
    boolean 결혼여부;

    void hello() {
        System.out.println(이름 + "의 프로필");
        System.out.println("이름 : " + this.성 + this.이름);
        System.out.println("나이 : " + this.나이);
        System.out.println("결혼여부 : " + this.결혼여부);
        System.out.println();
    }
}