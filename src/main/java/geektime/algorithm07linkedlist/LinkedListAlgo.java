package geektime.algorithm07linkedlist;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:Algorithm
 * PackageName: geektime.algorithm07linkedlist
 * Date: 2019/2/12 14:29
 * * 1) 单链表反转
 * * 2) 链表中环的检测
 * * 3) 两个有序的链表合并
 * * 4) 删除链表倒数第n个结点
 * * 5) 求链表的中间结点
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

    // Done: 2019/2/12 检测链表是否有环
    public static boolean checkCircle(Node list) {
        if (list == null) {
            return false;
        }
        Node fast = list.next;
        Node slow = list;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.getData() == slow.getData()) {
                return true;
            }
        }
        return false;
    }

    // 有序链表合并
    public static Node mergeSortedLists(Node la, Node lb) {
        if (la == null) {
            return lb;
        }
        if (lb == null) {
            return la;
        }
        Node p = la;
        Node q = lb;
        Node head = null;
        if (p.getData() < q.getData()) {
            head = p;
            p = p.next;
        } else {
            head = q;
            q = q.next;
        }

        Node r = head;

        while (p != null && q != null) {
            if (p.getData() < q.getData()) {
                r.next = p;
                p = p.next;
            } else {
                r.next = q;
                q = q.next;
            }
            r = r.next;
        }
        if (p != null) {
            r.next = p;
        }
        if (q != null) {
            r.next = q;
        }
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1, null);
        Node node2 = new Node(3, null);
        Node node3 = new Node(5, null);
        node1.next = node2;
        node2.next = node3;
//        Node node = reverse(node1);

        Node node4 = new Node(2, null);
        Node node5 = new Node(4, null);
        Node node6 = new Node(6, null);
        node4.next = node5;
        node5.next = node6;
        Node node = mergeSortedLists(node1, node4);

        while (node != null) {
            System.out.println(node.getData());
            node = node.next;
        }
    }


    public static class Node {
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
