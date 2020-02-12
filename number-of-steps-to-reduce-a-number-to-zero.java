class Solution {
    public int numberOfSteps (int num) {
        int steps = 0;
        int newNum = num;
        while(newNum != 0){ //until newNum == 0
            steps++; //increment counter
			
			//if newNum is even
            if(newNum%2 == 0){
                newNum /= 2;
            }else{
				//if newNum is odd
                newNum -=1;
            }//end of if-else
            
        }//end of while
        return steps;
    }//end of numberOfSteps
}
