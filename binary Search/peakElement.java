import java.util.Scanner;

class peakElement{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the size of array:");
      int capacity = sc.nextInt();

      int[] peaks = new int[capacity];

      System.out.println("Enter the Elements of Array:");
      for (int i = 0; i < peaks.length; i++) {
         peaks[i] = sc.nextInt();
      }
      //what is peak element : a number which having his neibhours less than it 
      // ex : arr = {1,2,3,1} ,
      // in arr peak element is 3 cause 3 is greater than 2 and 1
      //3 > mid - 1 and 3 > mid+ 1;

      for (int i = 0; i < peaks.length; i++) {
         System.out.print(peaks[i]+" ");
      }
      System.out.println();      
      System.out.println("Peak Element from above array is :"+findPeakElement(peaks)+ " ");
   }
   public static int findPeakElement(int[] peaks)
   {
      int low = 0;
      int high = peaks.length-1;

      while(low <= high)
      {
         int mid = low + (high-low)/2;

         if((mid == 0 || peaks[mid] > peaks[mid - 1] )&& (mid == peaks.length -1 || peaks[mid] > peaks[mid + 1]))
         {
            return mid;
         }
         else if(peaks[mid] < peaks[mid + 1])
         {
            low = mid + 1;
         }
         else{
            high = mid - 1;
         }
      }
      return -1;     
   }
}  