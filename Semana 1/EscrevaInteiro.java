//Escreva um programa Java para criar um vetor de inteiros e inicialize-o com valores. Em seguida, calcule e imprima a soma de todos os elementos do vetor.
public class EscrevaInteiro {
    public static void main (String[] args){
        int [] vetor = {1, 5, 2, 3, 1, 3, 1};
        int soma = 0;
        for (int numero : vetor){
            soma += numero;
            }
        System.out.println("Soma dos elementos do vetor " + soma);
    }
}