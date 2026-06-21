class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0;
        int max=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,1+map.getOrDefault(ch,0));
            if(map.get(ch)>1){
                while(s.charAt(j)!=ch){
                    map.put(s.charAt(j),0);
                    j++;
                }
                j++;
                map.put(ch,1);
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}