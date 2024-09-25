import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];   //원본 배열
		int[] arry = new int[N];  //정렬 할 배열
		HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
		int rank = 0;
		
		for(int t = 0; t < N; t++) {
			arry[t] = arr[t] = sc.nextInt();
		}
		
		Arrays.sort(arry);
		
		for(int result : arry ) {
			if(!rankMap.containsKey(result)) {
				rankMap.put(result, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int result : arr) {
			sb.append(rankMap.get(result)).append(" ");
		}
		System.out.println(sb);

	}

}
