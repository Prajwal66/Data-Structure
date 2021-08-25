import java.util.Scanner;
public class searchIntoSortedReverseArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("SEARCH IN REVERSE SORTED ARRAY");
      System.out.println("Enter the Size of Array : -");
      int size = sc.nextInt();

      int[] arr = new int[size];

      System.out.println("Enter the Elements of Array in Descending Order");
      for(int i = 0;i<arr.length;i++)
      {
         arr[i] = sc.nextInt();
      }
      System.out.println();
      for (int i : arr) {
         System.out.print(i+" ");
      }
      System.out.println("Enter Key to Search in Reverse Sorted Array:");
      int key = sc.nextInt();
      sc.close();

      System.out.println("Your Key : "+key+" "+ "Found At Index"+" "+searchIntoSortedReverseArrays(arr, key));
      }
      public static int searchIntoSortedReverseArrays(int[] arr,int key)
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
