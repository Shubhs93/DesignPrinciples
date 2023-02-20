package Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CBTInserter {
      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    ArrayList<TreeNode> arr;
    TreeNode node;
    int size=0;
    public CBTInserter(TreeNode root) {
        node=root;
        arr=new ArrayList();
        getList(root);
    }
    public void getList(TreeNode root){
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        arr.add(root);

        while(!q.isEmpty()){
            System.out.println("fh");
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode data=q.poll();
                System.out.println(q.size());
                if(root.left!=null){
                    arr.add(root.left);
                    q.add(root.left);
                }else{
                    arr.add(null);
                }
                if(root.right!=null){
                    arr.add(root.right);
                    q.add(root.right);
                }else{
                    arr.add(null);
                }
            }
        }
        size=arr.size()-1;
    }

    public int insert(int val) {
        TreeNode new_node=new TreeNode(val);
        size+=1;
        int par=size/2;
        if(par==(2*size+1)){
            arr.get(par).left=new_node;
        }else{
            arr.get(par).right=new_node;
        }
        arr.add(new_node);
        return arr.get(par).val;
    }

    public TreeNode get_root() {
        return node;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        CBTInserter cbt=new CBTInserter(root);
    }
}
