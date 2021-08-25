import java.util.Scanner;
public class firstAndLastOccuranceOfnumber {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println();
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
     System.out.println("First Occurance Of "+key + " " + "At index" + " "+firstOccuranceOfNumber(arr, key,true));
     System.out.println("Last Occurance Of "+key + " " + "At index" + " "+firstOccuranceOfNumber(arr, key,false));
   }  
   public static int firstOccuranceOfNumber(int[] arr,int key,boolean flag)
   {
      // Binary Search => TIME COMPLEXITY = > O(log n)
      // cause it divide and conqure algo and it divide the array into sub array's and discard one half of array
      // it alway's accept the array into the SORTED ARRAY

      int low = 0; 
      int high = arr.length - 1;
      int res = -1;
      while(low <= high)
      {
         int mid = low + (high-low)/2; 
         if(key == arr[mid])
         {
            res = mid; 
            if(flag){
            high = mid - 1;// it will go to left side to check the first occurance of given ke
            }else{
               low = mid + 1;
            }
         }
         else if(key <= arr[mid])
         {  
            high = mid - 1;
         }
         else{
            low = mid + 1;
         }
         
      }
      return res;
   }

}