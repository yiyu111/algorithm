package structure;

public class LinkedArray {
    Node head;
    Node tail;


    public void add(int i){
        Node node = new Node(i);
        if (this.head==null){
            this.head=node;
            this.tail=node;
            head.next=tail;
            return;
        }
        tail.next=node;
        tail=node;
    }
    public void order(Node node){
        if (node==null){
            return;
        }
        order(node.next);
        System.out.println(node.value);
    }


    class Node{
        Node next;
        Node prev;
        int value;

        public Node(int value) {
            this.next = null;
            this.prev = null;
            this.value = value;
        }
    }
    static int  count=0;

//    移除节点
    void remove(Node node,int i){
        if (node==null)
            return;
        remove(node.next,i);
        count++;
        if (count==i)
            node.next=node.next.next;
    }


    public static void main(String[] args) {
        LinkedArray a = new LinkedArray();
        int i=10;
        while (i>0) {
            a.add(i);
            i--;
        }

        a.remove(a.head,3);
        a.order(a.head);

    }
}
