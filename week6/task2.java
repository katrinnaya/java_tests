import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class Device {
    public int getPower() {
        return 0; // заглушка чтобы переиспользовать метод в подклассах
    }

    public String getName() {
        return "Device";
    }

    public String toString() {
        return getName() + " Power " + getPower();
    }
}

class Laptop extends Device {
    private int power;

    public Laptop(int power) {
        this.power = power;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public String getName() {
        return "Laptop";
    }
}

class Smartphone extends Device {
    private int power;

    public Smartphone(int power) {
        this.power = power;
        this.power = power;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public String getName() {
        return "Smartphone";
    }
}

class Refrigerator extends Device {
    private int power;

    public Refrigerator(int power) {
        this.power = power;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public String getName() {
        return "Refrigerator";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // для пропуска оставшейся строки после считывания n

        Device[] devices = new Device[n];
        int powerTotal = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine(); // вся строка с типом устройства и параметрами
            String[] parts = line.split(" "); // массив строк по пробелам

            String deviceType = parts[0]; // тип устройства
            int power = Integer.parseInt(parts[1]); // мощность устройства

            switch (deviceType) { // для строки по дефолту использует equals() и проверит тип устройства
                case "Laptop":
                    devices[i] = new Laptop(power);
                    break;
                case "Smartphone":
                    devices[i] = new Smartphone(power);
                    break;

                case "Refrigerator":
                    devices[i] = new Refrigerator(power);
                    break;

            }

            powerTotal += devices[i].getPower();
        }

        for (

                int i = 0; i < n; i++) {
            System.out.println(devices[i]); // вывод каждого устройства
        }

        System.out.println(powerTotal);

        scanner.close();
    }
}
