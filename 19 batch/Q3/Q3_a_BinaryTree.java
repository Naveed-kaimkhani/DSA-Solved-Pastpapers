

/* Binary Search Tree:
            For each node in the tree. 
            all the node in its left subtree or right subtree are less than or equal to 2
            and all the keys in the right subtree are greater. 
 */


public class Q3_a_BinaryTree {
    Object root;
    Q3_a_BinaryTree left, right;

    Q3_a_BinaryTree(Object root) {
        this.root = root;
    }

   Q3_a_BinaryTree() {
        this.root = null;
    }

    Q3_a_BinaryTree(Object root, Q3_a_BinaryTree left, Q3_a_BinaryTree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public void setRoot(Object root) {
        this.root = root;
    }

    public void setLeft(Q3_a_BinaryTree left) {
        this.left = left;
    }

    public void setRight(Q3_a_BinaryTree right) {
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

    public static void preOrder(Q3_a_BinaryTree BTree) {
        if (BTree == null) {
            return;
        }

        System.out.print(BTree.root+" ");
        preOrder(BTree.left);
        preOrder(BTree.right);
    }


    public static void PostOrder(Q3_a_BinaryTree Btree) {//left right root
        if (Btree == null) {
            return;
        }
        PostOrder(Btree.left);
        PostOrder(Btree.right);
        System.out.print(Btree.root+" ");
    }



  
public static void main(String[] args) {

        Q3_a_BinaryTree teD = new Q3_a_BinaryTree();
        Q3_a_BinaryTree treej = new Q3_a_BinaryTree("J");
        Q3_a_BinaryTree treek = new Q3_a_BinaryTree("K");
        Q3_a_BinaryTree treef = new Q3_a_BinaryTree("F",treej,treek);
        Q3_a_BinaryTree treeE = new Q3_a_BinaryTree("E");
        Q3_a_BinaryTree treeL = new Q3_a_BinaryTree("L");
        Q3_a_BinaryTree treeM = new Q3_a_BinaryTree("M");

        Q3_a_BinaryTree treeB = new Q3_a_BinaryTree("B",treeE,treef); //    A */
        Q3_a_BinaryTree treeC = new Q3_a_BinaryTree("C",treeL,treeM);
        Q3_a_BinaryTree treeD = new Q3_a_BinaryTree("D",treeC,treeE); //       D   E
        

        Q3_a_BinaryTree tree = new Q3_a_BinaryTree("A", treeB, treeD);
        
        preOrder(tree);
        System.out.println();
        PostOrder(tree);
    }
}
