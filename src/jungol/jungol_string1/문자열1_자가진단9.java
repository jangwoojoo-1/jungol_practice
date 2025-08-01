package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_자가진단9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = inputString();
        rightRotation(string);
    }

    public static String inputString(){
        while(true){
            String string = sc.nextLine();
            if(string.length() > 49){
                continue;
            }
            return string;
        }
    }

    public static void rightRotation(String s){
        boolean loop = true;
        int i = 0;
        while(loop){
            String first_string = s.substring(0, s.length()-1);
            s = s.charAt(s.length()-1) + first_string;
            System.out.println(s);
            i++;
            if(i > s.length()-1) loop = false;
        }
    }
}
