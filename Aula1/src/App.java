import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        var name = scanner.next();
        System.out.println("Qual sua idade? ");
        int age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é de %s anos :)\n", name, age);
    }
}
