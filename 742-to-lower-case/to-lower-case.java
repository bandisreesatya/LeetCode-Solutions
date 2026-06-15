class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            s=s.replace(ch,Character.toLowerCase(ch));
        //     if(Character.isUpperCase(ch)){
        //     }
         }
        return s;
    }
}