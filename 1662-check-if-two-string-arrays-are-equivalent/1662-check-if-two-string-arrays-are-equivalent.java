class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s=new StringBuilder();
        StringBuilder v=new StringBuilder();

        for(String s1 : word1)
        {
            s.append(s1);
        }
        for(String v1: word2){
            v.append(v1);
        }
        return s.toString().equals(v.toString());
    }
}