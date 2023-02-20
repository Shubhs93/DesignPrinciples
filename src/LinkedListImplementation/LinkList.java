package LinkedListImplementation;

public class LinkList {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int data){
            this.val=data;
            this.next=null;
        }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        @Override
        public String toString() {
            return  val +"--->"+ next;
        }
    }

    public static void main(String[] args) {
        ListNode A=new ListNode(1);
        ListNode B=new ListNode(2);
        A.next=B;
        ListNode C=new ListNode(3);
        B.next=C;
        ListNode D=new ListNode(4);
        C.next=D;
        ListNode E=new ListNode(5);
        D.next=E;
        //System.out.println(solve(A));
        solve(A);
    }
    public static ListNode solve(ListNode h1){
        ListNode tmp=h1;
        while(tmp.next.next!=null){
            tmp=tmp.next;
        }
        ListNode h2=tmp.next;
        tmp.next=null;
        h2.next=h1;
        System.out.println(h1);
        System.out.println(h2);
        h2.next=h1;
        return h2;

    }

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode tmp=head;
        int c2=1;
        while(tmp.next!=null){
            tmp=tmp.next;

            c2+=1;
        }
        ListNode tmp2=new ListNode(head.val,head.next);
        ListNode h2=new ListNode(head.val,head.next);

        ListNode rev=reverseList(head);
        System.out.println("head "+h2);
        int s=k;
        /*System.out.println("swap "+rev);


        int e=c2-k+1;
        int m=1;
        while(tmp2.next!=null){
            if(m==s-1){
                ListNode h1=tmp2.next.next;
                tmp2.next=rev.next;
                tmp2=tmp2.next;
                tmp2.next=h1;
                rev=rev.next;
            } else if(m==e-1){
                ListNode h1=tmp2.next.next;
                tmp2.next=rev.next;
                tmp2=tmp2.next;
                tmp2.next=h1;
                rev=rev.next;

            }else{
                tmp2=tmp2.next;
                rev=rev.next;
            }
            System.out.println(head);
            m+=1;
        }*/
        return head;

    }

    public static ListNode reverseList(ListNode A) {
        ListNode h2=null;
        ListNode h1=A;
        ListNode tmp=h1;
        while(h1!=null){
            h1=h1.next;
            tmp.next=h2;
            h2=tmp;
            tmp=h1;
        }
        return h2;

    }
    public static ListNode partition(ListNode A, int B) {
        ListNode h1=null;
        ListNode tmp1=h1;
        ListNode h2=null;
        ListNode tmp2=h2;
        ListNode pointer=A;
        while(pointer!=null){
            if(pointer.val<B){
                if(h1==null){
                    h1=pointer;
                    tmp1=h1;
                    pointer=pointer.next;
                }else{
                    tmp1.next=pointer;
                    pointer=pointer.next;
                    tmp1=tmp1.next;
                }
            }else{
                if(h2==null){
                    h2=pointer;
                    tmp2=h2;
                    pointer=pointer.next;
                }else{
                    tmp2.next=pointer;
                    pointer=pointer.next;
                    tmp2=tmp2.next;
                }
            }
            System.out.println(pointer);
        }
        if(tmp1!=null){
            tmp1.next=h2;
            return h1;
        }

        return h2;
    }
    public static ListNode reverseBetween(ListNode A, int B, int C) {
        if(A==null){
            return null;
        }
        ListNode newNode=A;
        if(B==1){
            return reversekNode(newNode,C-B+1);
        }else{
            int k=1;
            while(k<B-1){
                newNode=newNode.next;
                k+=1;
                System.out.println("k "+newNode);
            }
            ListNode tmp=newNode.next;
            System.out.println("n "+newNode);
            System.out.println("tmp "+tmp);
            System.out.println("o "+newNode);
            newNode.next=reversekNode(tmp,C-B+1);
            System.out.println("p "+A);
            return A;
        }
    }
    public static ListNode reversekNode(ListNode A,int k){
        if(A==null||k==0){
            return A;
        }
        ListNode h2=null;
        ListNode h1=A;
        ListNode tmp=h1;
        ListNode head=h1;
        while(h1!=null&&k>0){
            //System.out.println("head "+head);
            h1=h1.next;
            tmp.next=h2;
            h2=tmp;
            tmp=h1;
            k-=1;

        }
        head.next=h1;
        return h2;
    }


}
