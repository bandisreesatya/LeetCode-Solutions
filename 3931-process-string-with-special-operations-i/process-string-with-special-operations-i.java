class Solution {
    public String processStr(String s) {
        int n=s.length();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                str.append(str);
            }
            else if(ch=='*'){
                if(str.length()!=0){
                    str.deleteCharAt(str.length()-1);
                }
            }
            else if(ch=='%'){
                str.reverse();
            }
            else{
                str.append(ch);
            }
    }
    return str.toString();
}
}