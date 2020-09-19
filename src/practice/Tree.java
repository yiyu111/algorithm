package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tree {
    static List aa=new ArrayList<Integer>();

    public static boolean removeDuplicates(String s) {
        String[] strings = s.toLowerCase().split("\\W*");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i]!=strings[strings.length-1-i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,4,5};
        String aa="A man, a plan, a canal: Panama";
        removeDuplicates(aa);
    }
}
