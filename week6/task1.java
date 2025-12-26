import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class Shape {
    public double getP() {
        return 0; // заглушка чтобы переиспользовать метод в подклассах
    }

    public String getName() {
        return "Shape";
    }

    public String toString() {
        return getName() + " " + String.format("%.2f", getP());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getP() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getP() {
        return 2 * (width + height);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}

class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getP() {
        return a + b + c;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // для пропуска оставшейся строки после считывания n

        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine(); // вся строка с типом фигуры и параметрами
            String[] parts = line.split(" "); // массив строк по пробелам

            String shapeType = parts[0]; // тип фигуры

            switch (shapeType) { // для строки по дефолту использует equals() и проверит тип фигуры
                case "Circle":
                    double radius = Double.parseDouble(parts[1]);
                    shapes[i] = new Circle(radius);
                    break;
                case "Rectangle":
                    double width = Double.parseDouble(parts[1]);
                    double height = Double.parseDouble(parts[2]);
                    shapes[i] = new Rectangle(width, height);
                    break;

                case "Triangle":
                    double a = Double.parseDouble(parts[1]);
                    double b = Double.parseDouble(parts[2]);
                    double c = Double.parseDouble(parts[3]);
                    shapes[i] = new Triangle(a, b, c);
                    break;

            }

        }

        String shapeTarget = scanner.nextLine(); // строка с нужным типом фигуры

        for (int i = 0; i < n; i++) {
            if (shapes[i].getName().equals(shapeTarget)) { // вывод только нужной фигуры
                System.out.println(shapes[i]); // вывод toString() по дефолту, а в базовом классе он переопределен как надо
            }
        }

        scanner.close();
    }
}
