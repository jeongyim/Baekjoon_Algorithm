import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Deque<int[]> deque = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			while(!deque.isEmpty() && deque.getLast()[0] >= A[i]) {
				deque.removeLast();
			}
			deque.addLast(new int[] {A[i], i});
			if(deque.getFirst()[1] <= i - L) {
				deque.removeFirst();
			}
			sb.append(deque.getFirst()[0]).append(" ");
		}
		System.out.println(sb);
	}
}
