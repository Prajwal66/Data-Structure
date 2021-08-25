import java.util.Scanner;

class SelectionSort {
   private static Scanner sc;

   public static void main(String[] args) {
      sc = new Scanner(System.in);
      System.out.println("Enter size of array:");
      int size = sc.nextInt();
      int[] arr = new int[size];
      int n = arr.length;
      System.out.println("Enter Elements of Array:");
      for (int i = 0; i <n; i++) {
         arr[i] = sc.nextInt();
      }
      selectionSort(arr,n);
      System.out.println("After Sorting Elements:");  // *** complexity : best worst and avg :=> O(n*n)
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i]+" ");
      }
   }

   static void selectionSort(int[] arr, int n) {
      for(int i = 0; i<n-1;i++)
      {
         int minIndex = i;
         for(int j = i + 1; j<n;j++)  //
         {
            if(arr[j]<arr[minIndex]) //  20 10 = > 10<20
            {
               minIndex = j;  // minIndex = 1;
            }
         }
         int temp = arr[i]; // temp = arr[0] = > temp = 20
         arr[i] = arr[minIndex];  // arr[0] = arr[1] => it will shift 10 to 1st position  then arr[0] = 10
         arr[minIndex] = temp; // temp is 20 it will added to arr[j] ie arr[1] = >
      }
   }
}