package BinarySearch;

public class FaceBook01 {
    // public static void main(String args[]){
    //      int nums[]= {5,7,7,8,8,10};
    //      searchRange(nums, 8);
    // }

    // public static int[] searchRange(int[] nums, int target) {

    //      int ans[]= {-1, -1}; //initialised

    //      int start= search(nums, target, true); //true represents, yes i am finding starting index
    //      int end=   search(nums, target, false); //false represents,  i am finding ending index

    //      ans[0]=start;
    //      ans[1]=end; //updating the ans array

    //      return ans;
    // }


    // //Returning the index of target
    // static int search(int nums[], int target, boolean findStartIndex){ //Boolean condireing if i am finding the start value or not.


    //          //Simple Binary Search
    //          int ans=-1; //potential answer
            
    //          int start=0;
    //          int end= nums.length-1;
     
     
    //          while(start <= end){

    //             int mid= start + (end-start)/2;


    //              if(target < nums[mid]){
    //                  end= mid-1;
    //              }
     
    //              else if(target > nums[mid]){
    //                  start= mid+1;
    //              }
     
    //              else{
    //                  ans=mid; //updating our mid with potential answer to start again the binary search

    //                  if(findStartIndex){
    //                     end=mid-1;   //if in next trial, element existed at left
    //                  } else{
    //                     start=mid+1; //if in next trial, element existed at right
    //                  }

    //              }
    //          }

    //          return ans;
    //  }




    public static void main(String args[]){
        //finding index value of first and last element in sorted array
        int[] arr={5,7,7,8,8,10};
        //creating a new array to store index
        int finalAns[]={-1,-1};

        finalAns[0]= searchElements(arr, 8, true);
        finalAns[1]= searchElements(arr, 8, false);   //updated values from -1,-1 to actual indexes

        System.out.println(finalAns);
    }

    static int searchElements(int arr[], int target, boolean weAreFindingstartIndex){
        int potentialAns=0; //initialised it's index
      
        int start=0;
        int end= arr.length-1;

        while(start <= end){
            int mid= start + (start-end)/2;

            if(target < arr[mid]){
                end= mid-1;
            }

            else if(target > arr[mid]){
                start= mid+1;
            }

            else if(target == arr[mid]){
                //Now here we could find our actual answer, or it might be another potential answer
                //update our potential ans
                potentialAns= mid;  

                //our ans dep, we finding start index or end index, 
                if(weAreFindingstartIndex){
                    //start index will ofc at left of potential ans
                    //hence apply binary search again
                    end=mid-1;  //note that, here mid is now our new potentialAns index
                } else{
                    //else if we finding ending index, we updae it's start
                    start=mid+1;
                }
            }
        }

        //at the end we break out loop and return our actual potentialAns
        return potentialAns;
    }

}

