package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14501___lookagain {
	public static int ti[];
	public static int pi[];
	public static int dp[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ti = new int[n + 10];
		pi = new int[n + 10];
		dp = new int[n + 10];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			ti[i] = Integer.parseInt(st.nextToken());
			pi[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		for (int i = 0; i <= n; i++) {
			dp[i] = Math.max(dp[i], max);
			dp[ti[i] + i] = Math.max(dp[ti[i] + i], pi[i] + dp[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);

	}

}
