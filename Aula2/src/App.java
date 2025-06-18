import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
   //criando um verificador de idade

    public static void main(String[] args) throws Exception {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);   
        System.out.println("Qual é o seu ano de nascimento? ");
        var yearNaciment = scanner.nextInt();
        var resultAge = baseYear - yearNaciment;
        System.out.println("Você tem carteira de motorista? true or false");
        var canDrive = scanner.nextBoolean();
        if (resultAge >=18 && canDrive) {
            System.out.println("Você está liberado para drigir :) ");
            
        }else{
            System.out.println("Você não está liberado para dirigir e seu carro está sendo apreendido! ");
        }

    }
}
