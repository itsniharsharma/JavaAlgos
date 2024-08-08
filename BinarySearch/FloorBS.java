package BinarySearch;

public class FloorBS {
    public static void main(String[] args) {
        /*
          Q1 to find Floor of a number
            Floor is greater element smaller than or equal to target element
            say arr[]={2,3,4,16,17,19}
            Floor of target=15 will be 14
          -Given that array is sorted, either asc or des
         */
  
         int arr[]={2,3,4,9,14,16,19};
         int target=15;
         int ans= Floor(arr, target);
         System.out.println(ans); //14
  
      }
  
      static int Floor(int arr[], int target){
         int start=0;
         int end=arr.length;

         //If say there exists DNE element smaller than target value, incase target=2 say, return -1
         if(target < arr[0]){
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
  
         return arr[end];   //This is major point of focus, it wont return -1, if target not found, it return number just smaller than target
      }
}
