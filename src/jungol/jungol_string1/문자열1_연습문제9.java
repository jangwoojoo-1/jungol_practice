package jungol.jungol_string1;

import java.util.Scanner;

public class 문자열1_연습문제9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string = inputString();
        leftRotation(string);
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

    public static void leftRotation(String s){
        boolean loop = true;
        int i = 0;
        while(loop){
            String first_string = s.substring(1);
            s = first_string + s.charAt(0);
            System.out.println(s);
            i++;
            if(i > s.length()-1) loop = false;
        }
    }
}
