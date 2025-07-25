package jungol.jungol_operator;

public class 연산자_연습문제8 {
    public static void main(String[] args){
        int a, b, c;
        a = 0;
        b = 1;
        c = 2;

        System.out.printf("%b %b %b %b",
                a!=0||b!=0, a!=0 ^ b!=0, a!=0 && b != 0, !(a!=0));
    }
}
