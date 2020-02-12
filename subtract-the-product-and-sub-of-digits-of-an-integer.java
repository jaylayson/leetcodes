class Solution {
    public int subtractProductAndSum(int n) {
        int num = 1; //first loop will always multiply by 1
        int num0 = 0; //first loop will always add to 0
        String s = String.valueOf(n); //string representation of parameter n
        
		//s.length-1 because length gives the integer 3 but we only need 0,1,2.
		//loop while i >= 0
		for(int i = s.length()-1; i >= 0; i--){
            String sub = s.substring(i, i+1);  //get substring, start at the end. 
												//e.g 234 substring(2,3) will return 4
												//note: we are able to use the number 3
												//as it is the maximum length of the string
												//hence indexOutOfBounds error isn't occuring
            num *= Integer.parseInt(sub);
            num0 += Integer.parseInt(sub);
        }
        return num - num0;
    }
}