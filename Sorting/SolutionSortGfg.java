import java.util.Scanner;

class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Elements of Array:");
		for(int i = 0; i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		select(arr);
		System.out.println("After Sorting Elements:");
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		} 
	}
	static void  select(int arr[])
	{
        // code here such that selectionSort() sorts arr[]
        int n = arr.length;
        for(int i = 0; i<n;i++)
        {
            selectionSort(arr,n);
        }
	}
	
	static void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0; i<n-1;i++)
	    {
	        for(int j = i + 1; j<n;j++)
	        {
	            if(arr[i]>=arr[j])
	            {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    
	}
}