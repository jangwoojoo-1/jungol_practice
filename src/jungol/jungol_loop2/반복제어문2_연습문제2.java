package jungol.jungol_loop2;

public class 반복제어문2_연습문제2 {
    public static void main(String[] args) {
        int asc_num = 65;
        for(int i=0;i<=25;i++){
            System.out.printf("%c", asc_num + i);
        }
        System.out.println("\n");

        int ch = 65;
        for(int i = 1; i <= 26;i++){
            System.out.printf("%c", ch);
            ch = ch + 1;
        }
        System.out.println("\n");

        int total = 0;//합계변수, 값 유지
        for(int i = 1; i <=100; i++){// for 무한루프 시 for(true)
            total += i;
        }
        System.out.println(total);
    }
}
