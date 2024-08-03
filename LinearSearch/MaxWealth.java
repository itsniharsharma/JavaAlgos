package LinearSearch;

public class MaxWealth {
    public static void main(String args[]){
        /*
          accounts=[[1,2,3],[3,2,1]]
          means [ 
                  [1,2,3]
                  [3,2,1]
                ]
                  means person01 1 2 3 
                        person02 3 2 1
                  which one has more wealth....
         */
    }

    public int maximumWealth(int[][] accounts){

        int ans=Integer.MIN_VALUE;

        for(int person=0; person<accounts.length; person++){  //person is row
            //when starting a new col, take sum of that row, telling wealth of person 1
            int sum=0;
            for(int accAddress=0; accAddress<accounts[person].length; accAddress++ ){ //accAddrsss is col iterating over every person
                sum += accounts[person][accAddress];
            }
            //now we have sum of accounts of person
            //check with overall answer
            if(sum > ans){
                ans=sum;
            }
        }
        return ans;
    }
}
