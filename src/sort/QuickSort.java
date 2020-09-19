package sort;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int l, int r, int[]arr){
        int pivot=arr[l];
        int position=l;
        for (int i = l+1; i < arr.length; i++) {
            if (arr[i]<pivot){
                position++;
                int temp=arr[position];
                arr[position]=arr[i];
                arr[i]=temp;
            }
        }
        arr[l]=arr[position];
        arr[position]=pivot;
        return position;
    }

    public static void test(int l, int r, int[]arr){
        if (l>=r){
            return;
        }
        int position = partition(l, r, arr);
        test(l,position-1,arr);
        test(position+1,r,arr);
    }

    public static void main(String[] args) {
        int[] ints=new int[]{6,5,6,7,2,4,0,9,10,12,2,4};
        test(0,ints.length-1,ints);
        System.out.println(Arrays.toString(ints));
    }


}
