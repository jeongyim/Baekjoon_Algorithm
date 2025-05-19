import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static boolean[] visit;
	static ArrayList<Integer>[] arr;
	static boolean result;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		visit = new boolean[N];
		arr = new ArrayList[N];
		result = false;
		for(int i = 0; i < N; i++) {
			arr[i] = new ArrayList<>();
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		for(int i =0; i < N;i++) {
			DFS(i,1);
			if(result) {
				break;
			}
		}
		if(result) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		
	}
	private static void DFS(int now, int depth) {
		if(depth == 5) {
			result = true;
			return;
		}
		visit[now] = true;
		for(int i : arr[now]) {
			if(!visit[i]) {
				DFS(i, depth+1);
			}
		}
		visit[now] = false;
	}

}
