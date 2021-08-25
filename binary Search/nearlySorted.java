import java.util.Scanner;
public class nearlySorted {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Size of Array:");
      int size = sc.nextInt();

      int[] arr = new int[size];

      System.out.println("Enter the elements of array:");
      for (int i = 0; i <=arr.length-1; i++) {
         arr[i] = sc.nextInt();
      }
      System.out.println("Enter key to Search:");
      int key = sc.nextInt();
      sc.close();
      System.out.println("Key found at Index "+" "+findIndex(arr,key));
   }
   public static int findIndex(int[] arr,int key){
      int low = 0;
      int high = arr.length - 1;

      while(low < high)
      {
         int mid = low + (high - low)/2;
         if(arr[mid] == key)
         {
            return mid;
         }
         if(arr[mid-1] == key)
         {
            return mid-1;
         }
         if(arr[mid + 1] == key)
         {
            return mid + 1;
         }
         else if(key<arr[mid-2])
         {
            high = mid - 1;
         }
         else{
            low = mid + 1;
         }
      }
      return -1;
   }
}