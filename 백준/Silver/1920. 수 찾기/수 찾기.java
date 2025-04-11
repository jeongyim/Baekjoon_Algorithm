import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static List<Integer> listA;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		listA = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			listA.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(listA);
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(binarySearch(num)) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}

	private static boolean binarySearch(int k) { //k는 listB의 요소 값 
		// TODO Auto-generated method stub
		int left = 0;
		int right = N-1;
		
		while(left <= right) {
			int mid = left + (right-left) / 2;
			if(listA.get(mid) == k) {
				return true;
			} else if(listA.get(mid) < k){ //오른쪽 탐색
				left = mid + 1;
			} else { //왼쪽 탐색
				right = mid - 1;
			}
		}
		return false;
	}
}
