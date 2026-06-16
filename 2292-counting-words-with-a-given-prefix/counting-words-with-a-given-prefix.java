class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=pref.length();
        int count=0;
        for(int i=0;i<words.length;i++){
            String str=words[i];
            if((str.length()>=n) && (str.substring(0,n).equals(pref))){
                count++;
            }
        }
        return count;
    }
}