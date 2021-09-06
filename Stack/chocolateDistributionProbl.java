import java.util.Arrays;

public class chocolateDistributionProbl {

   public static void main(String[] args) {
      int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
     Arrays.sort(arr);
     int n = arr.length;
     int m = 5;
     System.out.println(findChocolateDisribution(arr,n,m));
     
   }
   public static int findChocolateDisribution(int[] arr,int n,int m)
   {
      
      int ans = Integer.MAX_VALUE;
      

      for(int i = 0; i < n - 1;i++)
      {
         int min = arr[i];
         int max = arr[i + m - 1];
         int gap = min- max;

         if(gap < ans){
            ans = gap;
         }
      }
      return ans;
   }
}