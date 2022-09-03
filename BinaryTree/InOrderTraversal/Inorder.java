package InOrderTraversal;

public class Inorder {
    ArrayList<Integer> arr = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if(root == null){
            return arr;
        }

        arr.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);


        return arr;


    }
}
