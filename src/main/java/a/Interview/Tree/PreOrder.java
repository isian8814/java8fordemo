package a.Interview.Tree;
import java.util.Stack;

/**
 * Created by minchanglong on 1/19/17.
 */
public class PreOrder {

    void preOrderLoop(Node root) {
        StringBuffer outputBuf = new StringBuffer();
        if (root != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                Node node = stack.pop();
                if (node != null) {
                    outputBuf.append(node.data + " ");
                }

                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left != null) {
                    stack.push(node.left);
                }

            }
        }

        String output = outputBuf.toString();
        System.out.println(output.substring(0, output.length() - 1));
    }

    void solution(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node top = stack.pop();

            if (top.right != null) {
                stack.push(top.right);
            }

            if (top.left != null) {
                stack.push(top.left);
            }
        }
    }

    void preOrderRecursive(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
        }

        if (root.left != null) {
            preOrderRecursive(root.left);
        }

        if (root.right != null) {
            preOrderRecursive(root.right);
        }
    }

}
