class RecursionInsertionSort
{
  static void insert(int arr[],int i)
  {
       while(i>0 && arr[i-1]>arr[i])
       {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
            i--;
       }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      for(int i=0;i<n;i++)
      {
          insert(arr,i);
      }
  }
}