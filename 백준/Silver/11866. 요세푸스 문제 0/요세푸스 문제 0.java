import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.print.DocFlavor.INPUT_STREAM;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stubb
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer output = new StringBuffer();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		while(queue.size() != 0) {
			for(int j = 0; j < K-1; j++) {
				queue.add(queue.peek());
				queue.remove();
			}
		
		
		if(queue.size() == 1) {
			output.append(queue.peek());
		} else {
			output.append(queue.peek()).append(", ");
		}
		queue.remove();
		}
		System.out.print("<");
		System.out.print(output);
		System.out.print(">");
	}

}
