# Sorting Algorithms
This repo talks about all the sorting algorithms those are commonly asked during interviews.
Namely:
* [Bubble Sort](#BubbleSort)
* [Selection Sort](#SelectionSort) 
* [Insertion Sort](#InsertionSort) 
* [Merge Sort](#MergeSort) 
* [Quick Sort](#QuickSort)

## Bubble Sort Algorithm <span id="BubbleSort"></span>
<hr>

[Click to see full implementation](https://github.com/TasinNahian/Sorting-Algorithms/blob/main/BubbleSort.java)

Bubble sort is a simple sorting algorithm that repeatedly steps through a list of elements to be sorted,
compares adjacent elements, and swaps them if they are in the wrong order.
The pass through the list is repeated until the list is sorted. It is called "bubble sort" because, 
imagine you have a container filled with water and a bunch of bubbles of different sizes floating inside when the bottle shakes. 
If we observe we can see  the smallest bubble rises lower compared to the bigger bubbles.

The algorithm is given below:
1. Inner Loop **n-1 times**:
   1. Start with the first index of elements. 
   2. Compare the values of `arr[ j ]` and `arr[ j+1 ]` and swap if `arr[ j ] > arr[ j+1 ]`.
   3. This will move the biggest value to the last index.
   4. As the biggest value is already in the last index iterate 1 less time in inner loop.
2. Repeat the above steps **n-1** times to sort all the values of the array.
   1. Why repeat **n-1** times and not **n** times? (Here n is the length of the arr)?
   
       **Answer:** Well, this is because during the first inner loop will move the biggest value to the end of the array. So, repeating **n times** will swap the biggest index with itself (misuse of computational power).
``` 
   for(int i = 0; i < arr.length -1; i++){
     for(int j = 0; j < arr.length-i-1; j++){
         if(arr[j] > arr[j+1]){                 //comparing the values
             //swap
             int temp = arr[j];                 
             arr[j] = arr[j+1];
             arr[j+1] = temp;
         }
     }
   }
```
```
   Time Complexity: O(n²)
   Space Complexity: O(1)
``` 


## Selection Sort Algorithm <span id="SelectionSort"></span>
<hr>

Selection sort is also a simple comparison-sorting algorithm that works by **selecting** (hence the name selection sort) the smallest element in the array store in the smallest index of the array or vice versa.
The algorithm repeatedly selects the smallest or largest element from the unsorted part and swaps it with the
element at the beginning of the unsorted part. This process continues until the entire array is sorted.

The algorithm is given below:

1. Inner Loop:
   1. Traverse through the array and find the index of the smallest element in the array.
   2. Save the index of the smallest value and swap it with the first index value.
2. Repeat step 1 **n times** and the array is sorted.

``` 
   for(int i = 0; i< arr.length -1; i++){
       int smallest = i;
       //find the smallest element
      for(int j = i+1; j < arr.length; j++ ){
          if(arr[smallest] > arr[j]){
              smallest = j;
          }
      }
      //swap
      int temp = arr[i];
      arr[i] = arr[smallest];
      arr[smallest] = temp;
   }
```
```
   Time Complexity: O(n²)
   Space Complexity: O(1)
``` 

## Insertion Sort Algorithm <span id="InsertionSort"></span>
<hr>

Insertion sort is another comparison-based sorting algorithm that works by dividing the input array into two parts:
the sorted and unsorted part. The  algorithm iterates through the unsorted part of the array, selects an element and inserts it in the sorted part of the array.

The algorithm goes as follows:

1. Consider the **0<sup>th</sup>** element of the array as sorted and the rest of the array form **1<sup>st</sup>** index as unsorted.
2. Iterate through from **1<sup>st</sup>** element.
3. Check if the current value is less than previous value in sorted part of the array, if so, shift the last value of the sorted part of array to the right and check again until the current value is greater than its previous index.
4. Insert the value that index.
5. Iterate through till the end of the array to have a sorted array in non-decreasing order.

```
   for(int i = 1; i< arr.length; i++){
      int currentValue = arr[i];
      int j = i-1;
      //shifting values in sorted part to the right
      while(j>=0 && currentValue < arr[j]){
          arr[j+1] = arr[j];
          j--;
      }
      arr[j+1] = currentValue;
   }
```
```
   Time Complexity: O(n²)
   Space Complexity: O(1)
```
## Merge Sort Algorithm <span id="MergeSort"></span>
<hr>


## Quick Sort Algorithm <span id="QuickSort"></span>
<hr>


