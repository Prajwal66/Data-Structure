public class firstLastOcc {
   public static void main(String[] args) {
      int[] arr = {1,1,2,2,3,4,4};
      int key = 4;
     System.out.println(findFirstLastOccurance(arr,key,true));
     System.out.println(findFirstLastOccurance(arr,key,false));
   }
   public static int findFirstLastOccurance(int[] arr,int key,boolean flag)
   {
      int low = 0;
      int high = arr.length - 1;
      int res = -1;
      while(low <= high)
      {
         int mid = low + (high - low)/2;
         if(arr[mid] == key)
         {
            res = mid;
   

            if(flag){
               high = mid - 1;
            }else{
               low = mid + 1;
            }
         }
         else if(key >= arr[mid])
         {
            low = mid + 1;
         }
         else{
            high = mid - 1;
         }
      }
      return res;
   }
}
