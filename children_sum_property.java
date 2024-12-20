class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        boolean ans=helper(root);
        return ans ? 1 : 0;
        
    }
    public static boolean helper(Node root){
        if(root==null || (root.left== null && root.right==null)){
            return true;
        }
        if(root.left== null){
            if(root.data!=root.right.data){
                return false;
            }
        }
        if(root.right== null){
            if(root.data!=root.left.data){
                return false;
            }
        }
        if(root.left!=null && root.right!=null){
            if(root.data!=root.right.data+root.left.data){
                return false;
            }
        }
        boolean left=helper(root.left);
        boolean right=helper(root.right);
        return left && right;
    }
}