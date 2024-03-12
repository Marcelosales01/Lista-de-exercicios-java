import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = sc.nextLine();
        
        String invertida = inverterString(entrada);
        System.out.println("String invertida: " + invertida);
        
        sc.close();
    }
    
    public static String inverterString(String str) {
        StringBuilder invertida = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida.append(str.charAt(i));
        }
        
        return invertida.toString();
    }
}