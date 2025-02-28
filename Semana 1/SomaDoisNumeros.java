import java.util.Scanner;

import static jdk.internal.net.http.common.Utils.close;
//Declara classe
public class SomaDoisNumeros {
    //metodo main executando
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o que o usuário digita
        Scanner scanner = new Scanner(System.in);
        //Le o numero e armazena na variavel A
        System.out.print("Digite o valor de A:");
        int A = scanner.nextInt();
        //Le o numero e armazena na variavel B
        System.out.print("Digite o valor de B:");
        int B = scanner.nextInt();
        //Calcula a soma de A e B e armazena na variavel soma
        int soma = A + B;
        //Imprime o resultado no formato especificado
        System.out.println("Soma = " + soma);
        //Fecha o scanner, porem aqui encerra o System.in ou seja finaliza o programa.
        scanner.close();
    }
}
