class Solution {
    public boolean isPalindrome(String s) {
        String nS = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        
        int i=0, j=nS.length()-1;
        while(i<j){
            if(nS.charAt(i)==nS.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
