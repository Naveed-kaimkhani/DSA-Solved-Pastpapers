public class BinaryTree {
    Object root;
    BinaryTree left, right;

    public BinaryTree(Object root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public void setRoot(Object root) {
        this.root = root;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public void setRight(BinaryTree right) {
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

   
    public static int CountNodes(BinaryTree Btree) {
        if (Btree == null) {
            return 0;
        }
        int rightCount = CountNodes(Btree.right);
        int leftCount = CountNodes(Btree.left);
        return rightCount + leftCount + 1;
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

        BinaryTree teD = new BinaryTree();
        BinaryTree treeX = new BinaryTree("X");
        BinaryTree treeH = new BinaryTree("H");
        BinaryTree treeZ = new BinaryTree("Z");
        BinaryTree treeD = new BinaryTree("D"); 
        BinaryTree treeE = new BinaryTree("E"); 
        BinaryTree treeB = new BinaryTree("B"); 
        BinaryTree treeC = new BinaryTree("C", treeD, treeE);
        BinaryTree tree = new BinaryTree("A", treeB, treeC);
        treeE.setRight(treeX);
        treeX.setRight(treeH);
        treeH.setRight(treeZ);
        System.out.println("Height of tree: "+tree.height());
        System.out.println("No. of Nodes: "+CountNodes(tree));
       
    }
}