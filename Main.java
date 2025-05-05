import java.util.Scanner;

import Artes.Artes;
import Matemática.Matematica;
import Química.Quimica;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual sua matéria de interesse? (matemática, química, artes):");
        String escolha = teclado.nextLine();
        switch (escolha) {
            case "matemática":
                Matematica matematica = new Matematica();

                break;
        
            case "química":
                Quimica quimica = new Quimica();

                break;

            case "artes":
                Artes artes = new Artes();
                break;

            default:
                break;
        }

    }
}