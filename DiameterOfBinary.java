public class DiameterOfBinary {
    static int diameter=0;
    public static int dOBT(TreeNode root){
        height(root);
        return diameter;
    }
    private static int height(TreeNode node){
        if(node==null)return 0;
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        diameter=Math.max(diameter, leftHeight+rightHeight);
        return 1+Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(diameter);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println(dOBT(root));
    }
}

