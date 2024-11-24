package SkiilsPw.BinaryTrees;

public class SameBT {
    public static void displayPostBT(TreeNode root){
        if (root == null) {
            return;
        }
        displayPostBT(root.left);
        displayPostBT(root.right);
        System.out.print(root.val + " ");
    }
    public static boolean sameTree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;
        if(sameTree(root1.left, root2.left) == false) return false;
        if(sameTree(root1.right, root2.right) == false) return false;
        return true;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        TreeNode j = new TreeNode(10);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        e.right = i;
        g.right = j;
        displayPostBT(a);
        System.out.println();
        TreeNode a1 = new TreeNode(1);
        TreeNode b2 = new TreeNode(2);
        TreeNode c3 = new TreeNode(3);
        TreeNode d4 = new TreeNode(4);
        TreeNode e5 = new TreeNode(5);
        TreeNode f6 = new TreeNode(6);
        TreeNode g7 = new TreeNode(7);
        TreeNode h8 = new TreeNode(8);
        TreeNode i9 = new TreeNode(9);
        // TreeNode j0 = new TreeNode(10);
        a1.left = b2;
        a1.right = c3;
        b2.left = d4;
        b2.right = e5;
        c3.left = f6;
        c3.right = g7;
        d4.left = h8;
        e5.right = i9;
        // g7.right = j0;
        displayPostBT(a1);
        System.out.println();
        if (sameTree(a, a1) == true) {
            System.out.println("It is a same Binary Tree");
        }
        else System.out.println("Not a same Binary tree");
    }
}
