import java.util.Random;

public class MatrizAleatoria {
    public static void main (String[]args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();
        int maxValor = Integer.MIN_VALUE;
        // Preenchendo a matriz com valores aleatórios e encontrando o maior valor
        System.out.println("Matriz gerada");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                matriz[i][j] = random.nextInt(100); //numeros entre 0 a 100
                if (matriz[i][j]> maxValor) {
                    maxValor = matriz[i][j];
                }
            }
        }
        //exibir a matriz no formato desejado
        for (int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print("[" + matriz [i][j] +"]");
            }
            System.out.println();
        }
        System.out.println("Maior valor da matriz " + maxValor);
    }
}