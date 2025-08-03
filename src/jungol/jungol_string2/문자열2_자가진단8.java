package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_자가진단8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = inputString();
        String s2 = inputString();
        String s3 = inputString();

        compareStrings(s1, s2, s3);
    }

    public static String inputString(){
        while(true){
            //System.out.print("문자열을 입력하세요. ");
            String string = sc.next();
            if(string.length() >= 20 || string.length() < 1){
                continue;
            }
            return string;
        }
    }

    public static void compareStrings(String s1, String s2, String s3) {
        String firstString = s1.compareTo(s2) > 0 ? s2 : s1;

        System.out.println(firstString.compareTo(s3) > 0 ? s3 : firstString);
    }

}
