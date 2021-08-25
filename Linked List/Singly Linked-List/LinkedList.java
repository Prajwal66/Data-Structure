// Linked List is data structure in which elements are not sorted in contigious memory locations 
// The elements in a linked list are linked using pointers 


//   why Linked List => 
// 1 Array is Fixed Size 2.inserting new element in array is expensive beacause we have to create a 
// seprate room and then we need to shit the whole array
// Advantages Over Array:  1.Dyanmic Size 2.ease of insertion / deletion


// simple structure of linkedlist using JAVA

/*
class LinkedList{
   Node head;
   static class Node{
      int data;
      int next;

      Node(int data)
      {
         this.data = data;
      }
   }
}
*/

// Basic Linked List code to understand how does it works


/**
 * LinkedList
 */
class LinkedList {
   Node head;
   static class Node{
      int data;
      Node next;

      Node(int data)
      {
         this.data = data;
      }
   }
   public static void main(String[] args) {
      LinkedList l = new LinkedList();
      l.head = new Node(1);
      Node second = new Node(2);
      Node Third = new Node(3);
      Node Fourth = new Node(4);


      l.head.next = second; 
      second.next = Third;
      Third.next = Fourth;
     // l.printLinkedList();
      //l.search(3);
      //l.insert(101);
      System.out.println("recursive");
     // l.recursiveReverse(l.head);
      System.out.println();
     // l.printLinkedList();
      l.recursivePrint(l.head);
     // l.insertAtEnd(10);
     /* l.printLinkedList();
      l.insertAtBge(101);
      l.printLinkedList();
      l.insertAtEnd(1111);
      l.printLinkedList();
      l.insertAtSpecified(358, 1);
      l.printLinkedList();
      l.delete(1);
      l.printLinkedList();
      l.Reverse();
      l.printLinkedList();
      l.count();
      System.out.println(l.count());
      System.out.println(l.max());
      */
    //cls l.recursiveReverse(l.head);
      System.out.println("Recursive Reversing");
      l.recursiveReverse(l.head);

   }
   
   Node insert(int data)
   {
      Node newNode = new Node(data);
      newNode.next = null;
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
      return head;
   }
   void recursivePrint(Node head)
   {
      if(head == null)
      {
         return;
      }
      
      System.out.println(head.data);
      recursivePrint(head.next);

      
   }

   void recursiveReverse(Node head)
   {
      if(head == null)
      {
         return;
      }
      recursivePrint(head.next);
      System.out.println(head.data);
   }


   int max()
   {
      int Max = head.data;
      Node temp = head;
      while(temp != null)
      {
         if(Max < temp.data)
         {
            Max = temp.data;
         }
         temp = temp.next;
      }
      return Max;
   }
   Node Reverse()
   {
      Node next = null;
      Node prev = null;
      Node current = head;

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

   Node delete(int pos)
   {
      Node test = head;
      int i = 1;
      while(i<pos - 1)
      {
         test = test.next;
      }
      test.next = test.next.next;
      return test;
   }

   void printLinkedList()
   {
      Node n = head;
      System.out.println("Elements of Linked List:");
      while(n!= null)
      {
         
         System.out.println(n.data);
         n = n.next;
      }    
   }
   /*void insertAtEnd(int data)
   {
      Node fifth = new Node(data);
      fifth.next = null;

      Node temp = head;

      while(temp.next!= null )
      {
         temp = temp.next;
      }
      temp.next = fifth;
   }
 
   */

   void insertAtBge(int data)
   {
      Node temp = new Node(data);
      if(head == null)
      {
         head = temp;
      }
      
      temp.next = head;
      head = temp;
}

void insertAtEnd(int data)
{
   Node temp1= new Node(50);
   if( head == null)
   {
      head = temp1;
      return;
   }
   else{
      Node test = head;
      while(test.next != null)
      {
         test = test.next;
      }
      test.next = temp1;
      test = temp1.next;
   }
}
void insertAtSpecified(int data,int pos)
{
   Node temp = new Node(data);

   if(head == null)
   {
      head = temp;   
   }
   //Node test = head;

   for(int i = 0; i<pos -1; i++)
   {
      head = head.next;
   }
   temp.next = head.next;
   head.next = temp;
}
int count()
{
   int counts = 0;
   Node current = head;
   while(current != null)
   {
      counts++;
      current = current.next;
   }
   return counts;
}
void search(int key)
{
   Node current = head;
   boolean flag = false;
   int index = 1;
   while(current != null)
   {
      if(key == current.data)
      {
         flag = true;
         break;
      }
      index++;
      current = current.next;
   }
   System.out.println(key + "Found at :"+index);
}

}

