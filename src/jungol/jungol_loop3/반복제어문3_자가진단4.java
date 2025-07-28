package jungol.jungol_loop3;

public class 반복제어문3_자가진단4 {
    public static void main(String[] args) {
        for(int i = 3 ; i >= 1 ; i--){
            for(int z = 1 ; z <= 3-i;z++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
