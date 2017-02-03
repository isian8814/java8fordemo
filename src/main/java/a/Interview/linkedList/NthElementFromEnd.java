package a.Interview.linkedList;

/**
 * Created by minchanglong on 2/1/17.
 */
// Java program to find n'th node from end using slow and
// fast pointers
/* Linked List node */
class InnerNode {
    int data;
    InnerNode next;
    InnerNode(int d) {
        data = d;
        next = null;
    }
}

public class NthElementFromEnd {
    InnerNode head; // head of the list
    /* Function to get the nth node from end of list */
    void printNthFromLast(int n) {
        InnerNode main_ptr = head;
        InnerNode ref_ptr = head;

        int count = 0;
        if (head != null)
        {
            while (count < n)
            {
                if (ref_ptr == null)
                {
                    System.out.println(n+" is greater than the no "+
                            " of nodes in the list");
                    return;
                }
                ref_ptr = ref_ptr.next;
                count++;
            }
            while (ref_ptr != null)
            {
                main_ptr = main_ptr.next;
                ref_ptr = ref_ptr.next;
            }
            System.out.println("InnerNode no. "+n+" from last is "+
                    main_ptr.data);
        }
    }

    static InnerNode solution(InnerNode head, int nTh) {
        if (head != null) {
            InnerNode slow = head;
            InnerNode fast = head;

            while (fast != null && nTh > 0) {
                fast = fast.next;
                nTh--;
            }

            while (slow != null && fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }

        return null;
    }

    /* Inserts a new InnerNode at front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the InnerNode &
                  Put in the data*/
        InnerNode new_node = new InnerNode(new_data);

        /* 3. Make next of new InnerNode as head */
        new_node.next = head;

        /* 4. Move the head to point to new InnerNode */
        head = new_node;
    }

    /*Drier program to test above methods */
    public static void main(String [] args) {
        NthElementFromEnd llist = new NthElementFromEnd();
        llist.push(35);
        llist.push(15);
        llist.push(4);
        llist.push(20);

        llist.printNthFromLast(3);


        /**
         * Solution
         */
        InnerNode head1 = new InnerNode(20);
        InnerNode head = head1;
        head.next = new InnerNode(4);
        head = head.next;
        head.next = new InnerNode(15);
        head = head.next;
        head.next = new InnerNode(35);

        System.out.println(solution(head1, 3).data);
    }
}
