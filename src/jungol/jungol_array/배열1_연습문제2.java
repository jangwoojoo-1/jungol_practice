package jungol.jungol_array;

public class 배열1_연습문제2 {
    public static void main(String[] args) {
        char[] char_array = new char[26];
        int A_ascii = 65;

        for (int i = 0 ; i < 26 ; i++){
            char_array[i] = (char)A_ascii;
            A_ascii++;
        }

        for (int i = 25 ; i >= 0 ; i--){
            System.out.printf("%c ", char_array[i]);
        }
    }
}
