package a.Interview.linkedList;

/**
 * Created by minchanglong on 1/19/17.
 */
public class ReverseLinkedList {
    Node Reverse(Node head) {
        Node currNode = head;
        Node nextNode = null;
        Node prevNode = null;

        while(currNode!=null){
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
        return head;
    }

    static Node solution(Node head) {
        Node dummyNode = new Node(0);
        Node current = head;

        while (head != null) {
            head = head.next;
            current.next = dummyNode.next;
            dummyNode.next = current;
            current = head;
        }

        return dummyNode.next;
    }

    static void printList(Node head) {
        while (head != null) {
            if (head.next != null) {
                System.out.print(head.data + "->");
            } else {
                System.out.print(head.data);
            }

            head = head.next;
        }
        System.out.println();
    }

    public static void main(String [] args) {
        /**
         * Solution
         */
        Node head1 = new Node(20);
        Node head = head1;
        head.next = new Node(4);
        head = head.next;
        head.next = new Node(15);
        head = head.next;
        head.next = new Node(35);

        printList(solution(head1));

    }
}
