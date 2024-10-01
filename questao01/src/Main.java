import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Aluno aluno =new Aluno();

        System.out.println("Digite seu nome:");
        aluno.setNome(sc.nextLine());
        System.out.println("Digite sua primeira nota:");
        aluno.setNota1(sc.nextDouble());
        System.out.println("Digite sua segunda nota:");
        aluno.setNota2(sc.nextDouble());
        System.out.println("Digite sua terceira nota:");
        aluno.setNota3(sc.nextDouble());

        aluno.detalhes();








    }
}