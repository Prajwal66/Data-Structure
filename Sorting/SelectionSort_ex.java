import java.util.Scanner;
class SelectionSort_ex
{
   private static Scanner sc;
   public static void main(String args[])
   {
      sc = new Scanner(System.in);
      System.out.println("Enter the size of the Array:");
      int size = sc.nextInt();
      int[] arr = new int[size];
      int n = arr.length;
      System.out.println("Enter the Elements of Array:");
      for(int i = 0;i<arr.length;i++)
      {
         arr[i] = sc.nextInt();
      }
      
      selectionSort(arr, n);
      System.out.println("Sorted Array:");
      for(int i = 0; i<n;i++)
      {
         System.out.print(arr[i]+" ");
      }
   }
   static void selectionSort(int[] arr,int n)   // complexity best avg worst : => O(n*n) O(n Square);
   {
      for(int i = 0; i<n;i++)
      {
         int minIndex = i;
         for(int  j = i + 1; j<n;j++)
         {
            if(arr[j] < arr[minIndex])
            {
               minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
         }
      }
   }
}