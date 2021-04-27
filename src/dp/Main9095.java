package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9095 {
	public static int dp[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			dp = new int[12];
			int n = Integer.parseInt(br.readLine());
			sb.append(find(n)).append("\n");
		}
		System.out.println(sb);

	}

	public static int find(int n) {
		if (n == 0 || n == 1) {
			dp[n] = 1;
		}
		if (n == 2) {
			dp[n] = 2;
		}

		if (dp[n] > 0) {
			return dp[n];
		}
		dp[n] = find(n - 1) + find(n - 2) + find(n - 3);
		return dp[n];
	}

}
