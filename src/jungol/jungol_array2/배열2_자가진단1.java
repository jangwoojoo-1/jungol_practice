package jungol.jungol_array2;

import java.util.Scanner;

public class 배열2_자가진단1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] UpperEng = new int[26];
        int n = 65;

        //2개는 무조건 입력
        for(int i = 0 ; i < 2 ; i++){
            n = (int)sc.next().charAt(0);
            if (n >= 65 && n <= 90){
                UpperEng[n-65]++;
            } else{
                while(n > 90 || n < 65){
                    n = sc.nextInt();
                }
                UpperEng[n-65]++;
            }
        }

        int repeat = 2;

        while((n >= 65 && n <= 90) || repeat <= 100){
            n = (int)sc.next().charAt(0);
            if (n >= 65 && n <= 90){
                UpperEng[n-65]++;
                repeat++;
            } else{
                break;
            }
        }

        for (int i = 0; i < UpperEng.length; i++) {
            if(UpperEng[i] != 0){
                System.out.printf("%c : %d\n", 65+i, UpperEng[i]);
            } else {
                continue;
            }
        }

    }
}
