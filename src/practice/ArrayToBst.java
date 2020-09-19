package practice;

import structure.TreeNode;

public class ArrayToBst {

//    TreeNode help(int[]nums, int l, int r){
//        StringBuilder sb = new StringBuilder();
//        if(l>=r)
//            return null;
//        int mid=(l+r)/2;
//        TreeNode root=new TreeNode(mid);
//        root.left=help(nums,l,mid);
//        root.right=help(nums,mid,r);
//
//        return root;
//    }
    public int countSubstrings(String s) {
        char[]chars=s.toCharArray();
        int count=0;
        for(int i=0;i<chars.length;i++) {

        }
        return  count;
    }


    public static void main(String[] args) {
        int[] ints=new int[]{1,2,4,6,7,8,11};
        System.out.println(new ArrayToBst().countSubstrings("aab"));
    }



}
