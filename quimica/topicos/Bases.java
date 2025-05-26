package quimica.topicos;

import java.util.Scanner;
import geral.Topico;

public class Bases extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        //explicação básica
        System.out.println("Bases são compostos iônicos formados por cátions, na maioria das vezes de metais.");
        System.out.println("Se dissociam em água liberando o ânion hidroxila (OH-).");
        System.out
                .println("As bases podem ser classificadas de acordo com o número de hidroxilas liberadas em solução.");
    }

    @Override
    public void questoes() {

        //Questão 1
        System.out.println("1) O que as bases liberam em água?\n" +
                "a) Cátion H+\n" +
                "b) Ânion OH-\n" +
                "c) Íon Hidrônio\n" +
                "d) Gás oxigênio");
        //As bases liberam ânion OH- em água
        if (teclado.nextLine().equalsIgnoreCase("b")) {
            System.out.println("Parabéns! Resposta correta! Quando uma base reage com água ela libera um ânion OH-.");
        } else {
            System.out.println("Incorreto! Quando uma base reage com água ela libera um ânion OH-.");
        }

        //Questão 2
        System.out.println("2) Como as bases são classificadas?\n" +
                "a) De acordo com o número de hidroxilas liberadas\n" +
                "b) De acordo com a quantidade de oxigênios\n" +
                "c) Pelo número de átomos de carbono\n" +
                "d) Pelo seu estado físico");
        //As bases são classificadas pelo número de hidroxilas liberadas
        if (teclado.nextLine().equalsIgnoreCase("a")) {
            System.out.println(
                    "Parabéns! Resposta correta! As bases são classificadas de acordo com o número de hidroxilas liberadas.");
        } else {
            System.out.println("Incorreto! As bases são classificadas de acordo com o número de hidroxilas liberadas.");
        }

        //Questão 3
        System.out.println("3) De que são formadas as bases?\n" +
                "a) Cátions metálicos\n" +
                "b) Moléculas apolares\n" +
                "c) Compostos orgânicos\n" +
                "d) Gases nobres");
        //As bases são formadas de cátions metálicos
        if (teclado.nextLine().equalsIgnoreCase("a")) {
            System.out.println(
                    "Parabéns! Resposta correta! As bases são formadas por cátions metálicos.");
        } else {
            System.out.println("Incorreto! As bases são formadas por cátions metálicos.");
        }
    }
}
