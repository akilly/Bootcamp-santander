import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         //TODO:Conhecer e importar a classe Scanner
        var scanner = new Scanner(System.in);
       
        //Exibir as mensagens para nosso usuário e Obter pelo Scanner os valores digitados no terminal
       
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Agora, digite a agência de seu banco (formato xxx-x):");
        String agencia = scanner.nextLine(); 

        String parte1 = agencia.substring(0, 3);
        String parte2 = agencia.substring(3);
        String resultado = parte1 + "-" + parte2;
    

        System.out.println("Digite o seu nome completo:");
        String nomeCliente = scanner.nextLine();
        System.out.println();

        System.out.println("Digite o seu saldo: ");
        float saldo = scanner.nextFloat();
        System.out.println();

        // Exibir a mensagem de conta aberta

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, \nsua agência é %s, conta %s \ne seu saldo de %s já está disponível para saque",
        nomeCliente.toUpperCase(), resultado, numeroConta, saldo);
    }
}
