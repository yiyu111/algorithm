package sort;

import java.util.Arrays;

public class InsertSort {

    public static void test(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            for (int j = i-1; j >-1; j--) {
                if (arr[j]<=current){
                    arr[j+1]=current;
                    break;
                }else {
                    arr[j+1]=arr[j];
                    if (j==0){
                        arr[0]=current;
                    }
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
