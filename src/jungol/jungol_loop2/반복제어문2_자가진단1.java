package jungol.jungol_loop2;

import java.util.Scanner;

public class 반복제어문2_자가진단1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //string charAt 메서드 사용 charAt(int index)
        char ch = in.next().charAt(0);

        for(int i = 1; i <= 20; i++){
            // string 클래스 API를 참고하여 입력받은 문자 1개를 출력하기
            System.out.printf("%c", ch);
        }
    }
}
