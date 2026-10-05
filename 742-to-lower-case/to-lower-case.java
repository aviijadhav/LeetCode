class Solution {
    public String toLowerCase(String s) {

        StringBuilder res = new StringBuilder();

        for(char c : s.toCharArray()){
            res.append(Character.toLowerCase(c));
        }
    return res.toString();
    }
}