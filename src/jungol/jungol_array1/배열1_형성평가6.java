package jungol.jungol_array1;

import java.util.Scanner;

public class 배열1_형성평가6 {
    public static void main(String[] args) {
        char[] str = {'J', 'U', 'N', 'G', 'O', 'L'};
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        for(int i = 0 ; i < str.length ; i++){
            if(str[i] == ch){
                System.out.println(i);
                break;
            } else if(i == 5 && str[i] != ch){
                System.out.println("none");
            } else {
                continue;
            }

        }
    }
}
