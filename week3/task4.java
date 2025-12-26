import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); 
        }

        int k = scanner.nextInt(); // кол-во сдвигов элемента влево
        k = k % n; // если k > n, то берем остаток от деления k на n

        int[] final_res = new int[n]; 

        for (int i = 0; i < n; i++) {
            int newI = i - k; // новый индекс элемента при сдвиге влево
            if (newI < 0) {
                newI = n + newI; // если новый индекс меньше 0, то + n к нему
            }
            final_res[newI] = arr[i]; // записываем элемент в новый массив по новому индексу
        }

        for (int i = 0; i < n; i++) {
            System.out.print(final_res[i] + " ");
        }
        scanner.close();
    }
}
