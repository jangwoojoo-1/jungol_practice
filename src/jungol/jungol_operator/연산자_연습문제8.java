package jungol.jungol_operator;

public class 연산자_연습문제8 {
    public static void main(String[] args){
        int a, b, c;
        a = 0;
        b = 1;
        c = 2;

        System.out.print((a==1||b==1)? 1 + " " : 0 + " ");
        System.out.print((a==1&&c==1)? 1 + " " : 0 + " ");
        System.out.print((b==1||c==1)? 1 + " " : 0 + " ");
        System.out.print((a==1^b==1)? 1 + " " : 0 + " ");
    }
}
