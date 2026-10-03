class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        int s = 0, j = 0;
        while (s <= n - m){
            int i = s; j = 0;
            while (j < m){
                char ch1 = haystack.charAt(i);
                char ch2 = needle.charAt(j);
                if (ch1 == ch2){
                    i++;
                    j++;
                }
                else{
                    break;
                }
                if (j == m){
                    return s;
                }
            }
            s++;
        }
        return -1;
    }
    }
