

/* Binary Search Tree:
            For each node in the tree. 
            all the node in its left subtree or right subtree are less than or equal to 2
            and all the keys in the right subtree are greater. 
 */


 public class Q2_a_BinaryTree {
    Object root;
    Q2_a_BinaryTree left, right;

    public Q2_a_BinaryTree(Object root) {
        this.root = root;
    }

    public Q2_a_BinaryTree() {
        this.root = null;
    }

    public Q2_a_BinaryTree(Object root, Q2_a_BinaryTree left, Q2_a_BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public void setRoot(Object root) {
        this.root = root;
    }

    public void setLeft(Q2_a_BinaryTree left) {
        this.left = left;
    }

    public void setRight(Q2_a_BinaryTree right) {
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

    public static void preOrder(Q2_a_BinaryTree BTree) {
        if (BTree == null) {
            return;
        }

        System.out.print(BTree.root+" ");
        preOrder(BTree.left);
        preOrder(BTree.right);
    }


    public static void PostOrder(Q2_a_BinaryTree Btree) {//left right root
        if (Btree == null) {
            return;
        }
        PostOrder(Btree.left);
        PostOrder(Btree.right);
        System.out.print(Btree.root+" ");
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

  
public static void main(String[] args) {

        Q2_a_BinaryTree teD = new Q2_a_BinaryTree();
        Q2_a_BinaryTree treeX = new Q2_a_BinaryTree("X");
        Q2_a_BinaryTree treeD = new Q2_a_BinaryTree("D"); //    A */
        Q2_a_BinaryTree treeE = new Q2_a_BinaryTree("E"); // B       C
        Q2_a_BinaryTree treeB = new Q2_a_BinaryTree("B"); //       D   E
        Q2_a_BinaryTree treeC = new Q2_a_BinaryTree("C", treeD, treeE);
        Q2_a_BinaryTree tree = new Q2_a_BinaryTree("A", treeB, treeC);
        System.out.println(tree.height());
        preOrder(tree);
        System.out.println();
        PostOrder(tree);
    }
}
