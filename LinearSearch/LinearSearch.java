package LinearSearch;
import java.util.*;

// public class LinearSearch {
    
    
//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5,6};
//         int target=5;
//         int ans=linSearch(nums, target);
//         System.out.println(ans);
        
//     }
    
//     static int linSearch(int arr[], int target){
//         if(arr.length==0){
//             return -1;
//         }
    
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 return i;
//             }
//         }
        
//         return -1;
//     }
    
    
// }

//-----------------------------------
//finding an element in array

// public class LinearSearch {
    
    
//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5,6};
//         int target=5;
//         int ans=linSearch(nums, target);
//         System.out.println(ans);
        
//     }
    
//     static int linSearch(int arr[], int target){
//         if(arr.length==0){
//             return -1;
//         }
    
//         for(int element : arr){
//             if(element==target){
//                 return element;
//             }
//         }
        
//         return -1;
//     }
    
    
// }

//----------------------------------------
//finding  character in String

// public class LinearSearch {
    
    
//     public static void main(String args[]){
//         String name="Nihar";
//         char target='a';
//         System.out.println(search(name,target));

//         System.out.println(Arrays.toString(name.toCharArray()));
        
//     }
    
//     static boolean search(String str, char target){
//          if(str.length()==0){
//             return false;
//          }

//         //  for(int i=0;i<str.length();i++){
//         //     if(target==str.charAt(i)){
//         //         return true;
//         //     }
//         //  }

//         //alternative approach:

//         for(char ch : str.toCharArray()){
//             if(ch==target){
//                 return true;
//             }
//         }

//          return false;
//     }
    
// }

//-----------------------------------------------
//In following we r finding minimum number 

// public class LinearSearch {
    
    
//     public static void main(String args[]){
//         int arr01[]={0,1,2,3,4,5,6,7};
//         System.out.println(search(arr01)); //0
        
//     }
    
//     static int search(int arr[]){

//          int min=arr[0];
//          for(int i=0;i<arr.length;i++){
//             if(min>arr[i]){
//                 min=arr[i];
//             }
//          }
//          return min;  
//     }
    
// }

//-----------------------------------------------
//returning a target element form 2d array

// public class LinearSearch {
    
    
//     public static void main(String args[]){
//         int arr02[][]={
//             {23, 4, 1},
//             {18, 12, 3, 9},
//             {1, 2, 3, 4},
//             {57, 9}
//         };

//         int target=57;
//         int ans[]= search(arr02, target);
//         System.out.println(Arrays.toString(ans));
//     }
    
//     static int[] search(int arr[][], int target){
//           for(int row=0; row<arr.length; row++){
//              for(int col=0; col<arr[row].length; col++){
//                 if(arr[row][col] == target){
//                     return new int[]{row, col};
//                 }
//              }
//           }
//           return new int[]{-1, -1};
//     }
    
// }

//-----------------------------------------------------
//Finding maximum value

// public class LinearSearch {
    
    
//     public static void main(String args[]){
//         int arr02[][]={
//             {23, 4, 1},
//             {18, 12, 3, 9},
//             {1, 2, 3, 4},
//             {57, 9}
//         };

//         int ans= search(arr02);
//         System.out.println(ans);
//     }
    
//     static int search(int arr[][]){
//           int max=Integer.MIN_VALUE;
//           for(int[] ints: arr){
//              for(int anInt : ints){
//                 if(anInt >max){
//                    max= anInt;
//                 }
//              }
//           }
//           return max;
//     }
    
// }

//-----------------------------------------------
 

// public class LinearSearch {
//     //how many even number of digits
    
//     public static void main(String args[]){
//        int nums[]={12,345,2,6,7896};
//        int ans=search(nums);
//        System.out.println(ans); 
//     }
    
//     static int search(int arr[]){
//         int count01=0; //------------

//         if(arr.length==0){
//             return -1;
//         } //--------------------------

//         for(int element : arr){
//             if(even(element)){  //creating an even function which tells element have even digits or not
//                 count01++;
//             }
//         } 
        
//         //---------------------------
//        /*
//          methods to check if didgit have even ecount or not
//          1) count numb of digits
//          2) convert it to string and take its length
//          --- using method 1) :
//         */


//         return count01;
//     }//---------------------------------------

//     static boolean even(int element){
//         int numberOfDigits = digit(element);
//         if(numberOfDigits%2==0){
//             return true;
//         }
//         return false;
//     }//----------------------------------------

//     static int digit(int element){
//         //---------------------------- Base Cases
//         if(element < 0){
//             element = element*-1;
//         }

//         if(element==0){
//             return 1;
//         }
//         //----------------------------
//          int count=0;

//          while(element>0){
//             count++;
//             element=element/10;
//          }
//          //This is not optimised
//          //Makin it optimised, return (int)(Math.log10(element)) +1;
//          //insted of this all count method and all......

//          return count;
//     }//-------------------------------------------
    
// }

//----------------------------------------------
//making the above optimised

public class LinearSearch {
    //how many even number of digits
    
    public static void main(String args[]){
       int nums[]={12,345,2,6,7896};
       int ans=search(nums);
       System.out.println(ans); 
    }
    
    static int search(int arr[]){
        int count01=0; //------------

        if(arr.length==0){
            return -1;
        } //--------------------------

        for(int element : arr){
            if(even(element)){  //creating an even function which tells element have even digits or not
                count01++;
            }
        } 
        
        //---------------------------
       /*
         methods to check if didgit have even ecount or not
         1) count numb of digits
         2) convert it to string and take its length
         --- using method 1) :
        */


        return count01;
    }//---------------------------------------

    static boolean even(int element){
        int numberOfDigits = digit(element);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }//----------------------------------------

    static int digit(int element){
        //---------------------------- Base Cases
        if(element < 0){
            element = element*-1;
        }

        if(element==0){
            return 1;
        }
        //----------------------------
        return (int)(Math.log10(element)) + 1; //Its now optimised
    }//-------------------------------------------
    
}

//--------------------------------------------------------- 