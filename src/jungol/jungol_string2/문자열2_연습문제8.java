package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_연습문제8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = inputString();
        String s2 = inputString();
        compareStrings(s1, s2);
        first3Equal(s1, s2);
    }

    public static String inputString(){
        while(true){
            //System.out.print("문자열을 입력하세요. ");
            String string = sc.next();
            if(string.length() >= 20){
                continue;
            }
            return string;
        }
    }

    public static void compareStrings(String s1, String s2){
        if(s1.compareTo(s2) > 0){
            System.out.printf("%s 가(이) 더 큽니다.\n", s1);
        } else if (s1.compareTo(s2) == 0) {
            System.out.println("같은 문자입니다.");
        } else {
            System.out.printf("%s 가(이) 더 큽니다.\n", s2);
        }
    }

    public static void first3Equal(String s1, String s2){
        if(s1.substring(0, 4).equals(s2.substring(0, 4))){
            System.out.println("앞의 세 문자가 같습니다.");
            return;
        }
        System.out.println("앞의 세 문자가 같지 않습니다.");
    }
}
