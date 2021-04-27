package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11727 {
	public static int[] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[1001];

		System.out.println(find(n));
	}

	public static int find(int n) {
		if (n == 1 || n == 0) {
			dp[n] = 1;
		}
		if (n == 2) {
			dp[n] = 3;
		}

		if (dp[n] > 0) {
			return dp[n];
		}
		dp[n] = (find(n - 1) + (2 * find(n - 2)))% 10007;

		return dp[n] ;
	}
}
