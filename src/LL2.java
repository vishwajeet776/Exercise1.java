public class LL2 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this .data=data;
            this.next=null;
        }
    }
    public void addLast(int data){
        Node new_node=new Node(data);
        if (head==null){
            head=new_node;
            return;
        }
        Node current = head;
        while (current.next != null){
            current=current.next;
        }
        current.next=new_node;
    }
    public boolean has_a_cycle(){
        Node slow=head;
        Node fast=head;
        while (fast != null && fast.next != null ){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LL2 List=new LL2();
        List.addLast(1);
        List.addLast(2);
        List.addLast(3);
        List.addLast(4);
        List.addLast(5);
        List.addLast(6);
        List.addLast(2);
        if (List.has_a_cycle()){
            System.out.println(" loop exist");
        }
        else {
            System.out.println(" loop does not exist");
        }

    }
}
