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
}
