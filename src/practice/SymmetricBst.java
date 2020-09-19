package practice;

import javax.swing.tree.TreeNode;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricBst {

    public static boolean test(TreeNode root){

        return  true;
    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        while (!q.isEmpty()){
        System.out.println(q.remove());
    }
    }





}
