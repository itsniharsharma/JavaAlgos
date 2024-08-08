package BinarySearch;

public class CeilingBS {
    public static void main(String[] args) {
      /*
        Q1 to find ceiling of a number
        ceiling is smallest element grater than or equal to target element
        say arr[]={2,3,4,16,17,19}
        ceiling of target=15 will be 16
        -Given that array is sorted, either asc or des
       */

       int arr[]={2,3,4,9,14,16,19};
       int target=15;
       int ans=ceiling(arr, target);
       System.out.println(ans); //16

    }

    static int ceiling(int arr[], int target){
       int start=0;
       int end=arr.length;

       //If my target element is greater than last number of asc element, means graeter than even 19 incase, then we can't find it and 
       if(target > arr[arr.length-1]){
           return -1;
       }

       while(start <= end){
          int mid= start + (end-start)/2;

          if(target > arr[mid]){
             start=mid+1;
          } else if(target < arr[mid]){
             end= mid-1;
          } else if(target == arr[mid]){
             return mid;
          }
       }

       return arr[start];   //This is major point of focus, it wont return -1, if target not found, it return number just grater than target
    }
}
