import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Collections.sort()사용할 경우-> 배열X, list계열 사용
		
		for(int k = 0; k < N; k++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		//Arrays.sort(arr); _최악의 경우 n^2 걸림
		Collections.sort(list); 
		//timsort 합병정령,삽입정렬인 hybrid sorting 알고리즘 사용
		
		for(int result : list) {
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}
}