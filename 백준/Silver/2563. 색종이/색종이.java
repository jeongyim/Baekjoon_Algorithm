import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //색종이 수
		int[][] arr = new int[100][100];
		int result = 0; 
		
		for(int t = 0; t < T; t++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int i = x; i < x +10; i++) {
				for(int j = y; j < y +10; j++) {
					arr[i][j] = 1;
				}
			}
		}
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(arr[i][j] == 1) {
					result++;
				}
			}
		}
		System.out.println(result);

	}

}