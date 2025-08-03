package jungol.jungol_string2;

import java.util.Scanner;

public class 문자열2_자가진단10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String s = inputString();
            int num1 = stringToInt(s);
            double double1 = stringToDouble(s);
            if (num1 == 0 || double1 == 0) continue;

            System.out.printf("%d \n%.2f \n", num1*2, double1);

            break;
        }
    }

    public static String inputString(){
        while(true){
            //System.out.print("문자열을 입력하세요. ");
            String string = sc.next();
            if(string.length() > 20){
                continue;
            }
            return string;
        }
    }

    public static int stringToInt(String s){
        try{
            StringBuffer sb1 = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    sb1.append(s.charAt(i));
                } else {
                    // 숫자 값을 가진 이후면 break
                    if (sb1.length() > 0) break;
                }
            }
            s = sb1.toString();
            return Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println("입력된 문자를 정수로 변환할 수 없습니다.");
            return 0;
        }
    }

    public static double stringToDouble(String s) {
        try {
            StringBuffer sb1 = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.') {
                    sb1.append(s.charAt(i));
                } else {
                    // 숫자 값을 가진 이후면 break
                    if (sb1.length() > 0) break;
                }
            }
            s = sb1.toString();

            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            System.out.println("입력된 문자를 실수로 변환할 수 없습니다.");
            return 0.0;
        }
    }

}
