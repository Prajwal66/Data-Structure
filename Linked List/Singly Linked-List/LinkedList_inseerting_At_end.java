// Inserting A elemet at End
// Firstly we need to create a node with Node
// then add data in it then travse the available list till the end
//once while loop exit add the last's address to next Node 
//Lets see how 
/*
i will write a basic java method for inserting at the end

void InsertAtEnd()
{
   Node fifth = new Node();
   fifth.data = 50;
   fifth.next = null // firstly we need to add null to the next pointer


   Node n = head;// n will consist of all the elements of linkedlist
   while(n.next != null)
   {
      n = n.data;//
      n = n.next;// it will traverse all the elements 
   }
   once loop exits add the link to newly created node 
   n.next = fifth;
}
*/

/**
 * LinkedList_inseerting_At_end
 */
public class LinkedList_inseerting_At_end {
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
      LinkedList_inseerting_At_end lik = new LinkedList_inseerting_At_end();
      lik.head = new Node(0);
      Node second = new Node(1);
      Node third = new Node(2);

      lik.head.next = second;
      second.next = third;
      lik.insertAtEnd(50);

      //lik.print();
      lik.atBeg(101);
      lik.print();
   }
   void insertAtEnd(int data)
   {
      Node test = new Node(data);
      test.next = null;
      Node temp = head;

      while(temp.next != null){
         temp= temp.next;
      }
      temp.next = test;
   }
   void atBeg(int data)
   {
      Node beg = new Node(data);
      beg.next = head;
      head = beg;
   }
   void print()
   {
      Node n = head;
      while(n!= null)
      {
         System.out.println(n.data);
         n = n.next;
      }
   }
}