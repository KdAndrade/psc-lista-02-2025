import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Preço da gasolina: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite o quantos litros de gasolina você abasteceu: ");
        double litros = scanner.nextDouble();

        double pagamento = (preco * litros);
        
        System.out.printf("Você irá pagar: %.2f reais%n", pagamento);


        scanner.close();

        
    }
}
