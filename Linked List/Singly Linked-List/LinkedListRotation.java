class LinkedListRotation {
   
   static class Node{
      int data;
      Node next;
   }
   public static void main(String[] args) {
      Node head = null;
      LinkedListRotation lr = new LinkedListRotation();
      head = lr.insert(head, 100);
      head = lr.insert(head, 200);
      head = lr.insert(head, 300);
      head = lr.insert(head, 400);


      lr.print(head);
      System.out.println("After Rotation");
      head =  lr.RotateLL(head, 2);
      lr.print(head);      
   }
   Node insert(Node head,int data)
   {
      Node temp = new Node();
      temp.data = data;
      temp.next = null;

      if(head == null)
      {
         head = temp;

      }
      else{
         Node current = head;
         while(current.next != null)
         {
            current = current.next;
         }
         current.next = temp;
      }
      return head;
   }
   void print(Node head)
   {
      Node te = head;
      while(te != null){
         System.out.println(te.data);
         te = te.next;
      }
   }
   Node RotateLL(Node head,int key)
   {
      Node temp = head;
      while(temp.next!= null)
      {
         temp = temp.next;
      }

      while(key>0)
      {
         temp.next = head;
         head = head.next;
         temp = temp.next;
         temp.next = null;
         key--;
      }
      return head;
   }  
}