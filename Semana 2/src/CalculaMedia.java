public class CalculaMedia {
    public static double calculaMedia(double[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("O vetor não pode estar vazio.");
        }

        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }

        return soma / numeros.length;
    }

    public static void main(String[] args) {
        double[] numeros = {10.5, 20.3, 30.8, 40.2, 50.7};
        System.out.println("Média dos valores: " + calculaMedia(numeros));
    }
}
