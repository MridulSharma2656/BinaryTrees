package SkiilsPw.BinaryTrees;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class ImplimentationBT {
    static int size = 0;
    static int max = 0;
    static int sum = 0;
    public static void displayPreBT(TreeNode root){
        if (root == null) {
            return;
        }
        size++;
        System.out.print(root.val + " ");
        displayPreBT(root.left);
        displayPreBT(root.right);
    }
    public static void displayInBT(TreeNode root){
        if (root == null) {
            return;
        }
        displayInBT(root.left);
        size++;
        System.out.print(root.val + " ");
        displayInBT(root.right);
    }
    public static void displayPostBT(TreeNode root){
        if (root == null) {
            return;
        }
        displayPostBT(root.left);
        displayPostBT(root.right);
        size++;
        System.out.print(root.val + " ");
    }
    public static int sizeBT(TreeNode root){
        return size;
    }
    public static int levelBT(TreeNode root){
        if (root == null) {
            return 0;
        }
        int level = 1 + Math.max(levelBT(root.left), levelBT(root.right));
        return level;
    }
    public static int maxEle(TreeNode root){
        if (root == null) {
            return 0;
        }
        int max = Math.max(root.val , Math.max(maxEle(root.left),maxEle(root.right)));
        return max;
    }
    public static int sumBT(TreeNode root){
        if (root == null) {
            return 0;
        }
        int sum = root.val + sumBT(root.left) + sumBT(root.right);
        return sum;
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
        System.out.print("Pre order :- ");
        displayPreBT(a);
        System.out.println();
        System.out.print("In order :- ");
        displayInBT(a);
        System.out.println();
        System.out.print("Post order :- ");
        displayPostBT(a);
        System.out.println();
        System.out.println("Size of Binary tree :- " + sizeBT(a));
        System.out.println("Level of BT is " + levelBT(a));
        System.out.println("Height of BT is " + (levelBT(a) - 1));
        System.out.println("Max element of BT is " + maxEle(a));
        System.out.println("Sum of elements is " + sumBT(a));
    }
}
