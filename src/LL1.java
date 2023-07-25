public class LL1 {
    //        To remove nth element from th list
    Node head;
    class Node{
        int data;
        Node Next;
        Node(int data){
            this.data=data;
            this.Next=null;
        }
    }
    public void addLast(int data) {
        Node new_node=new Node(data);
        if (head==null){
            head=new_node;
            return;
        }
        Node current = head;
        while (current.Next != null) {
            current = current.Next;
        }
        current.Next= new_node;
    }
   public Node RemoveNthNo(int n){
        if (head.Next==null){
            return null;
        }
//        size of list
        int size=0;
        Node temp=head;
        while (temp !=null){
            temp=temp.Next;
            size++;
        }
        if(n==size){
            return head.Next;
        }
        int ptf =size-n; //position to find
       Node prev=head;
       int cp=1; //current position
       //to find and remove element
       while (cp != ptf){
           prev = prev.Next;
           cp++;
       }
       prev.Next=prev.Next.Next;
       return head;
   }
 public void printList() {
     Node current = head;
     while (current != null) {
         System.out.println(current.data);
         current = current.Next;
     }
 }

    public static void main(String[] args) {
        LL1 List=new LL1();
        List.addLast(5);
        List.addLast(3);
        List.addLast(6);
        List.addLast(2);
        List.addLast(7);
        List.RemoveNthNo(3);
        List.printList();
    }
}
