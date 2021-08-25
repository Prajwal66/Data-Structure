class Quicksort {
   public static void main(String[] args) {
      int[] arr = {10,50,30,20,40};
      Quicksort q = new Quicksort();
      q.sort(arr, 0, arr.length - 1); // 0 5
      System.out.println();
      for(int i = 0; i<arr.length;i++)
      {
         System.out.println(arr[i]+ " ");
      }
   }
   int Partition(int[] arr,int start,int end) // it will return a new partition array 
   { // likethis => 10 20 30 40 50 those are less than pivot will be added to left side and those who greater that will added to right of it 
      
      int piviot = arr[end]; // piviot = 40
      int PIndex = start;  // Pindex = 0
      for(int i = start;i<end;i++) 
      {
         if(arr[i]<piviot) // arr[0]<40 10<40
         {
            int temp = arr[i];   // temp = 10
            arr[i] = arr[PIndex]; // 
            arr[PIndex] = temp;  
            PIndex++;  //pi = 1 10
         }
      }
      int temp = arr[PIndex]; 
      arr[PIndex] = piviot;  
      arr[end] = temp; 

      return PIndex; //
      
   }
   void sort(int[] arr,int start,int end)
   { // this part will sort array divide into the subarray 
      if(start<end)
      {
         int PIndex = Partition(arr,start,end); 
         
         sort(arr, start,PIndex - 1);// for left sub part
         sort(arr, PIndex+1, end);//right sub part of array
         
      }
   }
}