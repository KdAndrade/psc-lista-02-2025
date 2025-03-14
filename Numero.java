import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("O numero escolhido foi: " + num1);

        scanner.close();
    }
}
