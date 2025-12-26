import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class Kitten {
    private String name;
    private String color;
    private String owner;
    
    public Kitten(String name, String color, String owner) {  
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

    public Kitten(String name, String color) {
        this(name, color, "неизвестно");
    }

    public Kitten(String color) {
        this("Рыжик", color);
    }
    public void printInfo() {
        System.out.println((color + " " + name + ". Хозяин - " + owner + "."));
       
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] word = n.split(" "); // просто делим по пробелам

        Kitten kitten;

        if (word.length == 3) {
            kitten = new Kitten(word[0], word[1], word[2]);
        } else if (word.length == 2) {
            kitten = new Kitten(word[0], word[1]);
        } else  {
            kitten = new Kitten(word[0]); // остаточное условие, тк меньше 1 не может быть 
        } 

        kitten.printInfo();
        
        scanner.close();
    }
}
