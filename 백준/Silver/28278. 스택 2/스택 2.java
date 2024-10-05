import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] stack = new int[N];
		int top = -1;
		
		for(int t = 0; t < N; t++) {
			String[] input = br.readLine().split(" ");
			int order = Integer.parseInt(input[0]);
			switch(order) {
			case 1:
				int x = Integer.parseInt(input[1]);
				stack[++top] = x;
				break;
			
			case 2:
				if(top == -1) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack[top--]);
				}
				break;
			case 3:
				System.out.println(top + 1);
				break;
			case 4:
				if(top == -1) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				break;
			case 5:
				if(top == -1) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack[top]);
				}
				break;
			}
		}

	}

}
