import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        String[] arr = n.split(";"); // делим на массив подстрок по ;

        for (String s : arr) {
            String[] arr2 = s.split("\\s+"); // делим на массив подстрок по пробелам (слова для преобразования)
            StringBuilder result = new StringBuilder();

            for (String word : arr2) {
                if (!word.isEmpty()) {
                    String letter = "aeiouyAEIOUY"; // буквы, которые не нужно заменять
                    String shortWord = word;

                    for (int i = 0; i < word.length(); i++) { // поиск первой гласной
                        if (letter.indexOf(word.charAt(i)) != -1) {
                            shortWord = word.substring(0, i + 1); // обрезать до самой гласной включая ее
                            break;
                        }
                    }

                    String abbrev = shortWord.substring(0, 1).toUpperCase() +
                            shortWord.substring(1).toLowerCase();
                    result.append(abbrev);
                }
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
