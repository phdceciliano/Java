import java.util.ArrayList;
public class FiltroStrings {
    public static ArrayList<String> filtrarStrings(ArrayList<String> lista, char caractere) {
        ArrayList<String> resultado = new ArrayList<>();
        for (String str : lista) {
            if (str.length() > 0 && str.charAt(0) == caractere) {
                resultado.add(str);
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        // Exemplo de uso
        ArrayList<String> lista = new ArrayList<>();
        lista.add("peixe");
        lista.add("tubarão");
        lista.add("foca");
        lista.add("aranha");
        lista.add("pinguim");

        char caractere = 'a';
        ArrayList<String> resultado = filtrarStrings(lista, caractere);
        System.out.println("Strings que começam com '" + caractere + "': " + resultado);
    }
}