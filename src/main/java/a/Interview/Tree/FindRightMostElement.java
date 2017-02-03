package a.Interview.Tree;

/**
 * Created by minchanglong on 2/1/17.
 */
public class FindRightMostElement {
    /**
     * Recursively
     * @param root
     * @return
     */
    public Node findLastElement(Node root) {
        if (root == null) {
            return null;
        }
        if (root.right == null) {
            return root;
        }
        return findLastElement(root.right);
    }

    /**
     * Iteratively
     * @param root
     * @return
     */
    public Node findLastElementIteratively(Node root) {
        if(root == null) {
            return null;
        }
        while(root.right != null)
            root = root.right;
        return root;
    }
}
