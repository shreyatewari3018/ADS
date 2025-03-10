import java.util.*;

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int x){val=x;}
}
public class Leetcode94 {
    public static List<Integer>inOrderTraver(TreeNode root){
        List<Integer>res=new ArrayList<>();
        Stack<TreeNode>stack= new Stack<>();
        TreeNode curr=root;
        while(curr!=null||!stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        System.out.println(inOrderTraver(root));
    }
}