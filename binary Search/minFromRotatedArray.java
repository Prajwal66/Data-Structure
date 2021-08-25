public class minFromRotatedArray {
   public static void main(String[] args) {
      int[] arr = {30,40,50,5,10,20};
   
      // leetcode I problem this code will for non duplicates array elements 

      System.out.println();
     System.out.println(Approchfind1(arr));
     int[] arr1 = {3,3,3,3,4,1,2,3};

     System.out.println(withDuplicates(arr1));
     //Apporchfind 1 => this for non duplicates array elements
     //Approch fibd 2 => this for to handle duplicates elements from array 
   }

   public static int Approchfind1(int[] arr)
   {
      int low = 0;
      int high = arr.length - 1;

      while(low <  high)
      {
         int mid = low + (high - low)/2;
         if(arr[mid] < arr[high])
         {
            high = mid;
         }
         else{
            low = mid + 1;
         }
      }
      return arr[high];
   }
   public static int withDuplicates(int[] arr)
   {
      if(arr.length == 1)
      {
         return arr[0];
      }
      int low = 0;
      int high = arr.length - 1;

      while(low < high)
      {
         int mid = low + (high - low)/2;
         if(arr[mid] < arr[high])
         {
            high = mid;
         }
         else if(arr[mid] > arr[high])
         {
            low = mid + 1;
         }
         else{
            high--;
         }
         
      }
      return arr[high];
   }
   
}
