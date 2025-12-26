import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // строки
        int m = scanner.nextInt(); // столбцы

        int[][] original = new int[n][m]; // Считать матрицу
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                original[i][j] = scanner.nextInt();
            }
        }

        int [][] deepCopy = new int[n][m]; // Создать её глубокую копию (копия значений)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                deepCopy[i][j] = original[i][j];
            }
        }

        for (int i = 0; i < n; i++) { // Изменить все четные элементы в оригинальной матрице на противоположные по знаку
            for (int j = 0; j < m; j++) {
                if (original[i][j] % 2 == 0) { // если четное, то смена знака
                    original[i][j] = -original[i][j];                    
                }
            }
        }

        System.out.println(Arrays.deepToString(original)); // Вывести оригинальную матрицу и копию в формате Arrays.deepToString()
        System.out.println(Arrays.deepToString(deepCopy));       
        
        scanner.close();
    }
}
