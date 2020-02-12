class Solution {
    public int findNumbers(int[] nums) {
        //counter for array elements with even digits
        int counter = 0;
        
        //for-loop until end of arr.length -1(if 5 elements,01234)
        for(int i = 0; i < nums.length; i++){
            String sub = String.valueOf(nums[i]).substring(0); //convert element to string
                                                                //then take the substring
            int subLength = sub.length(); //store length (digits) of the substring as int
            
            //if sublength mod 2 is 0, consider as an even digit,increase counter.
            if(subLength%2 == 0){
                counter++;
            }//end of if
        }//end of for-loop
        return counter;
    }//end of findNumbers
}