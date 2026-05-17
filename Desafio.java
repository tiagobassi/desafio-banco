import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nomeCliente = "tiago bassi";
        String tipoConta = "corrente";
        double saldo = 3200.89;
        int opcao = 0;


        System.out.println("******************************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo de conta: " +tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n******************************");

        String menu = ("""
                *** Digite sua opcao ***
                
                1- Consultar saldo
                2- transferir valor
                3- receber valor
                4- sair
                
                """);

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            
            
            if (opcao ==1){
                System.out.println("Seu saldo e: " +saldo);
            } else if (opcao ==2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor>saldo){
                    System.out.println("Seu saldo e insuficiente para realizar a transferencia");
                }else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opcao invalida");
            }
        }
    }

}
