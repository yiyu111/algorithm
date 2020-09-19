package practice;
//1048
public class ArrSums {

    public static int[]  test(int[] arr){
        int[]s=new int[arr.length];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            s[i]=sum;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,5,7,6,4,5};
        System.out.println(test(arr));
    }



}
