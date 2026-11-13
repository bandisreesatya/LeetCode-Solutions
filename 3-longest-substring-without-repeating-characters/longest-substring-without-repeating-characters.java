class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        int max = 0;
        while (j < n){
            char ch = s.charAt(j);
            if (!set.contains(ch)){
                set.add(ch);
            }
            else{
                while(i < n && s.charAt(i) != ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
        }
    }
