public class linkedRevise {
   public void CreateNode(int data)
      {
         Node newNode = new Node(data);
         if(head != null)
         {
            Node nex = head;
            while(nex.next!= null)
            {
               nex = nex.next;
            }
            nex.next = newNode;  
         }
         else{
            newNode.next = newNode;
         }
      }
   
      void addAtBeg(int data)
      {
         Node newNode = new Node(data);
         if(head != null)
         {
            newNode.next = head;
            head = newNode;
         }
         else{
            head = newNode;
         }
         
      }
      void addAtEnd(int data)
      {
         Node newNode = new Node(data);
         if(head == null)
         {
            
            head = newNode;
         }
         else{
            Node current = head;
            while(current.next != null)
            {
               current = current.next;
            }
            current.next = newNode;
         }
      }
      void insertAtNthPostion(int data,int n)
      {
         Node newNodes = new Node(data);
         newNodes.next = null;
         if(n == 1){
            newNodes.next = head;
            head = newNodes;
            return;
         }
         else{
            Node temp2 = head;
            for(int i = 0; i<n- 2;i++)
            {
               temp2 = temp2.next;
            }
            newNodes.next = temp2.next;
            temp2.next = newNodes;
         }
      }
   void print(){
      Node current = head;
      while(current != null)
      {
         System.out.println(current.data);
         current = current.next;
      }
   }
   Node reverseLinkedList()
   {
      if(head == null)
      {
         return head;
      }
      else{
         Node current = head;
         Node next = null;
         Node prev = null;

         while(current != null)
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

   Node reverse1()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
      return head;
      }
      void recursive_reverse()
      {
         Node current = head;
         if(current.next == null)
         {
            head = current;
            return;
         }
         else{
            
            recursive_reverse(current.next);
            
            Node q = current.next;
            q.next = current;
            current.next = null;
         }
         
      }

   Node head;
  static class Node
   {
      int data;
      Node next;

      Node(int data){
         this.data = data;
      }
      
   }
   public static void main(String[] args) {
      linkedRevise l = new linkedRevise();

      l.addAtBeg(10);
      l.addAtBeg(20);
      l.addAtBeg(30);
      l.addAtBeg(40);

      l.print();
      l.recursive_reverse();
      l.print();
   }

}
