
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota priemeiro bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota segundo bimestre: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota terceiro bimestre: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Nota quarto bimestre: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4 / 4);

        System.out.println("A media é: " + media);

        scanner.close();
    }
}
