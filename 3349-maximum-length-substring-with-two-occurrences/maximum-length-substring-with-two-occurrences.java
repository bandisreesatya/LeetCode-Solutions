class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int i=0,j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)<=2){
                max=Math.max(max,j-i+1);
            }
            else{
                while(i<n && ch!=s.charAt(i)){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    i++;
                }
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            j++;
        }
        return max;
    }
}