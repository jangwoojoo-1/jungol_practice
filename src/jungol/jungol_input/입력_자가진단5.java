package jungol.jungol_input;

public class 입력_자가진단5 {
    public static void main(String[] args) {
        double yard, inch;
        yard = 2.10;
        inch = 10.5;

        double yard_to_cm = yard*91.44;
        double inch_to_cm = inch*2.54;
        System.out.printf("%4.1fyd = %5.1fcm\n%4.1fin = %5.1fcm",
                yard, yard_to_cm, inch, inch_to_cm);


    }
}
