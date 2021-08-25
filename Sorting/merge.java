import java.util.Scanner;
/* Java program for Merge Sort */
class merge
{
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge1(int arr[], int left, int mid, int right)
	{
		
		int n1 = mid - left + 1;
		int n2 = right - mid;

		
		int Left[] = new int[n1];
		int Right[] = new int[n2];

		
		for (int i = 0; i < n1; ++i)
			Left[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			Right[j] = arr[mid + 1 + j];

		
		int i = 0, j = 0;

		
		int k = left;
		while (i < n1 && j < n2) {
			if (Left[i] <= Right[j]) {
				arr[k] = Left[i];
				i++;
			}
			else {
				arr[k] = Right[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) {
			arr[k] = Left[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = Right[j];
			j++;
			k++;
		}
	}
	void sort(int arr[], int left, int right)
	{
		if (left < right) {
			// Find the middle point
			int mid =(left+right)/2;

			// Sort first and second halves
			sort(arr, left, mid);
			sort(arr, mid + 1, right);

			// Merge the sorted halves
			merge1(arr, left, mid, right);
		}
	}

	/* A utility function to print array of size n */
	/*static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
*/
	// Driver code
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int size = sc.nextInt();

		int arr[] = new int[size];

      System.out.println("Enter Array Elements :");
      for(int i = 0; i<arr.length;i++)
      {
         arr[i] = sc.nextInt();
      }

		System.out.println("Given Array");
      for(int i = 0; i<arr.length;i++)
      {
         System.out.print(arr[i] + " ");
      }
		merge ob = new merge();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		for(int i = 0; i<arr.length;i++)
      {
         System.out.print(arr[i]+ " ");
      }
	}
}
/* This code is contributed by Rajat Mishra */
