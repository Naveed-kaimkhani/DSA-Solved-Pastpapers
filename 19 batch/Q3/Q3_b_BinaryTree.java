public class Q3_b_BinaryTree {
    Object root;
    Q3_b_BinaryTree left, right;

    public Q3_b_BinaryTree(Object root) {
        this.root = root;
    }

    public Q3_b_BinaryTree() {
        this.root = null;
    }

    public Q3_b_BinaryTree(Object root, Q3_b_BinaryTree left, Q3_b_BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public void setRoot(Object root) {
        this.root = root;
    }

    public void setLeft(Q3_b_BinaryTree left) {
        this.left = left;
    }

    public void setRight(Q3_b_BinaryTree right) {
        this.right = right;
    }

    public Object getRight() {
        return right;
    }

    public Object getLeft() {
        return left;
    }

    public Object getRoot() {
        return root;
    }

    @Override
    public String toString() { // Inorder
        StringBuffer str = new StringBuffer("");
        if (left != null) {
            str.append(left + ",");
        }
        str.append(root);
        if (right != null) {
            str.append("," + right);

        }
        return str + "";
    }

    public static void preOrder(Q3_b_BinaryTree BTree) {
        if (BTree == null) {
            return;
        }

        System.out.println(BTree.root);
        preOrder(BTree.left);
        preOrder(BTree.right);
    }
    public static void PostOrder(Q3_b_BinaryTree Btree) {//left right root
        if (Btree == null) {
            return;
        }
        PostOrder(Btree.left);
        PostOrder(Btree.right);
        System.out.println(Btree.root);
    }
    //height of a tree is the number of edges on the longest path from the root to a leaf
    public int height() {
        if (root == null)
            return -1;
        int leftn = 0, rightn = 0;
        if (left != null)
            leftn = 1 + left.height();
        if (right != null)
            rightn = 1 + right.height();
        return leftn > rightn ? leftn : rightn;
    }

    public boolean contains(Object t) {
        if (root == t)
            return true;
        boolean present = false;
        if (left != null) {
            if (left.toString().contains(t.toString()))
                return true;
            present = left.contains(t);
        }
        if (right != null) {
            if (right.toString().contains(t.toString()))
                return true;
            present = right.contains(t);
        }
        return present;
    }
  
public static void main(String[] args) {

        Q3_b_BinaryTree treeD = new Q3_b_BinaryTree("D"); 
        Q3_b_BinaryTree treeE = new Q3_b_BinaryTree("E"); 
        Q3_b_BinaryTree treeB = new Q3_b_BinaryTree("B"); 
        Q3_b_BinaryTree treeC = new Q3_b_BinaryTree("C", treeD, treeE);
        Q3_b_BinaryTree tree = new Q3_b_BinaryTree("A", treeB, treeC);
        System.out.println(tree.height());
        System.out.println(tree.contains("B"));
    }
}