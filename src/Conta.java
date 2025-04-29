import java.util.Scanner;

public class Conta {

    String agencia = "067-8";
    int conta = 1021;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("****************Bem vindo ao banco!****************");

        System.out.println("Nós vamos seguir com a criação da sua conta e precisamos de alguns dados, para continuar digite: OK; Caso queira encerrar o seu contato, basta sair do terminal.");
        String confirmar = scanner.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite o valor do deposito inicial: ");
        double saldoInicial = scanner.nextDouble();

        Conta conta = new Conta();

        System.out.println("Sua conta foi criada com sucesso! \n");
        System.out.println("Sr(a) " + nome + " os dados da sua conta são: Agencia: " + conta.agencia + " numero: " + conta.conta + " \n Seu saldo de R$ " + saldoInicial + " já está disponível para saque!" );

    }

}
