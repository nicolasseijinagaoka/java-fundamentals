import java.util.Objects;
import java.util.Scanner;

public class CalculadoraSimples {
    static void main() {

        System.out.print("Insira o 1° número: ");

        Scanner valor1 = new Scanner(System.in);
        int N1 = valor1.nextInt();

        System.out.print("Insira o 2° número: ");

        Scanner valor2 = new Scanner(System.in);
        int N2 = valor2.nextInt();

        System.out.println("Qual a operação? (* multiplicação; + soma; - subtração)");

        Scanner operacao = new Scanner(System.in);
        String conta = operacao.next();

        double Vezes = N1 * N2;
        double Soma = N1 + N2;
        double Menos = N1 - N2;

        if (Objects.equals(conta, "*")){
            System.out.println("Resultado: "+ Vezes);
        }
        if (Objects.equals(conta, "+")){
            System.out.println("Resultado: "+ Soma);
        }
        if (Objects.equals(conta, "-")){
            System.out.println("Resultado: "+ Menos);
        }
    }
}