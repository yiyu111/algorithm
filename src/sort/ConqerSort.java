package sort;

import java.util.Arrays;

public class ConqerSort {

    public static void divided(int[]arr,int l,int r){


    }
    public static void sort(int[]arr,int l, int r){
        if (r-l<=1){
            if (arr[l]>arr[r]){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }return;
        }
        int mid=(l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid,r);
    }

    public static void main(String[] args) {
        int[] ints=new int[]{6,5,6,7,2,4,8,9,10,12,2,4};
        sort(ints,0,ints.length-1);
        Arrays.stream(ints).forEach(System.out::println);
    }

}
