package jungol.jungol_loop3;

public class 반복제어문3_연습문제4 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            for(int z = 1 ; z <= 5-i;z++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
