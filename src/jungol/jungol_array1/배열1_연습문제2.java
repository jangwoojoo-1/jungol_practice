package jungol.jungol_array1;

public class 배열1_연습문제2 {
    public static void main(String[] args) {
        char[] char_array = new char[26];

        for (int i = 0 ; i < char_array.length ; i++){
            char_array[i] = (char)('A' + i);
        }

        for (int i = char_array.length-1 ; i >= 0 ; i--) {
            System.out.printf("%c ", char_array[i]);
        }
    }
}
