package quimica.topicos;

import java.util.Scanner;
import geral.Topico;

public class Bases extends Topico{
        Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println("Bases são compostos iônicos formados por cátions, na maioria das vezes de metais.");
        System.out.println("Se dissociam em água liberando o ânion hidroxila (OH-).");
        System.out.println("As bases podem ser classificadas de acordo com o número de hidroxilas liberadas em solução.");
    }

    @Override
    public void questoes() {
        System.out.println("Questão!! Uhuul :D ");
    }
}
