import java.util.LinkedList;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class LL{
    ListNode head;
    public void print(){
        ListNode temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public void insert(int data){
        ListNode newdata= new ListNode(data);
        if(head==null){
            head=newdata;
        }
        else{
            ListNode temp=head;
            {
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newdata;
            }
        }
    }
    public ListNode deleteDuplicates() {
        ListNode slow = head;
        ListNode fast= head.next;
        while(fast!=null){
            if(fast.val==slow.val){
                slow.next=slow.next.next;
            }
            else{
                slow=slow.next;
            }
            fast=fast.next;
        }

        return head;
    }
}
public class MergeSortedList {
    public static void main(String[] args) {
        LL list = new LL();
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.print();
        list.deleteDuplicates();
        list.print();
        System.out.println(list);
    }

    }

