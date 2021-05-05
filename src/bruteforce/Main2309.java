package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main2309 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int arr[] = new int[9];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i];
		}

		boolean check = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sum - (arr[i] + arr[j]) == 100) {
					arr[i] = -1;
					arr[j] = -1;
					check = true;
					break;
				}

			}
			if (check == true) {
				break;
			}

		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				sb.append(arr[i]).append("\n");
			}
		}
		System.out.println(sb);
	}

}
