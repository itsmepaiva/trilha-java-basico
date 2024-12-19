import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*conhecer e importar a classe scanner
        - exibir as mensagens para o nosso usuario
        -obter pela scanner os valores digitados no terminal
        - exibir a mensagem da conta criada
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, agora insira o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, agora insira o numero da sua agência: ");
        String agencia = scanner.next();

        System.out.print("Por ultimo, insira o saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponivel para saque.");

    }
}
