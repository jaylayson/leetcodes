class Solution {
    public int numJewelsInStones(String J, String S) {
        String[] jewels = new String[J.length()]; //initialize array for individual jewel strings
        String[] stones = new String[S.length()]; //initialize array for individual stone strings
        int counter = 0; //count each match
        
        //get each substring of J and add an element in jewels[]
        for(int i = 0; i < jewels.length; i++){
            jewels[i] = J.substring(i, i+1);   
        }//end of for
        
        //get each substring of S and add an element in stones[]
        for(int j = 0; j < stones.length; j++){
            stones[j] = S.substring(j, j+1);
        }//end of for
        
        //go through each combination of indices in both arrays
        //check matches and increment counter
        for(int ii = 0; ii < jewels.length; ii++){
            for(int jj = 0; jj < stones.length; jj++){
                if(stones[jj].contains(jewels[ii])){
                    counter++;
                }//end of if
            }//end of 2nd for
        }//end of 1st for
        
        
        //System.out.println(Arrays.toString(jewels)); //debug code
        //System.out.println(Arrays.toString(stones)); //debug code
        return counter;
    }//end of numJewelsIntStones
}//end of class