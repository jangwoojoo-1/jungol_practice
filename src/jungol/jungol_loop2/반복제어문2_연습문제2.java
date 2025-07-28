package jungol.jungol_loop2;

import java.util.stream.IntStream;

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

        IntStream intStream = IntStream.rangeClosed(65, 90);
        intStream.forEach(e -> System.out.print((char)e));
    }
}
