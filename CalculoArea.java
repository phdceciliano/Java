import java.util.Scanner;
public class CalculoArea{
    public static void main(String[]args){
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        double area = PI * Math.pow(raio, 2);
        System.out.printf("A = %.1f%n", area);
        scanner.close();
    }
}