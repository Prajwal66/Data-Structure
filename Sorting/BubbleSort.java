import java.util.Scanner;

class BubbleSort {
   private static Scanner sc;
   public static void main(String[] args) {
      sc = new Scanner(System.in);
      System.out.println("Enter the size of Array:");
      int size = sc.nextInt();
      int[] arr = new int[size];
      int n = arr.length;
      System.out.println("Enter the Size Of Array:");
      for(int i = 0; i<arr.length;i++)
      {
         arr[i] = sc.nextInt();
      }
      bubbleSort(arr, n);
      System.out.println("After Sorting Elements:");
      for(int i = 0; i<arr.length;i++)
      {
         System.out.print(arr[i]+" ");
      }
      
   }
   static void bubbleSort(int[] arr,int n)  // *** complexity : best => O(n) worst and avg : O(n*n)
   {
      for(int i = 0; i<n-1;i++)
      {
         int temp = 0;
         boolean swapped = false; // this will track the array if it sorted then it will break 
         for(int j = i + 1; j<n;j++)
         {
            if(arr[i]>=arr[j])
            {
              temp = arr[i];
              arr[i] = arr[j];  
              arr[j] = temp;
              swapped = true;
            }
         }
         if(swapped ==  false)  // it will break it will print respective array nd will reduce the complexity 
         {
            break;   
         }
      }
   }
}
