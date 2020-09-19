package practice;

import java.util.Arrays;

public class IntegerMax {

    public static final boolean[] b=new boolean[]{false,false,false,false,true,true,true,true};

    static boolean isBadVersion(int n){

            return b[n-1];

    }

        public static int firstBadVersion(int n) {
            int mid=n/2;
            if(isBadVersion(mid)){
                if(!isBadVersion(mid-1)){
                    return mid;
                }else{
                    firstBadVersion(mid);
                }
            }else{
                if(isBadVersion(mid+1)){
                    return mid+1;
                }else{
                    firstBadVersion(mid);

                }
            }return 0;
        }

    public static void main(String[] args) {
        int[] ints=new int[]{6,7,2,4,8,9,10,12,2,9};
        System.out.println(firstBadVersion(6));
    }
}
