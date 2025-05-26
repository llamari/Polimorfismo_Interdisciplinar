package quimica.topicos;

import java.util.Scanner;
import geral.Topico;

public class Oxidos extends Topico{
        Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println("Óxidos são compostos binários (iônicos ou moleculares), que têm dois elementos.");
        System.out.println("Possuem oxigênio na sua composição, sendo ele o seu elemento mais eletronegativo.");
    }

    @Override
    public void questoes() {
        System.out.println("Questão!! Uhuul :D ");
    }
}
