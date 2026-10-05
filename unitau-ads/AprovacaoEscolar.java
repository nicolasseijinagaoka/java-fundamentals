import java.util.Scanner;

public class AprovacaoEscolar {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a 1° nota do aluno: ");
        double N1 = scanner.nextDouble();

        System.out.print("Entre com a 2° nota do aluno: ");
        double N2 = scanner.nextDouble();

        System.out.print("Entre com a 3° nota do aluno: ");
        double N3 = scanner.nextDouble();

        double media = (N3 + N2 + N1) /3;

        if (media >= 7){
            System.out.println("Aprovado.");
        }
        if (media >=5&& media<=6.9){
            System.out.println("Recuperação.");
        }
        if (media < 5){
            System.out.println("Reprovado.");
        }
    }
}
