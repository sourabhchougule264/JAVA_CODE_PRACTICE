package com.practice.array.questions;

import java.util.*;

public class LargestConsegativeArray {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      
      int[] arr = {100, 200, 1, 3, 2, 4, 101,102,103,104,105,106,107};
      quickSort(0,arr.length - 1,arr);
      
      for(int num : arr){
        System.out.print(num + " ");
      }
      System.out.println("");
      List<List<Integer>> elementsList = new ArrayList<>();
      List<Integer> elements = new ArrayList<>();
      int i;
      for(i = 0; i < arr.length; i++){
          if( i != arr.length - 1){
            //i == 4 i+1 == 100
            if(arr[i + 1] == arr[i] + 1){
              elements.add(arr[i]);
              
            }else{
              elements.add(arr[i]);
              elementsList.add(elements);
              elements.clear();
            }
          }
      }
      // elementsList.stream().filter((e1,e2) -> e2.size() - e1.size()).collect(collectors.toList()).get(0);
  }
  
  public static void quickSort(int low, int high, int[] arr){
    
    if(low < high){
      
      int pivot = partition(arr,low,high);
      quickSort(low,pivot -1, arr);
      quickSort(pivot + 1,high,arr);
    }
  }
  
  public static int partition(int[] arr, int low, int high){
    
    int pivot = arr[high];
    int i = low - 1;
    
    for(int j = low; j < high; j++){
      if(arr[j] < pivot){
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
      
    }
    
    int temp = arr[i + 1];
    arr[i + 1] = pivot;
    arr[high] = temp;
    
    return i + 1;
  }
}