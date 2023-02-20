package Test;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;

        //constructor
        TreeNode(int data)
        {
            this.val=data;
            left = null;
            right =null;
        }
    }
    public static class diagInfo{
        TreeNode node;
        int slope;
        diagInfo(TreeNode node, int slope){
            this.node=node;
            this.slope=slope;
        }

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);

        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        Queue<diagInfo> q= new LinkedList();
        q.add(new diagInfo(root,0));
        hm.put(0,new ArrayList());
        hm.get(0).add(root.val);

        ArrayList<Integer> a=new ArrayList();
        a.add(root.val);
        ans.add(a);
        //System.out.println(A.val);
        while(!q.isEmpty()){
            ArrayList<Integer> level=new ArrayList<Integer>();
            int size=q.size();
            for(int i=0;i<size;i++){
                diagInfo tmp=q.poll();

                if(tmp.node.left!=null){
                    q.add(new diagInfo(tmp.node.left,tmp.slope-1));
                    if(!hm.containsKey(tmp.slope-1)){
                        hm.put(tmp.slope-1,new ArrayList());
                    }
                    hm.get(tmp.slope-1).add(tmp.node.left.val);
                }
                if(tmp.node.right!=null){
                    q.add(new diagInfo(tmp.node.right,tmp.slope));
                    if(!hm.containsKey(tmp.slope)){
                        hm.put(tmp.slope,new ArrayList());
                    }
                    hm.get(tmp.slope).add(tmp.node.right.val);
                }
            }
        }
        for(Integer key: hm.keySet()){
            System.out.println(hm.get(key));
        }
    }
}
