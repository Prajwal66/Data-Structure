import java.util.Scanner;

class mergeSort {  
private static Scanner sc;
public static void main(String[] args) {
         sc = new Scanner(System.in);
         System.out.println("Enter Array size:");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter Elements :");
         for(int i = 0; i<arr.length;i++)
         {
            arr[i] = sc.nextInt();
         }
         mergeSort m1 = new mergeSort();
         m1.sort(arr, 0, arr.length-1);
         System.out.println();
        System.out.println("After Sorting");
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
        }
   }
   void sort(int[] arr,int left,int right)
   {
      if(left<right)
      {
         int mid = (left+right)/2;

         sort(arr, left, mid);
         sort(arr,mid+1,right);
         merge(arr, left, mid, right);
      }
   }
   void merge(int[] arr,int left,int mid,int right)
   {
      int n1 = mid - left+1;
      int n2 = right - mid;

      int[] Left = new int[n1];
      int[] Right = new int[n2];

      for(int i = 0; i<n1;i++)
      {
         Left[i] = arr[left+i];
      }
      for(int j = 0;j<n2;j++)
      {
         Right[j] = arr[mid+1+j];
      }

      int i = 0;
      int k = left;
      int j = 0;

      while(i<n1 && j<n2)
      {
         if(Left[i]<=Right[j])
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
}
