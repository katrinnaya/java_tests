import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a > b && a < c) || (a > c && a < b)) { // проверка a 
            System.out.println(a);
        } else if ((b > a && b < c) || (b > c && b < a)) { // проверка b
            System.out.println(b);
        } else {
            System.out.println(c); // если ни а, ни b, то вывод c 
        }
    }
}
