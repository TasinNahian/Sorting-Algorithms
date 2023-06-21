public class InsertionSort {
    public static void main(String[] args) {

        int [] arr = {7,8,3,1,2};

        for(int i = 1; i< arr.length; i++){
            int currentValue = arr[i];
            int j = i-1;
            while(j>=0 && currentValue < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentValue;
        }

        Util.printArray(arr);

    }
}
