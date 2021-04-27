package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11052 {

	public static int dp[];
	public static int price[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		price = new int[n + 1];
		dp = new int[n + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}

		System.out.println(find(n));
//		for (int i = 0; i <= n; i++) {
//			System.out.print(dp[i] + " ");
//		}

	}

	public static int find(int n) {
		if (n == 0) {
			return 0;
		}
		if (dp[n] > 0)
			return dp[n];

		for (int i = 1; i <= n; i++) {

			dp[n] = Math.max(dp[n], find(n - i) + price[i]);
		}

		return dp[n];
	}

}
