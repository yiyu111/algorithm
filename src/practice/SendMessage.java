package practice;
/*
* #07
* */
public class SendMessage {

    public static int minTime(int[] time, int m) {
        if (time.length<=m){
            return 0;
        }
        int sum=0;
        for (int i = 0; i < time.length; i++) {
            sum+=time[i];
            for (int j = 0; j < time.length-1-i&&i<m; j++) {
                if (time[j]<time[j+1]){
                    int temp=time[j];
                    time[j]=time[j+1];
                    time[j+1]=temp;
                }
                sum-=time[j+1];
            }
        }
        if (sum%m==0){
            return sum/m;
        }else {
            return sum/m+1;
        }

    }

    public static void main(String[] args) {
        int[] a=new int[]{8,6,7};
        System.out.println(minTime(a,4));
    }











}
