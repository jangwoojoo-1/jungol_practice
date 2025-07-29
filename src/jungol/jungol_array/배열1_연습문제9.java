package jungol.jungol_array;

public class 배열1_연습문제9 {
    public static void main(String[] args) {
        int[] num_array = {95, 75, 85, 100, 50};

        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4-i ; j++){
                if(num_array[j] > num_array[j+1]){
                    int temp = num_array[j];
                    num_array[j] = num_array[j+1];
                    num_array[j+1] = temp;
                }
            }
        }

        for(int i = 0 ; i < 5 ; i++){
            System.out.print(num_array[i] + " ");
        }
    }
}
