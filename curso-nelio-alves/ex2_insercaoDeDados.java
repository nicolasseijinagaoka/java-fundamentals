import java.util.Scanner;

public class ex2_insercaoDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        System.out.println("Entre com uma String: ");
        x = sc.next();
        System.out.println("Entre com um Int: ");
        y = sc.nextInt();
        System.out.println("Entre com um double: ");
        z = sc.nextDouble();

        System.out.println("Dados digitados: String: " + x + "    Int: " + y + "    Double: " + z);

        sc.close();
    }
}