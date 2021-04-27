package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2xn Å¸ÀÏ
public class Main11726 {
	public static int[] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[1001];
		System.out.println(find(n)); 
	}

	public static int find(int val) {
		if (val == 0 || val == 1) {
			return 1;
		}
		if (dp[val] > 0) {
			return dp[val];
		}
		dp[val] = find(val - 2) + find(val - 1);
		return dp[val] % 10007;

	}
}
