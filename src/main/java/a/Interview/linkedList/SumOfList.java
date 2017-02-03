package a.Interview.linkedList;

/**
 * Created by minchanglong on 2/1/17.
 */
public class SumOfList {

    /**
     * Recursive
     * @param args
     */
    public static void main(String[] args) {
        Node l1 = new Node(3);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(9);
        l2.next = new Node(4);
        l2.next.next = new Node(9);

        int l1Len = countLength(l1);
        int l2Len = countLength(l2);
        if ( l1Len > l2Len) {
            l2 = appendZeroInfront(l2, l1Len - l2Len);
        } else if (countLength(l1) < countLength(l2)) {
            l1 = appendZeroInfront(l1, l2Len - l1Len);
        }

        printNode(l1);
        printNode(l2);

        Node sumNode = new Node(0);
        Node carry = addTwoNumbersRecursive(sumNode, l1, l2);
        if (carry.data != 0) {
            carry.next = sumNode.next;
            sumNode.next = carry;
        }
        printNode(sumNode.next);

//        Node ll1 = new Node(2);
//        ll1.next = new Node(4);
//        ll1.next.next = new Node(3);
//
//        Node ll2 = new Node(9);
//        ll2.next = new Node(6);
//        ll2.next.next = new Node(9);
//        printNode(addTwoNumbersInorder1(ll1, ll2));
//        printNode(addTwoNumbersInorder2(ll1, ll2));
    }

    /**
     * Input: (2 -> 4 -> 3) + (9 -> 6)
     * Output: 1 -> 1 -> 4
     * @param l1
     * @param l2
     * @return
     */
    public static Node addTwoNumbersInorder1(Node l1, Node l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        Node headOfResult = new Node(0);
        Node finalResult = headOfResult;
        int carry = 0;
        int sum;
        while (l1 != null && l2 != null) {
            sum = l1.data + l2.data + carry;
            carry = sum / 10;

            headOfResult.next = new Node(sum % 10);
            headOfResult = headOfResult.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) {
            sum = l1.data + carry;
            headOfResult.next = new Node(sum % 10);
            carry = sum / 10;
            headOfResult = headOfResult.next;
        } else if (l2 != null) {
            sum = l2.data + carry;
            headOfResult.next = new Node(sum % 10);
            carry = sum / 10;
            headOfResult = headOfResult.next;
        }

        if (carry != 0) {
            headOfResult.next = new Node(carry);
        }

        return finalResult.next;
    }

    public static Node addTwoNumbersInorder2(Node l1, Node l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        Node newHead = new Node(0);
        Node headPlaceHolder = newHead;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum = sum + l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum = sum + l2.data;
                l2 = l2.next;
            }

            sum = sum + carry;
            carry = sum / 10;
            sum = sum % 10;

            newHead.next = new Node(sum);
            newHead = newHead.next;
        }

        if (carry != 0) {
            newHead.next = new Node(carry);
        }

        return headPlaceHolder.next;
    }

    public Node addTwoNumbers(Node l1, Node l2) {
        int carry =0;

        Node newHead = new Node(0);
        Node p1 = l1, p2 = l2, p3=newHead;

        while(p1 != null || p2 != null){
            if(p1 != null){
                carry += p1.val;
                p1 = p1.next;
            }

            if(p2 != null){
                carry += p2.val;
                p2 = p2.next;
            }

            p3.next = new Node(carry%10);
            p3 = p3.next;
            carry /= 10;
        }

        if(carry==1)
            p3.next=new Node(1);

        return newHead.next;
    }

    /**
     * Input: (3 -> 4 -> 3) + (6 -> 4)
     * Output: 9 -> 0 -> 7
     * @param l1
     * @param l2
     * @return
     */
    private static Node addTwoNumbersRecursive(Node sumNode, Node l1, Node l2) {
        if (l1 == null && l2 == null) {
            return new Node(0);
        }

        int sum = l1.val + l2.val;
        Node carry = new Node(0);
        if (l1.next != null && l2.next != null) {
            carry = addTwoNumbersRecursive(sumNode, l1.next, l2.next);
        }

        sum = sum + carry.val;
        Node node = new Node(sum % 10);
        node.next = sumNode.next;
        sumNode.next = node;

        return new Node(sum / 10);
    }

    private static Node appendZeroInfront(Node n, int diff) {
        Node head = n;

        while(diff > 0) {
            Node node = new Node(0);
            node.next = head;
            head = node;
            diff--;
        }

        return head;
    }

    private static int countLength(Node n) {
        if (n == null) {
            return 0;
        }

        int count = 0;
        while (n != null) {
            count++;
            n = n.next;
        }

        return count;
    }

    private static void printNode(Node n) {
        if (n == null) {
            System.out.println("Null Node");
        }

        while (n != null) {
            System.out.print(n.val);
            if (n.next != null)
                System.out.print("->");
            n = n.next;
        }

        System.out.println();
    }
}
