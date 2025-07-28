package jungol.jungol_loop3;

public class 반복제어문3_자가진단5 {
    public static void main(String[] args) {
        for(int i = 5 ; i >= 1 ; i = i - 2){
            for(int z = (int)(9-i)/2 ; z >= 1 ; z--){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
