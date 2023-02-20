package TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public class Tree{
        TreeNode node;
        int dist;
        Tree(TreeNode node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }
    public static void main(String[] args) {
        int[]A={1, 2, 3, 4, 5, -1, 6, -1, -1, -1, -1, -1, -1};
        //System.out.println(solve(A));
    }
    public void solve(TreeNode A,int x) {
        Queue<Tree> q= new LinkedList();
        Tree root=new Tree(A,0);
        q.add(root);
        solve(A.left,root.dist-1);
        solve(A.right,root.dist+1);


    }

}
