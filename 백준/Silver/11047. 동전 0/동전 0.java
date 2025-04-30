import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // 입력을 받기 위한 BufferedReader 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫 줄에서 N (동전 종류 수)와 K (만들어야 할 가치)를 읽음
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 동전의 가치를 저장할 배열 선언
        int[] coins = new int[n];

        // N개의 줄에 걸쳐 동전의 가치를 입력받아 배열에 저장 (오름차순으로 주어짐)
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        // 필요한 동전 개수를 셀 변수 초기화
        int count = 0;

        // 가장 가치가 큰 동전부터 확인하기 위해 배열의 끝에서부터 시작
        // (Greedy 접근 방식: 가장 큰 가치의 동전을 최대한 많이 사용)
        for (int i = n - 1; i >= 0; i--) {
            // 현재 동전의 가치가 남은 가치 K보다 작거나 같으면 사용 가능
            if (coins[i] <= k) {
                // 현재 동전으로 지불할 수 있는 최대 개수 계산
                int numCoins = k / coins[i];
                // 사용한 동전 개수를 총 개수에 더함
                count += numCoins;
                // 남은 가치 K를 업데이트 (현재 동전 가치로 나눈 나머지)
                k %= coins[i]; // k = k - (numCoins * coins[i]) 와 동일
            }

            // 만약 남은 가치가 0이 되면 더 이상 동전이 필요 없으므로 반복 종료
            if (k == 0) {
                break;
            }
        }

        // 최종적으로 계산된 최소 동전 개수 출력
        System.out.println(count);
    }
}