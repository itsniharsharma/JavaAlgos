package BinarySearch;

public class AmazonBS01 {
    public static void main(String[] args){
          int arr[]= {3,5,7,9,10,90,110,120,150,156,189,200};
          int target=110;
          System.out.println(findingAns(arr, target)); //it gives ans 6 
    }

    static int findingAns(int arr[], int target){
        //first finding the range
        //starting from a chunk

        int start=0;
        int end=1;

        //condition for the target to lie in range
        while(target > arr[end]){
            //increase the chunk size and update start and end
            int newStart=end+1;
            //double the chunk size
            //chunk size= (end-start)
            //doubling it= (end-start)*2

            //updating both start and end
            end= end+ (start-end+1)*2;
            start= newStart;
        }

        //we get out the while loop when condition violated, hence we found our start and end, so just
        return binarySearching(arr, target, start, end);

    }

    //Again copy pasting binary search
    static int binarySearching(int arr[], int target, int start, int end){
        //will pass start and end as parameter

       while(start<=end){
           //  int mid= (start+end)/2;
           // It could be posiible that start+end exceeds int limits, so to optimise it
            int mid= start + (end-start)/2;

            //possible cases of for our target and updations 
            if(target< arr[mid]){
               end=mid-1;

            } else if(target> arr[mid]){
               start=mid+1;

            } else if(target==arr[mid]){
               return mid;
            }
       }

       return -1;
       
   }
}
