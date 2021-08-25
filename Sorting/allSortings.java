import java.util.Scanner;

class allSortings {
   private static Scanner sc;
   public static void main(String[] args) {
      
      sc = new Scanner(System.in);

      System.out.println("Enter size of array:");
      int size = sc.nextInt();
      int[] arr = new int[size];

      System.out.println("Enter elements of array =>:");
      for(int i = 0; i<arr.length; i++)
      {
         arr[i] = sc.nextInt();
      }
      
      //time complexities of sorting algo :)
      // ps : O(n * n ) = > O(n Square)
      // bubble sort       = (best case : O(n)        : Avg Case : Worst Case : O(n * n) 
      // Selection sort    = (best case :             : Avg Case : Worst Case : O(n * n))
      //Insertion Sort     = (best case : O(n)        : Avg Case : Worst Case : O(n * n))
      //Merge Sort         = (best case : O(n log n)  : Avg Case : Worst Case : O(n Log n) => best rather than above 4 algo)
      //Quick Sort         = (best case : O(n log n)  : Avg Case : Worst Case : )

      while(true)
      {
      System.out.println("1 - Bubble Sort");
      System.out.println("2 - Selection Sort");
      System.out.println("3 - Insertion Sort");
      System.out.println("4 - Merge Sort");
      System.out.println("5 - Quick Sort");
      System.out.println("6 - Print Sorted Array");

      System.out.println("Enter your choice:");
      int ch = sc.nextInt();
      int n = arr.length;
      switch(ch)
      {
         case 1:
            BubbleSort(arr,n);
            break;
         case 2:
            SelectionSort(arr,n);
            break;
         case 3:
            InsertionSort(arr,n);
            break;
         case 4:
            mergeSort(arr,0,arr.length-1);
            break;
         case 5:
            QuickSort(arr, 0, arr.length - 1);
            break;
         case 6:
            printArray(arr);
            break;
         default:
         System.out.println("Enter right choice");
         break;
      }
   }
   }
   public static int Partition(int[] arr,int start,int end)
   {
      int pivot = arr[end];
      int Pindex = start;

      for(int i = start;i<end;i++)
      {
         if(arr[i] < pivot)
         {
            int temp = arr[i];
            arr[i] = arr[Pindex];
            arr[Pindex] = temp;
            Pindex++;
         }
      }
      int temp = arr[Pindex];
      arr[Pindex] = pivot;
      arr[end] = temp;
      return Pindex;
   }
   public static void QuickSort(int[] arr,int start,int end)
   {
      if(start < end)
      {
         int Pindex = Partition(arr,start,end);
         QuickSort(arr, start, Pindex-1);
         QuickSort(arr, Pindex+1, end);
      }
   }   
   public static void mergeSort(int[] arr,int left,int right)
   {
      if(left < right)
      {
         int mid = (left + right)/2;
         mergeSort(arr, left, mid);
         mergeSort(arr, mid+1, right);
         merge(arr,left,mid,right);
      }
      
   }
   public static void merge(int[] arr,int left,int mid,int right)
   {
      int n1 = mid - left+1;
      int n2 = right - mid;

      int[] Left = new int[n1];
      int[] Right = new int[n2];
      
      for(int i = 0; i<n1;i++)
      {
         Left[i] = arr[left+ i];
      }
      for(int j = 0; j<n2;j++)
      {
         Right[j] = arr[mid+1+j];
      }
      int i = 0;
      int j = 0;
      int k = left;


      while(i<n1 && j<n2)
      {
         if(Left[i] <= Right[j])
         {
            arr[k] = Left[i];
            i++;

         }
         else{
            arr[k] = Right[j];
            j++;
         }
         k++;
      }
      while(i<n1)
      {
         arr[k] = Left[i];
         i++;
         k++;
      }
      while(j<n2)
      {
         arr[k] = Right[j];
         j++;
         k++;
      }


   }
   public static void InsertionSort(int[] arr,int n)
   {
      for(int i = 1;i<n;i++)
      {
         int value = arr[i];
         int k = i;

         while(k>0 && arr[k - 1]>value)
         {
            arr[k] = arr[k-1];
            k = k - 1;
         }
         arr[k] = value;
      }
   }
   static void SelectionSort(int[] arr,int n)
   {
      for(int i = 0; i<n;i++)
      {
         int minIndex = i;

         for(int j = i + 1;j<n;j++)
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
   static void printArray(int[] arr)
   {
      for(int i = 0; i<arr.length;i++)
      {
         System.out.print(arr[i]+" ");
      }
      System.out.println();
   }
   public static int[] BubbleSort(int[] arr,int n)
   { // this loop will contiuely go it will make complexity bigger to ruduce we can change code using flags =>swapp
      boolean swap = false;
      for(int i = 0; i<n;i++)
      {
         for(int j = i + 1;j<n;j++)
         {
            if(arr[i] > arr[j])
            {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               swap = true;
            }
            
         }
         if(swap == false)
         {
            break;
         }
      }
      return arr;
   }
}
