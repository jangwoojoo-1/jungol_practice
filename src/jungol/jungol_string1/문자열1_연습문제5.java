package jungol.jungol_string1;

import java.nio.charset.StandardCharsets;

public class 문자열1_연습문제5 {
    public static void main(String[] args) {
        String str = "우리나라 대한민국!";
        System.out.println(str);
        byte[] utf8Bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.printf("위 문자열의 길이는 %d입니다.",utf8Bytes.length);
    }
}
