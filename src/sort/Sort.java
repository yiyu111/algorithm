package sort;

import java.util.Arrays;

public class Sort {


    public static void test(int[] arr){
        boolean bool=true;
        for (int i = 0; i < arr.length&&bool; i++) {
            bool=false;
            for (int j = 0; j <arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    bool=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ints=new int[]{6,5,6,7,2,4,8,9,10,12,2,4};
        test(ints);
        Arrays.stream(ints).forEach(System.out::println);
    }


}
