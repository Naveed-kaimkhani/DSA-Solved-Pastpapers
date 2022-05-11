package DSATask;

 class prepBT {
     Object root;
     prepBT left , right;
    // Object t;
     prepBT(Object root,prepBT left,prepBT right){
         super();
         this.root = root;
         this.left =left;
         this.right = right;
     }
     prepBT(Object root){
         this.root = root;
     }
     public Object getRoot(){
         return root;
     }
     public void setRoot(Object root){
         this.root = root;
     }
     public Object getLeft(){
         return left;
     }
     public void setLeft(prepBT left){
         this.left = left;
     }
     public Object getRight(){
         return  right;
     }
     public void setRight(prepBT right){
         this.right = right;
     }
     //in-order
     public String toString(){
         StringBuffer buf =new StringBuffer("");
         if(left!=null){
             buf.append(left+",");
         }
         buf.append(root);
         if(right!=null){
             buf.append(","+right);
         }
         return buf+" ";
     }
     //pre-order
     /*public String toString(){
         StringBuffer buf =new StringBuffer("");
         buf.append(root);
         if(left!=null){
             buf.append(left+",");
         }
         if(right!=null){
             buf.append(","+right);
         }
         return buf+" ";
     }*/
     //post-order
    /*public String toString(){
         StringBuffer buf =new StringBuffer("");
         if(left!=null){
             buf.append(left+",");
         }
         if(right!=null){
             buf.append(","+right);
         }
         buf.append(root);
         return buf+" ";
     }*/
     private boolean isLeaf(){
        if(left == null && right == null)
            return true;
        else
            return false;
     }
     public int size(){
        if(left==null & right == null){
            return 1;
        }
        if(left==null){
            return 1+right.size();
        }
        if(right==null){
            return 1+ left.size();
        }
        return 1+ left.size()+ right.size();
     }
     public int height(){
        if(root==null){
            return -1;
        }
        int leftnode = 0;
        int rightnode =0;
        if(left==null){
            leftnode=1+left.height();
        }
        if(right==null){
            rightnode=1+right.height();
        }
        return leftnode > rightnode ? leftnode : rightnode;
     }
     public boolean contains(Object t){
        if(root==t)
            return true;
        boolean present=false;
        if(left!=null)
            if(left.toString().contains(t.toString()))
                return true;
            present = left.contains(t);
            if(right!=null){
                if(right.toString().contains(t.toString()))
                    return true;
                present = right.contains(t);
            }
            return present;
     }
     public boolean isFull(){
        if(root==null)
            return true;
        if(left==null && right==null)
            return true;
        if(left!= null && right!=null) {
            return left.isFull() && right.isFull();
        }
        return false;
     }
     //Count-nodes
     public static int CountNodes(prepBT btree){
         if (btree == null){
             return 0;
         }
         int rightCount = CountNodes(btree.right);
         int leftCount = CountNodes(btree.left);
         return rightCount + leftCount + 1;
     }

    public static void main(String[] args) {

         prepBT tree24 = new prepBT("24");
         prepBT tree14 = new prepBT("14");
         prepBT tree87 = new prepBT("87");
         prepBT tree72 = new prepBT("72");
         prepBT tree92 = new prepBT("92");
         prepBT tree76 = new prepBT("76",tree72,tree92);
         prepBT tree42 = new prepBT("42",tree24,tree76);
         tree24.setLeft(tree14);
         tree92.setLeft(tree87);
         prepBT tree153 = new prepBT("153");
         prepBT tree197 = new prepBT("197");
         prepBT tree133 = new prepBT("133");
         prepBT tree176 = new prepBT("176");
         prepBT tree154 = new prepBT("154",tree133,tree176);
         tree133.setRight(tree153);
         tree176.setRight(tree197);
         prepBT tree = new prepBT("95",tree42,tree154);
        System.out.println(tree);
         //System.out.println("LEAF:"+treeC.isLeaf());
         System.out.println("size:"+tree154.size());
        System.out.println("Height of tree:"+tree.height());
        System.out.println("It Contain 95 ? " + tree.contains("95"));
        System.out.println("no of nodes: "+CountNodes(tree));
        //System.out.println("Tree is full ? " + treeC.isFull());
    }
}
