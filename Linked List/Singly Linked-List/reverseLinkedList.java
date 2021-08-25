
public class reverseLinkedList {   
   static class Node{
      int data;
      Node next;
   }
   public static void main(String[] args) {
      Node head = null;
      reverseLinkedList list = new reverseLinkedList();
      head = new Node();
      head.data = 10;
      Node second = new Node();
      second.data = 50;
      Node third = new Node();
      third.data = 60;
      head.next = second;
      second.next = third;

      list.print(head);
      System.out.println("REVERSE LINKED LIST:");
      
      head = list.Reverse(head);
      list.print(head);
      
   }
   
   void print(Node head)
   {
      Node temp = head;
      while(temp!= null)   
      {
         System.out.println(temp.data);
         temp = temp.next;
      }
   }
   Node Reverse(Node head)
   {
      Node current = head;
      Node next = null;
      Node prev = null;

      while(current  != null)
      {
         next = current.next;
         current.next = prev;
         prev = current;
         current = next;
      }
      head = prev;
      return head;
   }
}