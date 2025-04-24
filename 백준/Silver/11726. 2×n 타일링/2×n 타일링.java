import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long D[] = new long[1001];
		D[1] = 1; //n = 1일 때, 타일 채우는 경우의 수
		D[2] = 2; //n = 2일 때, 타일 채우는 경우의 수
		
		for(int i = 3; i<=n; i++) {
			D[i] = (D[i-1] + D[i-2]) % 10007;
		}

		System.out.println(D[n]);
	}

}