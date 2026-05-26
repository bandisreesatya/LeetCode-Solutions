class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                freq1[ch-'a']++;
            }
            else{
                freq2[ch-'A']++;
            }
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(freq1[i]>0 && freq2[i]>0){
                c++;
            }
        }
        return c;
    }
}