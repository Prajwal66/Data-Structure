
public class linkedListInsertingAtNth {
   Node head;
   class Node{
      int data;
      Node next;
   }
   public static void main(String[] args) {
//      Node head = null;
      linkedListInsertingAtNth l = new linkedListInsertingAtNth();
      l.insert(2,1);
      l.insert(3,2);
      l.insert(10, 3);
      l.printList();
   }
   void printList()
   {
    Node test = head;
    while(test!= null)
    {
       System.out.println(test.data);
       test = test.next;
    } 
   }
   void insert(int data,int n)
   {
       Node test = new Node();
       test.data = data;
       test.next = null;

       if(n == 1)
       {
          test.next = head;
          head = test;
          return ;
       }
         Node temp2 = head;
         for(int i = 0; i<n -2 ; i++)
         {
            temp2 = temp2.next;


         }
         test.next = temp2.next;
         temp2.next = test;
   }
}