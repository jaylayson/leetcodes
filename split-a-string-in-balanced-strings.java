class Solution {
    public int balancedStringSplit(String s) {
        //the balance variable determines a balance when it hits 0
        //when it is not 0, it is still unbalanced
        //create a counter for each times it is balanced
        String[] array = s.split("");
        int counter = 0;
        int balance = 0;
        
        for(String i : array){
            if(i.equals("L")){
                counter++;
            }else if(i.equals("R")){
                counter--;             
            }
            
            if(counter == 0){
                balance++;
            }
        }
        return balance;
    }
}
