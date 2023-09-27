import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner contaBancaria = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("    Bem vindo!    ");
        System.out.println();
        System.out.println("Por favor, digite o número da Conta:");
        numero = contaBancaria.nextInt();

        System.out.println("Digite o número da Agência:");
        agencia = contaBancaria.next();

        System.out.println("Informe o seu nome: ");
        nomeCliente = contaBancaria.next();
        contaBancaria.nextLine();

        System.out.println("Agora informe o saldo: ");
        saldo = contaBancaria.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em "
                + "nosso banco, sua agência é %s, "
                + "conta %d e seu saldo %.2f já está disponível"
                + " para saque.", nomeCliente, agencia, numero, saldo);

        contaBancaria.close();
    }

}