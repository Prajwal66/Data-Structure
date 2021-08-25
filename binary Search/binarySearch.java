import java.util.Scanner;

public class binarySearch {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("BINARY SEARCH IMPLEMENTATION");

      System.out.println("Enter size of Array:");
      int size = sc.nextInt();

      int[] arr = new int[size];


      System.out.println("Enter Elements of Array:");
      for(int i = 0; i<arr.length;i++)
      {
         arr[i] = sc.nextInt();
      }

      System.out.println("Elements of Array:");
      for (int i : arr) {
         System.out.print(i+" ");
      }
      System.out.println();
      System.out.println("Enter Elements to Search:");
      int key = sc.nextInt();
      sc.close();

     System.out.println("Your Key"+ " "+key+ " " +"Found at Index"+ " " +bsImplementation(arr, key));
      
   }  
   public static int bsImplementation(int[] arr,int key)
   {
      // Binary Search => TIME COMPLEXITY = > O(log n)
      // cause it divide and conqure algo and it divide the array into sub array's and discard one half of array
      // it alway's accept the array into the SORTED ARRAY
      
      //

      int low = 0; // firstly we take a low index and high index from array

      int high = arr.length - 1;

      while(low <= high)
      {
         int mid = low + (high-low)/2; // we can also code like low + high / 2 but this will fail in some cases 
         //low + (high - low)/2 => this will handle if the array is overflowing

         if(key == arr[mid])
         {
            return mid; // we find our key in mid we will return the index of mid 
         }
         else if(key <= arr[mid])
         {
            // if key is less than mid element then we will go to the left half of array by setting following line
            high = mid - 1;
         }
         else{
            low = mid + 1;// if key is greater than mid then we will goto the right half of array
         }
         
      }
      return - 1;
   }

}