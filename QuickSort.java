public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {6,3,9,5,2,8,1};
        int n = arr.length;
        int i = 0;
        Util.printArray(arr);
        quickSort(arr, 0, n-1);
        Util.printArray(arr);
    }
    private static void quickSort(int [] arr, int low, int high){
        if(low< high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivotValue = arr[high];
        int i = low-1;

        //sorting all values before pivot
        for (int j=low; j<high;j++){
            if(arr[j] < pivotValue){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //shift pivot value by one as all the values before is sorted
        i++;
        int temp = arr[i];
        arr[i] = pivotValue;
        arr[high] = temp;
        return i;
    }
}
