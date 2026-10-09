public class ex_1_analiseTurma {
    static void main() {
        double[] N = {1.0, 10.0, 4.0, 2.0, 6.0};
        int aprovados = 0;
        int reprovados = 0;

        for(int i = 0; i< N.length; i++)
        {if (N[i] >= 7.0){
            aprovados++;
        }
        else {
            reprovados++;
        }
            }System.out.println("Alunos aprovados: "+ aprovados+ "\nAlunos reprovados: "+reprovados+"\n");
    }
}