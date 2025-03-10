public class MaximumHeight {
    public static int maxdep(TreeNode root){
        if(root==null)return 0;
        return 1+Math.max(maxdep(root.left),maxdep(root.right));
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(maxdep(root));
    }
    
}
