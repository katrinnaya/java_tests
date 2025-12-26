import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // кол-во элементов 
        scanner.nextLine();
        
        Number[] numbers = new Number[n];
        
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            
            if (line.equals("null")) {
                numbers[i] = null;  // если null в строке, то запись null в массив 
            } else {
                String[] parts = line.split(" ");
                String format = parts[0];
                String value = parts[1];
                
                switch (format) {
                    case "I":
                        numbers[i] = Integer.valueOf(value);
                        break;
                    case "L":
                        numbers[i] = Long.valueOf(value);
                        break;
                    case "D":
                        numbers[i] = Double.valueOf(value);
                        break;
                }
            }
        }
        
        double sum = 0.0;     
        int nullCount = 0;
        boolean hasSpecial = false;
        
        for (Number num : numbers) {
            if (num == null) {
                nullCount++;      
            } else {
                if (num instanceof Double) { // проверка если есть NaN или Infinity только для Double (вынесла до сложения)
                    double d = num.doubleValue();
                    if (Double.isNaN(d) || Double.isInfinite(d)) {
                        hasSpecial = true;
                        continue;  // добавлено, чтоб не переходить к сложению для спец значениц
                    }
                }
                
                if (num.doubleValue() != 0.0) { // тк Сумма всех ненулевых элементов (не учитывать спец значения)
                    sum += num.doubleValue();  
                }
            }
        }
        
        System.out.printf("%.2f\n", sum);   
        System.out.println(nullCount);       
        System.out.println(hasSpecial ? "HAS_SPECIAL" : "NO_SPECIAL");
        
        scanner.close();
    }
}
