import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int n = scanner.nextInt(); 
        
        for(int i = 2; i <= n; i++) { // перебор всех чисел до n
            if(n % i == 0) {
                System.out.println(i);
                return;
            }
        } 
        scanner.close();      
    }
}
