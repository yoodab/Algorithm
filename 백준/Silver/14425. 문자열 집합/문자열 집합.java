import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N과 M 읽기 (StringTokenizer 사용)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 집합 S를 저장할 HashSet 생성
        // HashSet은 평균 O(1)의 시간 복잡도로 삽입 및 검색(contains) 가능
        HashSet<String> sSet = new HashSet<>();

        // N개의 문자열을 HashSet에 저장
        for (int i = 0; i < n; i++) {
            sSet.add(br.readLine());
        }

        // 집합 S에 포함된 문자열의 개수를 셀 변수 초기화
        int count = 0;

        // M개의 문자열을 읽으면서 HashSet에 포함되어 있는지 확인
        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            // HashSet의 contains 메소드를 사용하여 해당 문자열이 집합 S에 있는지 확인
            if (sSet.contains(query)) {
                count++; // 포함되어 있다면 count 증가
            }
        }

        // 결과 출력
        System.out.println(count);

        // BufferedReader 닫기
        br.close();
    }
}