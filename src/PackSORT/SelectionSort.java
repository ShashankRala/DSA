package PackSORT;

public class SelectionSort {
	
		  static void selectionSort(int[] a) 
		  {
		    for (int j = 0; j < a.length; j++)
		    {
		      int minimumIndex = j;
		      	for (int i = j+1; i<a.length; i++)
		      	{
		      		if (a[i] < a[minimumIndex])
		      		{
		      		minimumIndex = i;
		      		}
		      	 }
		      if (minimumIndex != j) 
		      {
		        int temp = a[j];
		        a[j] = a[minimumIndex];
		        a[minimumIndex] = temp;
		      }
		    }
		  }


			public static void printArray(int []array) {
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i]+"  ");
				}
			}

		

	public static void main(String[] args)
	{
	int arr[]= {10,9,2,4,3,7,5,1,6,8};
	selectionSort(arr);
	printArray(arr);

	}

}
