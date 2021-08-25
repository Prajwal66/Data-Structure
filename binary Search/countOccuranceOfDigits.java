public class countOccuranceOfDigits {
   public static void main(String[] args) {
      int n = 2;
      int digit = 12212;
      System.out.println(findOccurance(n,digit));
   }
   public static int findOccurance(int n,int digit)
   {
      int c = 1;
      
      while(n > digit)
      {
         digit = digit%10;
         digit/=10;
         if(digit == n)
         {
            c++;
         }
         else{
            continue;
         }
      }
      return c;
   }

}
