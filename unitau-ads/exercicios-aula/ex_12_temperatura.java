import java.util.Scanner;

public class ex_12_temperatura {
    public static void main(String[] args) {
        System.out.print("Entre com o valor da temperatura: ");
        Scanner op = new Scanner(System.in);

        double valor = op.nextDouble();

        if (valor >= 15 && valor <= 25) {
            System.out.println(valor + "°C é Agradável.");
        }
        else if (valor < 15) {
            System.out.println(valor + "°C é Fria.");
        }
        else if (valor > 25) {
            System.out.println(valor + "°C é Quente.");
        }

        op.close();
    }
}