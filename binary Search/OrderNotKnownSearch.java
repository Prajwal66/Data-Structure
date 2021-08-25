import java.util.Scanner;
public class OrderNotKnownSearch {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("ORDER NOT KNOWN SEARCH");

      // means if user give an array but we dont know it is asc or desc to inditify that we 
      // take 2 values from array and check
      System.out.println("Enter the Size of Array : -");
      int size = sc.nextInt();

      int[] arr = new int[size];

      System.out.println("Enter the Elements of Array in Descending Order");
      for(int i = 0;i<arr.length;i++)
      {
         arr[i] = sc.nextInt();
      }
      System.out.println("Array Elements : ");
      for (int i : arr) {
         System.out.print(i+" ");
      }
      System.out.println();
      System.out.println("Enter Key to Search in Reverse Sorted Array:");
      int key = sc.nextInt();
      sc.close();

      if(arr[0] < arr[1])
      {
         //if arr[0] less than arr[1] then it is an ascending order array 
        System.out.println("Found At Index "+ascendingSearch(arr, key));
      }
      else{
         // if greater then the array is it in descendingOrder will call this method 
        System.out.println("Found At Index "+descendingSearch(arr, key));
      }
      }
      public static int ascendingSearch(int[] arr,int key)
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
      public static int descendingSearch(int[] arr,int key)
      {
         int low = 0;
         int high = arr.length - 1;

         while(low <= high)
         {
            int mid = low + (high-low)/2;

            if(key == arr[mid]){
               return mid;
            }
            else if(key <= arr[mid])
            {
               low = mid + 1;
            }
            else{
               high = mid - 1;
            }

         }
         return -1;
      }
}
