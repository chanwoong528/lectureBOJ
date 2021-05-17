import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main17413 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Character> s = new Stack<>();
		Queue<Character> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		String input = br.readLine();
		boolean tag = false;
		for (int j = 0; j < input.length(); j++) {
			char temp = input.charAt(j);
			if (temp == '<') {
				tag = true;
				while (!s.isEmpty()) {
					sb.append(s.pop());
				}
				sb.append(temp);

			} else if (temp == '>') {
				sb.append(temp);
				tag = false;
			} else if (temp == ' ') {
				while (!s.isEmpty()) {
					sb.append(s.pop());
				}
				sb.append(' ');
			} else {
				if (tag == true) {
					sb.append(temp);
				} else {
					s.push(temp);
				}

			}

		}
		while (!s.isEmpty()) {
			sb.append(s.pop());
		}
		System.out.println(sb);
	}
}
