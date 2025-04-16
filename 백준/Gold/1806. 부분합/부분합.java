import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        // S가 최대 100,000,000 이고, 수열의 합이 이를 넘을 수 있으므로 long 사용
        long s = Long.parseLong(st.nextToken()); 

        int[] sequence = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        // 최소 길이를 저장할 변수. 초기값은 불가능한 값(N+1)으로 설정
        int minLength = n + 1; 
        // 투 포인터 알고리즘을 위한 시작(start)과 끝(end) 포인터
        int start = 0;
        // 부분합을 저장할 변수. s와 마찬가지로 long 사용
        long currentSum = 0; 

        // end 포인터를 수열의 끝까지 이동시킨다
        for (int end = 0; end < n; end++) {
            // 현재 end 위치의 원소를 부분합에 더한다 (윈도우 확장)
            currentSum += sequence[end];

            // 현재 부분합(currentSum)이 S 이상인 동안 반복
            // S 이상이 되는 가장 짧은 길이를 찾아야 하므로, 조건을 만족하면 start를 증가시켜 윈도우를 축소 시도
            while (currentSum >= s) {
                // 현재 윈도우의 길이(end - start + 1)와 기존 최소 길이(minLength) 비교하여 더 작은 값으로 갱신
                minLength = Math.min(minLength, end - start + 1);
                
                // 윈도우를 오른쪽으로 이동(축소)하기 위해 start 위치의 원소를 부분합에서 뺀다
                currentSum -= sequence[start];
                // start 포인터 증가
                start++;
            }
        }

        // 만약 minLength가 초기값(n + 1) 그대로라면, 합이 S 이상인 부분합을 찾지 못한 것
        if (minLength == n + 1) {
            System.out.println(0);
        } else {
            // 찾은 최소 길이 출력
            System.out.println(minLength);
        }

        br.close();
    }
}