import java.util.Scanner;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine(); 
        int space = n.indexOf(" "); // найдем пробел и по нему разделим на подстроки, меняя местами
        
        String result = n.substring(space + 1) + " " + n.substring(0, space);               
        
        System.out.println(result);       
        
        scanner.close();
    }
}
