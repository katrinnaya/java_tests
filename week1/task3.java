import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN = scanner.nextInt();     
        int secondN = scanner.nextInt();    
        
        int sum = firstN + secondN;          
        int diff = firstN - secondN;         
        
        System.out.println(sum + " " + diff);
    }
}
