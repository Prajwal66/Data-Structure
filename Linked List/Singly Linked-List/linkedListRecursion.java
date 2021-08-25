
class linkedListRecursion {
   Node head;
   static class Node {
      int data;
      Node next;
   }   
   
   public static void main(String[] args) {
      linkedListRecursion l = new linkedListRecursion();
      l.head = new Node();
      l.head.data = 50;
      Node first = new Node();
      first.data = 60;
      l.head.next = first;

      Node second = new Node();
      second.data = 70;

      first.next = second;
      Node third = new Node();
      third.data = 80;
      second.next = third;

      l.reverse(l.head);
      l.reverse(l.head);
      //.print(l.head);
      l.print_elements_Reverse(l.head);
      System.out.println("REVERSE USING RECURSION :) ");
      l.print(l.head);
   }
   void print(Node head)
   {
      Node test = head;
      while(test != null)
      {
         System.out.println(test.data);
         test = test.next;
      }
   }
   void print_elements_Reverse(Node head)
   {
      if(head == null)
      {
         return;
      }
      
      print_elements_Reverse(head.next);
      System.out.println(head.data);
      
   }
   Node reverse(Node head)
   {
      if(head == null)
      {
         return head;
      }
      if(head.next == null)
      {
         return head;
      }
      Node newNode = reverse(head.next);
      head.next.next = head;
      head.next = null;
      return newNode;
   }
}
