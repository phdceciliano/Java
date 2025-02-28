import java.util.Arrays;

public class InverterVetor {
    public static void inverter(char[] vetor){
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda < direita) {
            //troca os elementos
            char temp = vetor[esquerda];
            vetor[esquerda]= vetor[direita];
            vetor[direita]= temp;
            //move os indices
            esquerda++;
            direita--;

        }
    }
    public static void main(String[]args) {
            char[]vetor = {'a', 'b', 'c', 'd', 'e'};
            System.out.println("Vetor original"+ Arrays.toString(vetor));
            inverter(vetor);
            System.out.println("Vetor invertido: "+ Arrays.toString(vetor));

    }

}
