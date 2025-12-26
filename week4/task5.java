import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        String[] arr = n.split("[^a-zA-Zа-яА-Я]+"); // делим по небуквам

        for (String s : arr) {
            if (s.length() > 1) {
                String reversedS = new StringBuilder(s.toLowerCase()).reverse().toString(); // переворачиваем строку и приводим к нижнему регистру
                if (s.toLowerCase().equals(reversedS)) {
                    System.out.println(s);

                }
            }

        }

        scanner.close();
    }
}
