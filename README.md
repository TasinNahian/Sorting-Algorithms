# Sorting-Algorithms

## 1.1 Bubble Sort Algorithm

Bubble sort is a simple sorting algorithm that repeatedly steps through a list of elements to be sorted,
compares adjacent elements, and swaps them if they are in the wrong order.
The pass through the list is repeated until the list is sorted. It is called "bubble sort" because, 
imagine you have a container filled with water and a bunch of bubbles of different sizes floating inside when the bottle shakes. 
If we observe we can see  the smallest bubble rises lower compared to the bigger bubbles.

Steps for the algorithm is given below:
1. Start with the first index of elements.
2. Compare the size of first two bubbles .i.e leftmost indexed value with the right one. If they are out of order which means, left value is greater than right value, we swap them.
3. Compare the next pair ( second and third value) and swap if there are out of order.
4. Compare the swap the process until sorted.
5. After one full traversal we know the last value will be the biggest value present in the array, so we decrease the inner loop by i (loop condition : arr.length - i - 1).
``` 
    // traverse from 0 to n-1 when n is the last index    
    for(int i = 0; i < arr.length -1; i++){
        // repeat for every value
        for(int j = 0; j < arr.length-i-1; j++){
            //if next value is greater than current value perform swap
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
```
    Time Complexity: O(n²)
    Space Complexity: O(1)

