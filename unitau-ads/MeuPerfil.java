import java.util.Scanner;

public class MeuPerfil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scanner.next();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura?");
        double altura = scanner.nextDouble();

        System.out.println("É estudante? \n1 - SIM \n2 - NÃO");
        int op = scanner.nextInt();

        boolean op2 = (op == 1);
        String estudante = op2 ? "estudante" : "não estudante";

        System.out.println(nome + ", " + idade + " anos, " + altura + "m, é " + estudante);

        scanner.close();
    }
}
