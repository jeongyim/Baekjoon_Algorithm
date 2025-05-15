import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		int[] result = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(0);
		for(int i = 1; i < N; i++) {
			while(!stack.isEmpty() && A[stack.peek()] < A[i]) {
				result[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			result[stack.pop()] = -1;
		}
		
		for(int num : result) {
			sb.append(num + " ");
		}
		System.out.println(sb);
		
	}

}
