package practice;

import java.util.*;

public class IncreaseSubsequence {
    List<Integer> temp =new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public void test(int curr,int last,int[]nums){
        if (curr==nums.length){
            if (temp.size()>=2)
                ans.add(new ArrayList<>(temp));
            return;
        }
        if (nums[curr]>=last) {
            temp.add(nums[curr]);
            test(curr + 1, nums[curr], nums);
            temp.remove(temp.size() - 1);
        }
        if (nums[curr]!=last)
            test(curr+1,last,nums);
    }

    public static void main(String[] args) {
        int[] ints = new int[]{11,2,2,5,4};
        IncreaseSubsequence test = new IncreaseSubsequence();
        test.test(0,Integer.MIN_VALUE,ints);
        System.out.println(test.ans);
    }
}
