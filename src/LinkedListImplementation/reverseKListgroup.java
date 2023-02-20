package LinkedListImplementation;

public class reverseKListgroup {

    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int data){
            this.val=data;
            this.next=null;
        }
        @Override
        public  String toString() {
            return  val +"--->"+ next;
        }
    }
    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B=new ListNode(2);
        A.next=B;

        ListNode C=new ListNode(3);
        B.next=C;
        ListNode D=new ListNode(4);
        C.next=D;
        ListNode E=new ListNode(5);
        D.next=E;
        /*ListNode F=new ListNode("F");
        E.next=F;
       /* ListNode G=new ListNode("G");
        F.next=G;
        /*ListNode H=new ListNode("H");
        G.next=H;*/

        System.out.println(A);
        //System.out.println(A=A.next.next);
        System.out.println(reverseKList(A,2));
        System.out.println(A);
    }

    public static ListNode reorderList(ListNode A) {
        ListNode fast=A;
        ListNode slow=A;
        ListNode tmp2=null;
        while(fast!=null&& fast.next!=null){
            if(fast.next.next==null){
                tmp2=slow.next;
                break;
            }
            fast=fast.next.next;
            slow=slow.next;
            tmp2=slow.next;
        }
        slow.next=null;
        ListNode h2 =reverseList(tmp2);
        ListNode head=A;
        ListNode tmp=A;
        ListNode pointer=head.next;
        while(h2!=null){
            tmp.next=h2;
            h2=h2.next;
            tmp=tmp.next;
            tmp.next=pointer;
            if(pointer!=null){
                pointer=pointer.next;
                tmp=tmp.next;
            }
        }
        System.out.println(A);
        return A;

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
    public static ListNode reverseKList(ListNode A, int k) {
        ListNode h1=A;
        ListNode h2=null;
        ListNode tmp=h1;
        while(h1!=null&&k>0){
            h1=h1.next;
            tmp.next=h2;
            h2=tmp;
            tmp=h1;
            k-=1;
        }
        //System.out.println(h1);
        return h2;
    }
}

