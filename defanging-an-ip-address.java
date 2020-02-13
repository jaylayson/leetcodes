class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]"); //param:(regex, new string)
    }
}