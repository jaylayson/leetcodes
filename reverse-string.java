class Solution {
public void reverseString(char[] s) {
    	int j = s.length - 1; //end of char array (right index)
    	for(int i = 0; i < Math.ceil(s.length/2); i++) {//loop until halfway into the array and round up for odd numbers
                                                        //e.g 5/2 = 2.5, round up to 3
                                                        //i == left index/pointer. increment i to move pointer to the right of array
    		char temp = s[i];  //hold previous array[i] value (avoids duplicating the same letter in the entire array)       
    		s[i] = s[j]; //swap left index and right index values
    		s[j] = temp; //assign right index previous left index(previous array[i] value)
    		j--; //decrement j to move pointer left of the array
    	}
    }
}
