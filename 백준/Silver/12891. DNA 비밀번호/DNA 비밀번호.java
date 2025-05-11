import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static char[] DNA;
	static int[] ACGT;
	static int[] myACGT;
	static int count;
	static int result;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		DNA = new char[S];
		ACGT = new int[4];
		myACGT = new int[4];
		count = 0;
		result = 0; // count가 4이면 result++;
		String str = br.readLine();
		for(int i = 0; i < S; i++) {
			DNA[i] = str.charAt(i);
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < ACGT.length; i++) {
			ACGT[i] = Integer.parseInt(st.nextToken());
			if(ACGT[i] == 0) {
				count++;
			}
		}
		
		for(int i = 0; i < P; i++) {
			add(DNA[i]);
		}
		check();
		
		for(int i = P; i < S; i++) {
			int j = i-P;
			add(DNA[i]);
			remove(DNA[j]);
			check();
		}
		
		System.out.println(result);
	}

	private static void check() {
		if(count == 4) {
			result++;
		}
		
	}

	private static void remove(char c) {
		switch (c) {
		case 'A':
			if(myACGT[0] == ACGT[0]) {
				count--;
			}
			myACGT[0]--;
			break;
			
		case 'C':
			if(myACGT[1] == ACGT[1]) {
				count--;
			}
			myACGT[1]--;
			break;
			
		case 'G':
			if(myACGT[2] == ACGT[2]) {
				count--;
			}
			myACGT[2]--;
			break;
			
		case 'T':
			if(myACGT[3] == ACGT[3]) {
				count--;
			}
			myACGT[3]--;
			break;

		}
		
	}

	private static void add(char c) {
		switch(c) {
		case 'A':
			myACGT[0]++;
			if(myACGT[0] == ACGT[0]) {
				count++;
			}
			break;
			
		case 'C':
			myACGT[1]++;
			if(myACGT[1] == ACGT[1]) {
				count++;
			}
			break;
			
		case 'G':
			myACGT[2]++;
			if(myACGT[2] == ACGT[2]) {
				count++;
			}
			break;
			
		case 'T':
			myACGT[3]++;
			if(myACGT[3] == ACGT[3]) {
				count++;
			}
			break;
		}
	}
}
