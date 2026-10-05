import java.util.Scanner;

public class TabuadaPersonalizada {
    static void main() {
        System.out.println("Escolha um número entre 2 e 9.");

        Scanner nUser = new Scanner(System.in);
        int n = nUser.nextInt();

        if (n >= 2 && n <= 9){
            for (int i =1; i<11; i++){
                int conta = n*i;
                System.out.println(n+"x"+i+"="+conta);
            }
        }
    }
}
