import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        
        int[] valoresLetras = obterValoresLetras(palavra);
        System.out.println("Array: " + Arrays.toString(valoresLetras));
        
        Arrays.sort(valoresLetras);
        System.out.println("Array ordenado: " + Arrays.toString(valoresLetras));
        
        String palavraOrdenada = ordenarPalavra(palavra, valoresLetras);
        System.out.println("Saída: " + palavraOrdenada);
        
        sc.close();
    }
    
    public static int[] obterValoresLetras(String palavra) {
        int[] valores = new int[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            valores[i] = palavra.charAt(i) - 'a' + 1;
        }
        return valores;
    }
    
    public static String ordenarPalavra(String palavra, int[] valoresLetras){
        char[] letras = new char[palavra.length()];
        for (int i = 0; i < valoresLetras.length; i++) {
            letras[i] = (char) (valoresLetras[i] + 'a' - 1);
        }
        return new String(letras);
    }
}
