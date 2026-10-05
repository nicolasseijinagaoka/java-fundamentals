import java.util.Scanner;

public class Menu {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int menu = -1;

        while (menu != 0) {
            System.out.println("\n=== MENU ===");
            System.out.println("2 - Galeria");
            System.out.println("1 - Oficina");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            menu = sc.nextInt();
            boolean chave1 = true;

            switch (menu) {
                case 2:
                    while ( chave1 == true){
                        Scanner varUser = new Scanner(System.in);
                        System.out.println("\n=== MENU2 === \n1 - Continuar\n2 - Voltar ao menu anterior\n3 - Encerrar Prgrama\n Escolha: ");
                        int rUser = varUser.nextInt();
                        switch (rUser){
                            case 1:
                                System.out.println("Menuuuu.");
                                break;

                            case 2:
                                chave1 = false; rUser = 0;
                                break;

                            case 3:
                                menu = 0;
                        }

                    }

                case 1:
                    System.out.println("Você entrou na Oficina!");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}