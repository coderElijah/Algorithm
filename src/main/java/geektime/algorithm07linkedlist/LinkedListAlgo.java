package geektime.algorithm07linkedlist;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: geektime.algorithm07linkedlist
 * Date: 2019/2/12 14:29
 */
public class LinkedListAlgo {

    // Done: 2019/2/12 单链表反转
    public static Node reverse(Node list) {
        Node head = null;
        Node pre = null;
        Node current = list;
        while (current != null) {
            Node next = current.next;
            if (next == null) {
                head = current;
            }
            current.next = pre;
            pre = current;
            current = next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        node1.next = node2;
        node2.next = node3;
        Node node = reverse(node1);
        while (node != null) {
            System.out.println(node.getData());
            node = node.next;
        }
    }




    public static class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
