class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                s=s.replace(ch,Character.toLowerCase(ch));
            }
        }
        return s;
    }
}