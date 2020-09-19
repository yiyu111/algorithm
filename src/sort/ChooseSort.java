package sort;

import java.util.Arrays;

public class ChooseSort {

    public static void test(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j =i; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
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
