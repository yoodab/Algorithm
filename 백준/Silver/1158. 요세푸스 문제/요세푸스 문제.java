import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        StringBuilder result = new StringBuilder("<");
        int currentIndex = 0;

        while (!people.isEmpty()) {
            currentIndex = (currentIndex + k - 1) % people.size();
            result.append(people.remove(currentIndex));
            if (!people.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result.toString());
    }
}