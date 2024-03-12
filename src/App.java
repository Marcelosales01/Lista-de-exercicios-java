import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber se ele é primo: ");
        int numero = sc.nextInt();

        if(Primo(numero)){
            System.out.println(numero + " É numero primo.");
        }else{
            System.out.println(numero + " Não é numero primo.");
        }
        sc.close();
    }

        public static boolean Primo(int numero){
            if(numero <= 1){
                return false;
            }
            for(int i = 2; i < numero; i++){
                if(numero % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

