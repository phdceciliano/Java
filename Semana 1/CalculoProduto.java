import java.util.Scanner;

public class CalculoProduto {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        int valor1 = scanner.nextInt();
        System.out.println("Digite quantos produtos");
        int valor2 = scanner.nextInt();
        int produto = valor1 * valor2;
        System.out.println("PRODUTO = "+ produto);
        scanner.close();

    }

}
