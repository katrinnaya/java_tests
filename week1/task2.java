import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();                               
        double x = Double.parseDouble(input.replace(",", ".")); // меняем запятую на точку
        
        long temp = (long) (x * 1000);  
        double result = temp / 1000.0;                             
        
        System.out.println(result);                                 
    }
}
