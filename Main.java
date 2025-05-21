import java.util.Scanner;

import matematica.Matematica;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual sua matéria de interesse? (matematica, química, artes):");
        String escolha = teclado.nextLine();
        switch (escolha) {
            case "matematica":
                Matematica matematica = new Matematica();
                matematica.Geral();
                break;

            default:
                break;
        }

    }
}