import java.util.Scanner;
public class CalculoMedia{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota (A): ");
        double A = scanner.nextDouble();
        System.out.println("Digite a segunda nota (B): ");
        double B = scanner.nextDouble();
        double pesoA = 3.5;
        double pesoB = 7.5;
        double media = (A * pesoA + B * pesoB) / (pesoA+pesoB);
        System.out.printf("MEDIA = %.2f%n", media);
        scanner.close();

    }

}