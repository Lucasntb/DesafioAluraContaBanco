import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Digite o tipo da sua conta (corrente/poupança)");
        String tipoConta = scanner.nextLine();
        double saldoUsuario = 0;
        String textoInicial = """
                 ____________________________
                | Dados iniciais do cliente
                |
                | Nome: %s
                | Tipo de conta: %s
                | Saldo inicial: R$ 0,00
                |____________________________
                """.formatted(nomeUsuario, tipoConta);
        System.out.println(textoInicial);

        String textoOperacoes = ("""
                ____________________________
                Operações
                                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:""");

        int operacao = 0;
        while (operacao != 4) {
            System.out.println(textoOperacoes);
            operacao = scanner.nextInt();

            if (operacao == 1) {
                System.out.println("O saldo na sua conta é: " + saldoUsuario);
            } else if (operacao == 2) {
                System.out.println("Digite o valor a ser recebido:");
                saldoUsuario += scanner.nextDouble();
            } else if (operacao == 3) {
                System.out.println("Digite o valor para ser transferido:");
                double valorTransferencia = scanner.nextDouble();
                if (valorTransferencia > saldoUsuario) {
                    System.out.println("Valor de transferencia maior que saldo da conta");
                } else {
                    saldoUsuario -= valorTransferencia;
                }
            } else if (operacao == 4) {
                System.out.println("Tchau!");
            } else {
                System.out.println("Opção invalida!");
            }
        }
    }
}
