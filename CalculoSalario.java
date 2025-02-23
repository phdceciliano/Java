import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o nome do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        // Solicita ao usuário que insira o número de horas trabalhadas
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        // Solicita ao usuário que insira o valor recebido por hora
        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = scanner.nextDouble();

        // Calcula o salário total
        double salario = horasTrabalhadas * valorPorHora;

        // Imprime o resultado formatado
        System.out.printf("O funcionário %s trabalhou %.2f horas, e portanto possui R$ %.2f a receber.%n", nome, horasTrabalhadas, salario);

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}