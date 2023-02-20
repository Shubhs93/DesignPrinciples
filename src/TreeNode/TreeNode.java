package TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
         int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
}

    @Override
    public String toString() {
        return
                "root=" + val
              ;
    }
}
