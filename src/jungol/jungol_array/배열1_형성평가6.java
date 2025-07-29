package jungol.jungol_array;

import java.util.Scanner;

public class 배열1_형성평가6 {
    public static void main(String[] args) {
        char[] str = {'J', 'U', 'N', 'G', 'O', 'L'};
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        for(int i = 0 ; i < 6 ; i++){
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
