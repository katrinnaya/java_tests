import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        int n = scanner.nextInt();  // ожидаем получить целое число
        
        if ((n & 1) == 0) { // через битовое И проверяем четность. если последнее число 0 - четное
            System.out.println("EVEN");
        } else {                    
            System.out.println("ODD");
        }
    }
}
