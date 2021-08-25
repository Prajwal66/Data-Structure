
class linkedlistAllOperations {
   
   //Node head;
   static class Node{ 
      int data;
      Node next;
   }   
   public static void main(String[] args) {
      Node head = null;// if we declare head as local variable then we need to insert Node head to all operations 
      linkedlistAllOperations linked = new linkedlistAllOperations();
      head = new Node(); // it will creaate a node head 
      head.data = 10;// it will addd data to head
      Node second = new Node();
      second.data = 20;
      Node third = new Node();
      third.data = 30;
      head.next = second;
      second.next = third;
      Node fourth = new Node();
      fourth.data = 40;
      third.next = fourth;


      linked.printLinkedList(head);
      System.out.println("====");
      head = linked.rotate(head, 2);
      linked.printLinkedList(head);

      /*
      linked.printLinkedList(head);
      head = linked.rotate(head, 2);
      System.out.println("in");
      linked.printLinkedList(head);
      System.out.println(linked.getMiddle(head));
      linked.printLinkedList(head);
      linked.search(head, 10);
      //linked.reverse(head);
      System.out.println("Node with Max Value:"+linked.max_element_node(head));
      System.out.println("After Reversing The List:");
      linked.printLinkedList(head);
      

      System.out.println("No of Nodes :"+linked.count_nodes(head));
      System.out.println("Sum of All nodes :"+linked.sum(head));
      linked.printLinkedList(head);
      linked.RemoveDuplicates(head);
      linked.printLinkedList(head);
      System.out.println(linked.getMiddle(head));
      System.out.println("Recursive Print");
      linked.recursivePrint(head);
      System.out.println("Recursive Reverse code");
      linked.recursiveReversePrint(head);
      System.out.println("Rotation");

      head = linked.rotate(head, 1);
      linked.printLinkedList(head);
      */
      
   }
   Node rotate(Node head,int k)
   {
      Node temp = head;
      while(temp.next != null)
      {
         temp = temp.next;
      }
      while(k>0)
      {
         temp.next = head;
         head = head.next;
         temp= temp.next;
         temp.next = null;
         k--;
      }
      return head;
      
   }
   void recursiveReversePrint(Node head)
   {
      Node temp = head;
      if(temp == null)
      {
         return;
      }
      recursivePrint(temp.next);
      System.out.println(temp.data);
   }
   void recursivePrint(Node head)
   {
      Node temp = head;

      if(temp == null)
      {
         return;
      }
      System.out.println(temp.data);
      recursivePrint(temp.next);
      
   }
   boolean isSorted(Node head)
   {
      Node temp = head;
      while(temp.next != null)
      {
         if(temp.data>temp.next.data)
         {
            
            return false;
            
         }
         temp = temp.next;
      }
      return true;
   }
   void printLinkedList(Node head)
   {
      Node temp = head;
      while(temp!= null)
      {
         System.out.println(temp.data);
         temp = temp.next;
      }
   }
   void addAtBeg(Node head,int data)//
   {
      Node beg = new Node();
      beg.data = data;//
      
      beg.next = head;//beg.next = head firstly head consist of numbers when we add beg.next = head then value in beg will store 
      head = beg;// with this line it will add to first head = beg;
   }
   void atEnd(Node head,int data)
   {
      Node temp = new Node();
      temp.data = data;
      temp.next = null;// when we want to add element at the end we need a seprate node which will point no where ie null

      Node temp1 = head;// temp1 is temp var which will consist of list of linked list 
      while(temp1.next != null) // traversing list to start to end 
      {
         temp1 = temp1.next;// it will rotate next data and so on
      } 
      temp1.next = temp;// once loop exit we are at the last position then we can add element using this statement
   }
  
   void atspecifiedPos(Node head,int data,int position)
   {
      Node temp = new Node();
      temp.data = data;

      int index = 0;
      Node current = head;
      
      while(index<position - 1)
      {
         current = current.next;
         index++;
      }
      temp.next = current.next;
      current.next = temp;
   }
   void addAtNthPosition(Node head,int data,int n)
   {
      Node temp = new Node();
      temp.data = data;
      temp.next = null;

      if(n == 1)
      {
         temp.next = head;
         head = temp;
         return;
      }
      Node temp2 = head;

      for(int i = 0; i<n - 2; i++)
      {
         temp2 = temp2.next;
      }
      temp.next = temp2.next;
      temp2.next = temp;
   }
   Node deleteNode(Node head,int position) // optimized code : 
    {
       Node temp = head; // pointing to the head of the node 
       int i = 1;
       if(position == 1)
       {
          return temp = temp.next;
       }
       while(i<position -1 ) // 1 < 1 -1 1<0 yes 
       {
          temp = temp.next; // traverse the list
       }
      temp.next = temp.next.next;
      return head;

    }
    

    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
      }




    void deleteANode(Node head,int position)
    {
       Node temp = head;
       if(head == null)
       {
         return;
       }
       
       if(position == 0){
         head = temp.next;
         return;
       }
       
       for(int i = 0; i<position - 2;i++)
       {
            temp = temp.next;
       }
       Node test = temp.next.next; //30
       temp.next = test;//10 => 30 =>null 
       
    }  
    int sum(Node head)
    {
       Node test = head;
       int sum = 0;
       while(test!=null)
       {
          sum = sum + test.data;
          test = test.next;
       }
       return sum;
    } 
    int count_nodes(Node head)
    {
       Node test = head;
       int count = 0;
       while(test!= null)
       {
          count++;
          test = test.next;
       }
       return count;
    }

    int max_element_node(Node head)
    {
       Node test = head;
       int max = head.data;
       while(test!=null)
       {
          if(max < test.data)
          {
             max = test.data;
          }
          test = test.next;
       }
       return max;
    
  }
     


  Node RemoveDuplicates(Node head) {
     Node current = head;
     while(head.next != null)
     {
        if(head.data == head.next.data)
        {
           head.next = head.next.next;
        }
        else{
         head = head.next;
        }
     }
     return current;
  }    

    void search(Node head,int key)
    {
       Node temp = head;
       int index = 1;
       while(temp != null)
       {
          if(key == temp.data)
          {
             break;
          }
          index++;
          temp = temp.next;
       }
       System.out.println(key+" Found At Position :"+ " "+index);
    }

    int getMiddle(Node head)
    {
       int count = 0;
       Node temp = head;

       while(temp != null)
       {
          temp = temp.next;
          count++;
       }
       Node test = head;
       for(int i = 0; i<count/2;i++)
       {
          test = test.next;
       }
       System.out.println("Middle ----------------------");
       return test.data;
    }
    
    }
   
   

