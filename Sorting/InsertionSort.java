import java.util.Scanner;
public class InsertionSort {
   private static Scanner sc;
   public static void main(String[] args) {
      sc = new Scanner(System.in);
      System.out.println("Enter size of Array:");
      int size = sc.nextInt();
      int[] arr = new int[size];
      int n = arr.length;
      for(int i = 0; i<arr.length;i++)
      {
         arr[i] = sc.nextInt();
      }
      insertionSort(arr,n);
      System.out.println("After Sorting:");
      for(int i : arr)
      {
         System.out.print(i+" ");
      }
   }
   static void insertionSort(int[] arr,int n)  //  complexity => best case : O(n) worst and avg = > O(n*n) O(n square) 
   {
      for(int i = 1;i<=n-1;i++){     // arr = [3,1,2] 
         int value = arr[i]; // value = 2
         int hole = i; // hole = 2

         while(hole>0 && arr[hole-1]>value) // arr[1-1] >value (arr[0]>1 yes 3>1)
         {
            arr[hole] = arr[hole-1]; // arr[1] = arr[1-1] = > it will move arr[0] to arr[1] = > 3 3 2
            hole = hole - 1; // 1-1 = hole = 0
         }
         arr[hole] = value; // arr[hole]= value =>a[0] = 1 now array is [1,3,2]
      }
   }
}