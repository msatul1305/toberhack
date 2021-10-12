def knapSack(self, W: maxMCapacity, wt: weightarray, val: valuearray, n):
    dp = [[0] * (W + 1) for i in range(n + 1)]

    for i in range(1, n + 1):
        for j in range(1, W + 1):
            if wt[i - 1] <= j:
                dp[i][j] = max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j])
            elif wt[i - 1] > j:
                dp[i][j] = dp[i - 1][j]
    print(dp)
    return dp[n][W]