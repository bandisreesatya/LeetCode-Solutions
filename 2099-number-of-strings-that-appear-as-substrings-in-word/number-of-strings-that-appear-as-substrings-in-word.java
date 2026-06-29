class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n=patterns.length;
        int c=0;
        for(int i=0;i<n;i++){
            String str=patterns[i];
            if(word.contains(str)){
                c++;
            }
        }
        return c;
    }
}