class Solution {
    public int maxDepth(String s) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        int  n = s.length();

        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
            }
            else if(ch == ')'){
                count--;
            }
            max = Math.max(max,count);
        }

        return max;
    }
}