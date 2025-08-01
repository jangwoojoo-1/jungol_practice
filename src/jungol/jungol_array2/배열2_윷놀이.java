package jungol.jungol_array2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 배열2_윷놀이 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] sticks = new int[3][4]; // 결과 저장 배열
        for(int i = 0 ; i < sticks.length ; i++){
            sticks[i] = throwSticks();
        }


    }

    public static int[] throwSticks(){
        int[] sticks = new int[4];
        int i = 0;
        while (true){
            try{
                int n = sc.nextInt();
                if(n != 0 || n != 1){
                    continue;
                }
                sticks[i++] = n;
            } catch(InputMismatchException e){
                System.out.println("숫자만 입력해주세요.");
            }
        }
    }

    public static void descResult(){

    }
}
