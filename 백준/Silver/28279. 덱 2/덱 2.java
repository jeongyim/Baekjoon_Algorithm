import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		Deque<Integer> list = new LinkedList<>();
		
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			switch(num) {
			case 1 :
				int X = Integer.parseInt(st.nextToken());
				list.addFirst(X);
				break;
			case 2 :
				int Y = Integer.parseInt(st.nextToken());
				list.addLast(Y);
				break;
			case 3 :
				if(list.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(list.removeFirst()).append("\n");
				}
				break;
			case 4 :
				if(list.size() == 0) {
					sb.append(-1).append("\n");
				}else {
					sb.append(list.removeLast()).append("\n");
				}
				break;
			case 5 :
				sb.append(list.size()).append("\n");
				break;
			case 6 :
				if(list.isEmpty()) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
				break;
			case 7 :
				if(list.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(list.peekFirst()).append("\n");
				}	
				break;
				
			case 8 :
				if(list.isEmpty()) {
					sb.append(-1).append("\n");
				}else {
					sb.append(list.peekLast()).append("\n");
				}	
				break;
			}
		}
		System.out.println(sb);

	}

}
