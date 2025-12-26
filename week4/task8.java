import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n.length(); i++) {
            if ((i+1) % 3 != 0) { // если не делится на 3, то берем элемент в буфер
                result.append(n.charAt(i));
            }
        }

        System.out.println(result);
        
        scanner.close();
    }
}
