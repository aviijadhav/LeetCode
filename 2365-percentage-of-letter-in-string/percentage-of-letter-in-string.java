class Solution {
    public int percentageLetter(String s, char letter) {
        int lCount = 0;
        int total = s.length();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == letter){
                lCount++;
            }
        }
        return (lCount *100)/total;
    }
}