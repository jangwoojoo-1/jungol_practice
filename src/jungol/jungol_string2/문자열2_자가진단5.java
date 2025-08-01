package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_자가진단5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = inputString();

        StringBuffer str = new StringBuffer(str1);
        str.append("fighting");
        String result = str.toString();

        System.out.println(result);
    }

    public static String inputString(){
        while(true){
            String string = sc.next();
            if(string.length() > 20){
                continue;
            }
            return string;
        }
    }
}
