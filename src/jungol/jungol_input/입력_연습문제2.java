package jungol.jungol_input;

public class 입력_연습문제2 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 10;
        num2 = 20;

        System.out.printf("%d %d\n", num2, num1);

        //바꾸어 출력하라는 게 무슨 말인지 이해 못해 2개 경우 코드 작성

        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.printf("%d %d", num1, num2);
    }
}
