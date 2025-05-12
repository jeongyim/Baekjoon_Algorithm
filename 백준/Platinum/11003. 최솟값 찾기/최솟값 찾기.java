import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Deque<int[]> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            // 1. 새로운 값보다 큰 값들은 뒤에서 제거
            while(!deque.isEmpty() && deque.getLast()[0] >= A[i]) {
                deque.removeLast();
            }

            // 2. 현재 값 넣기 (값, 인덱스)
            deque.addLast(new int[]{A[i], i});

            // 3. 범위를 벗어난 값 앞에서 제거
            if(deque.getFirst()[1] <= i - L) {
                deque.removeFirst();
            }

            // 4. 덱의 첫 번째 값이 현재 윈도우의 최소값
            sb.append(deque.getFirst()[0]).append(" ");
        }

        System.out.println(sb);
    }
}