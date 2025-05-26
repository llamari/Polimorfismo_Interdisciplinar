import java.util.Scanner;
import matematica.Matematica;
import quimica.Quimica;
import artes.Artes;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo(a)! Você está em um sistema de estudos.");
        System.out.println("Qual matéria você deseja praticar no momento? (matematica, quimica, artes):");
        String escolha = teclado.nextLine();

        switch (escolha) {
            case "matematica":
                Matematica matematica = new Matematica();
                matematica.Geral();
                break;

            case "quimica":
                Quimica quimica = new Quimica();
                quimica.Geral();
                break;

            case "artes":
                Artes artes = new Artes();
                artes.Geral();
                break;

            default:
                System.out.println("Opa! Parece que a resposta inserida não está dentre as opções listadas. Tente novamente...");
                break;
        }

        teclado.close();
    }
}