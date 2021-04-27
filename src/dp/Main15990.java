package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15990 {

	public static long dp[][];
	public static long mod = 1000000009;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		dp = new long[100001][4];

		dp[1][1] = 1;
		dp[2][2] = 1;
		dp[3][1] = 1;
		dp[3][2] = 1;
		dp[3][3] = 1;

		for (int i = 0; i < t; i++) {

			int n = Integer.parseInt(br.readLine());
			sb.append((find(n, 1) + find(n, 2) + find(n, 3)) % mod).append("\n");
		}
		System.out.println(sb);

	}

	private static long find(int n, int num) {
		if (n <= 3 || dp[n][num] != 0) {
			return dp[n][num];
		}
		dp[n][1] = (find(n - 1, 2) + find(n - 1, 3)) % mod;
		dp[n][2] = (find(n - 2, 1) + find(n - 2, 3)) % mod;
		dp[n][3] = (find(n - 3, 1) + find(n - 3, 2)) % mod;
		return dp[n][num] % mod;
	}
}
