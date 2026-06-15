class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                str.append(Character.toLowerCase(ch));
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}