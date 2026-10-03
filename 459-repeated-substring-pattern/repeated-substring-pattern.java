class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {
            if (n % len != 0) {
                continue;
            }

            int i = 0;
            int j = len;

            while (j < n && s.charAt(i) == s.charAt(j)) {
                i++;
                j++;

                if (i == len) {
                    i = 0;
                }
            }

            if (j == n) {
                return true;
            }
        }

        return false;
    }
}
 