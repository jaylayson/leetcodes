class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> decompressedList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i+=2){ //+2 to go to next pair
            for (int j = 0; j < nums[i]; j++){//loop for nums[i] amount of times (frequency based on index value)
                decompressedList.add(nums[i+1]);//add/append the next index to the arraylist
            }
        }     
        return decompressedList.stream().mapToInt(i -> i).toArray();//convert arraylist to array (java-8)
        //https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
    }
}
