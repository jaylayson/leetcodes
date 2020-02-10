class Solution {
    public int numberOfSteps (int num) {
        int steps = 0;
        int newNum = num;
        while(newNum != 0){
            steps++;
            if(newNum%2 == 0){
                newNum /= 2;
            }else{
                newNum -=1;
            }
            
        }
        return steps;
    }
}