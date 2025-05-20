import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static boolean[] checkD;
	static boolean[] checkB;
	static StringBuilder sb;
	static ArrayList<Integer>[] A;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		checkD = new boolean[N+1];
		checkB = new boolean[N+1];
		A = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) {
			A[i] = new ArrayList<>();
		}
		for(int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		for(int i = 1; i <= N; i++) {
			Collections.sort(A[i]);
		}
		
		DFS(V);
		sb.append("\n");
		BFS(V);
		System.out.println(sb);

	}
	
	private static void DFS(int v) {
		if(checkD[v]) {
			return;
		}
		checkD[v] = true;
		sb.append(v + " ");
		for(int num : A[v]) {
			if(!checkD[num]) {
				DFS(num);
			}
		}
	}

	private static void BFS(int v) {
		Queue<Integer> que = new LinkedList<>();
		que.offer(v);
		checkB[v] = true;
		
		while(!que.isEmpty()) {
			int now = que.poll();
			sb.append(now + " ");
			for(int num : A[now]) {
				if(!checkB[num]) {
					checkB[num] = true;
					que.offer(num);
				}
			}	
		}	
	}
}
