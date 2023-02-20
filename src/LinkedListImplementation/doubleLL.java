package LinkedListImplementation;

import java.util.HashMap;

public class doubleLL {
    static int capacity;
    static int size;
    static HashMap<Integer,doubleListNode> hm=new HashMap<>();
    public static class doubleListNode {
        int key;
        int val;
        doubleListNode next;
        doubleListNode prev;

        doubleListNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
        public  String toString() {
            return  key +"--->"+ next;
        }
    }
    static doubleListNode head=null;
    static doubleListNode tail=null;
    public doubleLL(int capacity) {
        this.capacity=capacity;
    }
    public static int get(int key) {
        if(hm.containsKey(key)){
            doubleListNode node=hm.get(key);
            removeNode(node);
            addNode(node);
            System.out.println(node);
            return node.val;

        }
        System.out.println(-1);
        return -1;
    }
    public static void set(int key, int value) {
        if(hm.containsKey(key)){
            doubleListNode node=hm.get(key);
            if(tail!=node){
                removeNode(node);
                if(node.val!=value){
                    node.val=value;
                }
                addNode(node);
            }else{
                node.val=value;
            }
            hm.put(key,node);
        }else{
            doubleListNode node=new doubleListNode(key,value);
            if(size==capacity){
                hm.remove(head.key,head);
                removeNode(head);
                addNode(node);
                hm.put(key,node);
                return;
            }
                addNode(node);
                hm.put(key,node);
                size+=1;
        }


    }
    public static void main(String[] args) {
       doubleLL n=new doubleLL(1);
        set(2, 1);
        set(1, 10);
        set(8, 13);
        get(12);
        set(2, 8);
        get(11);
        get(7);
        set(14, 7);
        set(12, 9);
        set(7, 10);
        get(11);
        set(9, 3);
        set(14, 15);
        get(15);
        get(9);
        set(4, 13);
        get(3);
        set(13, 7);
        get(2);
        set(5, 9);
        get(6);
        get(13);
        set(4, 5);
        set(3, 2);
        set(4, 12);
        get(13);
        get(7);
        System.out.println(head);

    }
    public static void removeNode(doubleListNode currentNode){
        if(head.next==null){//only node
            head=null;
            tail=head;
            return;
        }
        if(head==currentNode){//if current node is 1st node
            head=head.next;
            head.prev=null;
            return;
        }
        if(tail==currentNode){
            tail=tail.prev;
            tail.next=null;
            return;
        }
        doubleListNode prevNode=currentNode.prev;
        doubleListNode nextNode=currentNode.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        size-=1;
    }
    public static void addNode(doubleListNode currentNode){
        if(head==null){
            head=currentNode;
            head.next=null;
            head.prev=null;
            tail=head;
            return;
        }
        tail.next=currentNode;
        currentNode.prev=tail;
        tail=currentNode;
        tail.next=null;
    }
}

