import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int birthYear = scanner.nextInt();
        int birthMonth = scanner.nextInt();
        int birthDay = scanner.nextInt();
        
        int currentYear = scanner.nextInt();
        int currentMonth = scanner.nextInt();
        int currentDay = scanner.nextInt();
        
        int manAge = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            manAge--;
        }
        
        int koreanAge = currentYear - birthYear + 1;
        int yearAge = currentYear - birthYear;
        
        System.out.println(manAge);
        System.out.println(koreanAge);
        System.out.println(yearAge);
    }
}