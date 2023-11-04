import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Ana Maria Silva";
        String tipoConta = "Corrente";
        double saldoDisponivel = 4500;
        double valorRecebido = 0;
        double valorTransferido = 0;

        System.out.println("***************************************************");
        System.out.println("Dados do cliente");
        System.out.println("\n Nome do cliente: " + nome);
        System.out.println("\n Tipo de conta: " + tipoConta);
        System.out.println("\n Saldo disponível:" + saldoDisponivel);
        System.out.println("***************************************************");

        String menu = """
        Escolha uma opção:
        
        1 - Consultar saldo
        2 - Receber valores
        3 - Transferir valores
        4 - Sair
        
        """;
        System.out.println(menu);
        int opcao = leitura.nextInt();


        switch (opcao){
            case 1:
                System.out.println("Saldo disponível: " + saldoDisponivel);
                break;
            case 2:
                System.out.println("Informe o valor a ser recebido: ");
                valorRecebido = leitura.nextDouble();
                valorRecebido += saldoDisponivel;
                System.out.println("Saldo disponível: " + valorRecebido);
                break;
            case 3:
                System.out.println("Informe o valor a ser transferido: ");
                valorTransferido = leitura.nextDouble();
                if(valorTransferido > saldoDisponivel){
                    System.out.println("Saldo insuficiente");
                }else {
                    saldoDisponivel -= valorTransferido;
                    System.out.println("Transferência realizada com sucesso! \n Saldo disponível: " + saldoDisponivel);
                }
                break;
            case 4:
                while(opcao != 4){
                    System.out.println(menu);
                    opcao = leitura.nextInt();
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }





    }
}
