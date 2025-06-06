import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Deque<Integer> stack = new LinkedList<>();
		int num = 1;
		boolean result = true;
		StringBuffer bf = new StringBuffer();
		for(int i = 0; i < N; i++ ) {
			int su = A[i];
			if(su >= num) {
				while(su>=num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}
			else {
				int n = stack.pop();
				if(n > su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					bf.append("-\n");
				}
			}
		}
		if(result) {
			System.out.println(bf.toString());
		}

	}
}
