import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int max = 0;  // 최댓값
		int N = 0;    // 행
		int M = 0;    // 열 
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(max <= arr[i][j]) {
					max = arr[i][j];
					N = i + 1;
					M = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(N + " " + M);
	}

}