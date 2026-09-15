class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();

        // pal[l][r] = true if s[l...r] is a palindrome
        boolean[][] pal = new boolean[n][n];

        // Build palindrome table
        for (int len = 1; len <= n; len++) {
            for (int l = 0; l + len - 1 < n; l++) {
                int r = l + len - 1;

                if (s.charAt(l) == s.charAt(r)) {
                    if (len <= 2) {
                        pal[l][r] = true;
                    } else {
                        pal[l][r] = pal[l + 1][r - 1];
                    }
                }
            }
        }

        // dp[i] = maximum number using first i characters
        int[] dp = new int[n + 1];

        for (int r = 0; r < n; r++) {
            // Don't use a palindrome ending at r
            dp[r + 1] = dp[r];

            // Try every substring ending at r
            for (int l = 0; l <= r - k + 1; l++) {
                if (pal[l][r]) {
                    dp[r + 1] = Math.max(dp[r + 1], dp[l] + 1);
                }
            }
        }

        return dp[n];
    }
}