import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine()); // количество преобразований
        
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine(); // Следующие n строк в формате: “значение целевой_тип”
            String[] parts = line.split(" ");
            
            int value = Integer.parseInt(parts[0]); // значение целевой
            String type = parts[1]; // тип 
            
            Number result = null;
            boolean loss = false;  
            
            switch (type) { // Целевые типы: byte, short, long
                case "byte":
                    byte byteResult = (byte) value;
                    loss = (byteResult != value); // если не равно заданному значению, то потеря -- флаг тру 
                    result = byteResult;
                    break;
                    
                case "short":
                    short shortResult = (short) value;
                    loss = (shortResult != value);
                    result = shortResult;
                    break;
                    
                case "long":
                    result = (long) value; //тк в лонг помещается инт полностью
                    loss = false;  // точно нет потерь -- флаг фолс 
                    break;
            }
            
            System.out.println(result);
            System.out.println(loss ? "LOSS" : "NO_LOSS");
        }
        
        scanner.close();
    }
}
