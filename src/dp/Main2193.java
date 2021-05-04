package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2193 {
	public static long dp[][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new long[n + 1][2];
		dp[1][0] = 0;
		dp[1][1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j <= 1; j++) {
				if (j == 0) {
					dp[i][j] = dp[i - 1][0] + dp[i - 1][1];
				}
				if (j == 1) {
					dp[i][j] = dp[i - 1][0];
				}
			}
		}
		long answer = 0;
		for (int i = 0; i < 2; i++) {
			answer = answer + dp[n][i];
		}
		System.out.println(answer);
	}

}
