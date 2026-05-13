 class Node {
      int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }
  }
public class lc61 {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 5; i >= 1; i--) {
            head = new Node(i, head);
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println();
        head=rotate(head,1);
        Node curr2 = head;
        while (curr2 != null) {
            System.out.print(curr2.val + (curr2.next != null ? " -> " : ""));
            curr2 = curr2.next;
        }
    }
    static Node rotate(Node head, int k ){
        Node cur=new Node();
        int prev=head.val;
        cur=head.next;
        int total=0;
        Node last=new Node();
        last=head;
        while(last.next!=null){
            total++;
            last=last.next;
        }
        int lastval=last.val;
        head.val=lastval;
        int rotation=k%total;
        while(rotation>0) {
            while (cur != null) {
                int temp=cur.val;
                cur.val=prev;
                prev=temp;
                cur = cur.next;
            }
            rotation--;
        }

        return head;
    }

}
