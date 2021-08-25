import java.util.Scanner;

public class searchInRotatedArray {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter size of Array:");
      int size = sc.nextInt();
      
      int[] rotatedArray = new int[size];

      System.out.println("Enter the Elements of Array:");
      for(int i = 0;i<rotatedArray.length;i++)
      {
         rotatedArray[i] = sc.nextInt();
      }

      System.out.println("Enter key to Search in Rotated Array:");
      int key = sc.nextInt();
      sc.close();
      System.out.println(searchElementInRotatedArray(rotatedArray, key));

   }
   public static int searchElementInRotatedArray(int[] rotatedArray,int key)
   {
      int low = 0;
      int high = rotatedArray.length - 1;

      while(low <= high){

         int mid = low + (high - low)/2; 
         //1
         if(rotatedArray[mid]== key) // 4 5 6 7 0 1 2 
         {
            return mid;  // 
         }
         if(rotatedArray[low] <= rotatedArray[mid]) // 4 <= 7
         {
            if(key>=rotatedArray[low] && key<=rotatedArray[mid])
            // 4>=4 && 4<=7 
            {
               high = mid  - 1; 
               //2
            }
            else{
               low = mid+1;
            }
         }
         else {
            //
            if(key >= rotatedArray[mid] && key<=rotatedArray[high])
            {
               low = mid + 1;
            }
            else{
               high = mid - 1;
            }
         }
      }
      return - 1;
   }
}
