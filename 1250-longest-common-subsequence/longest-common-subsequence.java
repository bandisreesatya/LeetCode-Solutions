class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int[][] dp=new int[n1+1][n2+1];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                char ch1=text1.charAt(i);
                char ch2=text2.charAt(j);
                if(ch1==ch2){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}