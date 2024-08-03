package BinarySearch;

/*
  1) More optimised way of searching an element
  2) Making array asending/decending
  3) Finding middle of array
  4) Posibility of having element at one side is vanished

  5) most optimised condition in my binary search is when my middleElement==targetElement
  6) say arr=[2,4,6,9,11,12,14,20,36,48];
     - target=36
     - mid is ~ 11
     - startEle=12, endEle=48
  7) arr-->sort-->target-->start-->end /2-->newStat-->newEnd and all
  8) worst case complexity in Binary is O(logN)
  9) Optimised to 1 million LinearSearch to 20 BinarySearch
 */


public class BinarySearch {
    public static void main(String args[]){
        int arr[]= {-18, -34, 1, 5, 89, 14, 30, 29};
        int target=14;
        int ans= binarySearching(arr, target);
        System.out.println(ans);
    }
    
    //return index
    //take target
    static int binarySearching(int arr[], int target){
         int start=0;
         int end=arr.length-1;

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

//Constructing order-agnsotic binary search
//which can handel both asc and des arrays



