public class RotatedArrayCount {
   public static void main(String[] args) {
      int[] arr = {4,5,6,7,0,1,2};
     System.out.println(countOfRotatedArray(arr));
   }
   public static int countOfRotatedArray(int[] arr)
   {
      int low = 0;
      int high = arr.length -1;
      int n = arr.length;
      int piviot = 0;
      while(low <= high)
      {
         int mid = low + (high - low)/2;
         int next = (mid + 1)%n;
         int prev = (mid -1+n)%n;

         if(arr[mid] <= arr[prev] && arr[mid] <= arr[next])
         {
            mid = piviot;
            break;
         }
         
      }
      return piviot;
   }
}
