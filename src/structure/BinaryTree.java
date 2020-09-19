package structure;

import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//二叉树
public class BinaryTree {

    private Node root;

//插入
    public  void add(int element){
        Node node = new Node(element);
        if (this.root==null){
            this.root=node;
            return;
        }
        Node current=root;
        Node parent=null;
        while (null!=current){
            if (element>current.value){
                parent=current;
                current=current.right;
            }else if (element<current.value){
                parent=current;
                current=current.left;
            }else {
                System.out.println("不能与父节点的值相等:"+element);
                return;
            }
        }
        if (element<parent.value){
            parent.left=node;
        }
        else if (element>parent.value){
            parent.right=node;
        }
    }
//层级遍历
    public static void paint(Node node){
        Queue<Node> queue=new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i=0;i<size;i++){
                Node poll = queue.poll();
                if (poll!=null) {
                    queue.offer(poll.left);
                    queue.offer(poll.right);
                    System.out.print( poll.value+"\t");
                }else {
                    System.out.print((Object)null);
                }
            }
            System.out.println("");

        }
    }

//中序遍历
    public static void order(Node node){
        if (node==null){
            return;
        }
        order(node.left);
        System.out.println(node.value);
        order(node.right);
    }

//内部类：节点
    static class Node{
        Node right;
        Node left;
        int value;

        public Node(int value) {
            this.value = value;
            this.right=null;
            this.left=null;
        }
    }



    public static void main(String[] args) {
        int[] ints=new int[]{5,6,7,2,3,8,9,1,12,2,4};
        BinaryTree binaryTree = new BinaryTree();
        Arrays.stream(ints).forEach(binaryTree::add);
        List<Integer> list=new LinkedList<>();

        paint(binaryTree.root);
        order(binaryTree.root);
    }
}
