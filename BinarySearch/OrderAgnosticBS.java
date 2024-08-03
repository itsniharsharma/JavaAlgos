package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[]= {-18, -34, 1, 5, 89, 14, 30, 29};
        int target=14;
        int ans= orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int arr[], int target){
        int start=0;
        int end=arr.length-1;

         //finding whether array is sorted in asc or des
         boolean isAsc = arr[start] < arr[end];


        while(start<=end){
            //  int mid= (start+end)/2;
            // It could be posiible that start+end exceeds int limits, so to optimise it
             int mid= start + (end-start)/2;

             
             if(target==arr[mid]){
                return mid;
             }

             //only implimented if bool isAsc=true
             if(isAsc){
                //possible cases of for our target and updations 
               if(target< arr[mid]){
                end=mid-1;

                } else if(target> arr[mid]){
                start=mid+1;
                }
             }  else{
                if(target> arr[mid]){
                    end=mid-1;
                } else if(target< arr[mid]){
                    start=mid+1;
                }
             }
       }
       return -1;
    }
}
    

