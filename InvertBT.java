package SkiilsPw.BinaryTrees;

public class InvertBT {
    public static void displayPostBT(TreeNode root){
        if (root == null) {
            return;
        }
        displayPostBT(root.left);
        displayPostBT(root.right);
        System.out.print(root.val + " ");
    }
    public static void invertBT(TreeNode root){
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertBT(root.left);
        invertBT(root.right);
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
        invertBT(a);
        displayPostBT(a);
    }
}
