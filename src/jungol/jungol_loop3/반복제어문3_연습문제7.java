package jungol.jungol_loop3;

public class 반복제어문3_연습문제7 {
    public static void main(String[] args) {
        int first_num = 1;
        int a_ascii = 97;

        for (int i = 1 ; i <= 4 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.printf("%c ", a_ascii);
                a_ascii++;
            }
            for (int z = 5-i ; z >= 1 ; z--){
                System.out.printf("%d ", first_num);
                first_num++;
            }
            System.out.println();
        }
    }
}
