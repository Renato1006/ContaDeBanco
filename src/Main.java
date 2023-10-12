import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mensagemInicial =   """
                            **************************
                            Bem-vindo ao Banco Online!
                            Insira os dados iniciais do cliente:
                            **************************
                            """;
        System.out.println(mensagemInicial);

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome do cliente:");
        String nome = sc.nextLine();

        System.out.println("Entre com o tipo da conta:");
        String tipoConta = sc.nextLine();

        System.out.println("Entre com o saldo da conta:");
        double saldoConta = sc.nextDouble();

        String mensagemDados =  """
                                ********************
                                Nome: %s
                                Tipo de conta: %s
                                Saldo da conta: R$ %.2f
                                """.formatted(nome,tipoConta,saldoConta);
        System.out.println(mensagemDados);

        int operacoes = 0;

        while (operacoes != 4){
            String mensagemOpcao =  """
                                    Operações:
                                    1 - Consultar saldo
                                    2 - Receber valor
                                    3 - Transferir valor
                                    4 - Sair
                                    """;
            System.out.println(mensagemOpcao);

            operacoes = sc.nextInt();

            switch (operacoes){
                case (1):
                    System.out.println(String.format("Seu saldo é de R$ %.2f",saldoConta));
                break;

                case (2):
                    System.out.println("Digite o valor a ser recebido: ");
                    double recebeValor = sc.nextDouble();

                    saldoConta += recebeValor;

                    System.out.println(String.format("Saldo atualizado R$ %.2f", saldoConta));
                break;

                case (3):
                    System.out.println("Digite o valor a ser transferido: ");
                    double transfere = sc.nextDouble();

                    if(transfere > saldoConta){
                        System.out.println("Saldo da conta é insuficiente!!");
                    } else {
                        saldoConta -= transfere;

                        System.out.println(String.format("Saldo atualizado R$ %.2f", saldoConta));
                    }
                break;

                case (4):
                    System.out.println("Operação finalizada! Tchau.");
                break;

                default:
                    System.out.println("Operação inválida!!");
            }
        }

    }
}