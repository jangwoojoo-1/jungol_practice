package jungol.jungol_array2;

public class 배열2_형성평가4 {

    public static void main(String[] args) {
        Integer[][] numArr = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};

        int total = 0;

        for (Integer[] ints : numArr) {
            for (Integer i : ints) {
                System.out.printf("%d ", i);
                total += i;
            }
            System.out.println();
        }

        System.out.println(total);
    }
}
