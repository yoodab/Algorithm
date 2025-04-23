import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String initialString = br.readLine();
        int m = Integer.parseInt(br.readLine());

        LinkedList<Character> editor = new LinkedList<>();
        for (char c : initialString.toCharArray()) {
            editor.add(c);
        }

        ListIterator<Character> cursor = editor.listIterator(editor.size());

        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            char operation = command.charAt(0);

            switch (operation) {
                case 'L':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                    break;
                case 'D':
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                    break;
                case 'B':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case 'P':
                    char toAdd = command.charAt(2);
                    cursor.add(toAdd);
                    break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character ch : editor) {
            result.append(ch);
        }
        System.out.println(result.toString());
    }
}