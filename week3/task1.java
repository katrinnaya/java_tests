import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int n = scanner.nextInt();
        int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int ind = n - 1; // индекс в конец массива и идем справа налево
        while (ind >= 0) {
            System.out.print(arr[ind] + " ");
            ind--; 
        }

        scanner.close();      
    }
}
