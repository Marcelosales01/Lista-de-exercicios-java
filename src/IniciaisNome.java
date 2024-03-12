import java.util.Scanner;

public class IniciaisNome {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();        
        String iniciais = obterIniciais(nome);
        System.out.println("As iniciais do nome sao: " + iniciais);
        
        sc.close();
    }
    
    public static String obterIniciais(String nome) {
        StringBuilder iniciais = new StringBuilder();
        String[] partesNome = nome.split(" ");
        
        for (String parte : partesNome) {
            if (!parte.isEmpty()) {
                iniciais.append(parte.charAt(0)).append(".");
            }
        }
        return iniciais.toString().toUpperCase();
    }
}
