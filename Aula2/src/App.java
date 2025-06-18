import java.util.Scanner;

public class App {
   //criando um verificador de idade

    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);     
        System.out.println("Qual é o seu ano de nascimento? ");
        var yearNaciment = scanner.nextInt();
        var resultAge = 2025 - yearNaciment;
        System.out.println("Você tem carteira de motorista? y - n");
        var canDrive = scanner.next();
        if (resultAge >=18 || canDrive == "y") {
            System.out.println("Você está liberado para drigir :) ");
            
        }else{
            System.out.println("Você não está liberado para dirigir e seu carro está sendo apreendido! ");
        }

    }
}
