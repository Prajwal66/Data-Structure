public class printing_elements_using_recursion_ll {
   private static printing_elements_using_recursion_ll.Node reverse1;
   static class Node{
      int data;
      Node next;
   }   
   public static void main(String[] args) {
      Node head = null;
      printing_elements_using_recursion_ll l = new printing_elements_using_recursion_ll();
      head = new Node();
      head.data = 50;
      Node second = new Node();
      second.data = 501;

      head.next = second;
    //  l.print(head);

    Node third = new Node();
    third.data = 60;
      second.next = third;

      head = l.reverse1(head);

      System.out.println("REVERSE USING RECURSION");
      l.reverse_using_recursion(head);
      l.printRecursive(head);

      System.out.println("=========================");
      head = reverse1(head);
      l.printRecursive(head);
     
   }
   
   void printRecursive(Node head)
   {
      if(head == null)
      {
         return;
      }
      System.out.println(head.data);
      printRecursive(head.next);
   }
   void reverse_using_recursion(Node head)
   {
      if(head == null)
      {
         return;
      }
      reverse_using_recursion(head.next);
      System.out.println(head.data);
   }
   static Node reverse1(Node head) {
      if(head == null) {
          return head;
      }

      // last node or only one node
      if(head.next == null) {
          return head;
      }

      Node newHeadNode = reverse1(head.next);

      // change references for middle chain
      head.next.next = head;
      head.next = null;

      // send back new head node in every recursion
      return newHeadNode;
  }


}