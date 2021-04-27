package dp;
//1로 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1463 {
	public static int dp[];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[1000001];
		System.out.println(makeOne(n));
	}

	
	public static int makeOne(int val) {
		if (val == 1) {
			return 0;
		}
		if (dp[val] > 0) {
			return dp[val];
		}
		
		dp[val] = makeOne(val - 1) + 1;
		if (val % 2 == 0) {
			int temp = makeOne(val / 2) + 1;
			if (dp[val] > temp) {
				dp[val] = temp;
			}
		}
		if (val % 3 == 0) {
			int temp = makeOne(val / 3) + 1;
			if (dp[val] > temp) {
				dp[val] = temp;
			}

		}
		return dp[val];

	}
}
