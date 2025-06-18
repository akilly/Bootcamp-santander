import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe Scanner
       var scanner = new Scanner(System.in);
       //Exibir as mensagens para o usuário 
       System.out.println("Por favor, digite o número de sua conta!");
       var númeroConta = scanner.nextInt();
       System.out.println("Agora, digite a Agencia de sua conta!");
       var agencia = scanner.nextText();

       //Obter pelo Scanner os valores digitados no terminal

       //Exibir a mensagem da conta criada
    }
}
