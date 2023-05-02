import java.util.Scanner;

public class ContaTerminal {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, insira o seu nome: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, insira a agência: ");
        agencia = entrada.nextLine();

        System.out.println("Por favor, insira o numero da conta: ");
        numeroConta = entrada.nextInt();

        System.out.println("Por favor, insira o saldo: ");
        saldo = entrada.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco! Sua agência é: "+agencia+", conta: "+numeroConta+", e seu saldo: "+saldo+" já está disponível para saque.");
    }
}
