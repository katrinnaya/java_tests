import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        int firstI = n.indexOf('h');
        int lastI = n.lastIndexOf('h');

        System.out.println(n.substring(0, firstI) + n.substring(lastI + 1)); //подстрока до h + подстрока после h
        
        scanner.close();
    }
}
