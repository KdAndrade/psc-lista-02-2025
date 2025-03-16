import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de pessoas que vão na viagem: ");
        int qtde = scanner.nextInt();

        System.out.print("Valor da viagem para Alemanha: ");
        double de = scanner.nextDouble();

        System.out.print("Valor da viagem para Portugal: ");
        double pt = scanner.nextDouble();

        System.out.print("Valor da viagem para Itália: ");
        double it = scanner.nextDouble();

        double total = qtde * (de + pt + it);
        System.out.printf("O valor total é de: R$ %.2f%n", total);

        if (qtde > 0) {
            double vpp = total / qtde;
            System.out.printf("O valor por pessoa é de: R$ %.2f%n", vpp);
        } else {
            System.out.println("Número de pessoas inválido!");
        }

        scanner.close();
    }
}
