import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    public Aluno(String nome, int nota1, int nota2, int nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome do aluno (ou 'sair' para encerrar): ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite a primeira nota: ");
            int nota1 = Integer.parseInt(sc.nextLine());

            System.out.print("Digite a segunda nota: ");
            int nota2 = Integer.parseInt(sc.nextLine());

            System.out.print("Digite a terceira nota: ");
            int nota3 = Integer.parseInt(sc.nextLine());

            Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
            alunos.add(aluno);
        }

        double somaNotas = 0;
        int AlunosAprovados = 0;
        int AlunosReprovados = 0;

        System.out.println("\nNotas dos alunos:");
        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            somaNotas += media;

            System.out.println("Aluno: " + aluno.nome + ", Notas: " + aluno.nota1 + ", " + aluno.nota2 + ", " + aluno.nota3 + ", Média: " + media);

            if (media >= 6) {
                AlunosAprovados++;
            } else {
                AlunosReprovados++;
            }
        }

        System.out.println("\nMédia geral da turma: " + (somaNotas / alunos.size()));
        System.out.println("Alunos aprovados: " + AlunosAprovados);
        System.out.println("Alunos reprovados: " + AlunosReprovados);

        System.out.println("\nNomes dos alunos aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() >= 6) {
                System.out.println(aluno.nome);
            }
        }

        System.out.println("\nNomes dos alunos reprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() < 6) {
                System.out.println(aluno.nome);
            }
        }

        sc.close();
    }
}
