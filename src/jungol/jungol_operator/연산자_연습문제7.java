package jungol.jungol_operator;

public class 연산자_연습문제7 {
    public static void main(String[] args) {
        int a, b, c;
        a = 0;
        b = 1;
        c = 2;

        System.out.printf("%d %d %d %d",((a!=0&&b!=0)? 1  : 0 ), ((a!=0||b!=0)? 1 : 0),
                ((b!=0&&c!=0)? 1 : 0), ((a==0)? 1 : 0));
    }
}
