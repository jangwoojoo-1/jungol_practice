package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_자가진단6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = inputString();
        StringBuffer sb2 = new StringBuffer(inputString());

        sb2.replace(0,2, str1.substring(0,2));
        sb2.append(str1.substring(0, 2));

        String str2 = sb2.toString();

        System.out.println(str2);
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
