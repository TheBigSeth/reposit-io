import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número de produtos por caixas: ");
            int qtaporcaixa = scanner.nextInt();
            System.out.print("Digite o número de caixas de produtos que deseja comprar: ");
            int produtosPorCaixa = scanner.nextInt();
            System.out.print("Digite o numero de produtos no estoque: ");
            int qtaAtual = scanner.nextInt();
            System.out.print("Digite o numero de produtos que deseja alcançar: ");
            int Desejado = scanner.nextInt();

            int totalProdutosComprados = qtaporcaixa * produtosPorCaixa;
            int estoqueFinal = qtaAtual + totalProdutosComprados;
            if (estoqueFinal < Desejado){
               System.out.println("AVISO O NUMERO DE PRODUTOS CONTINUA INSUFICIENTE");
            } else {
                System.out.println("a quantidade de produtos é suficiente");
            }

            System.out.println("Quantidade total de produtos no final: " + estoqueFinal);
        }
}
