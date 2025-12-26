import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine(); 
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]{4,}\\b"); // только лат буквы, длина >= 4
        Matcher matcher = pattern.matcher(n);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println(count);

        scanner.close();
    }
}
