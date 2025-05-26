package quimica.topicos;

import java.util.Scanner;
import geral.Topico;

public class Acidos extends Topico{
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println("Ácidos são compostos covalentes, ou seja, que compartilham elétrons nas suas ligações.");
        System.out.println("Eles têm a capacidade de ionizar em água e formar cargas, liberando o H+ como único cátion.");
        System.out.println("Os ácidos podem ser classificados de acordo com a quantidade de hidrogênios que são liberados em solução aquosa e ionizam-se, reagindo com a água formando o íon hidrônio.");
    }

    @Override
    public void questoes() {

        // Questão 1
        System.out.println("1) O que caracteriza os ácidos?\n" +
                "a) Compostos iônicos que dissociam\n" +
                "b) Compostos covalentes que compartilham elétrons\n" +
                "c) Compostos metálicos\n" +
                "d) Compostos que não reagem com água");
        if (teclado.nextLine().equalsIgnoreCase("b")) {
            System.out.println(
                    "Parabéns! Resposta correta! Os ácidos são caracterizados por compostos covalentes, ou seja, compartilham elétrons.");
        } else {
            System.out.println(
                    "Incorreto! Os ácidos são caracterizados por compostos covalentes, ou seja, compartilham elétrons.");
        }

        System.out.println("2) O que os ácidos liberam em solução aquosa?\n" +
                "a) Ânion OH-\n" +
                "b) Cátion H+\n" +
                "c) Cátion Na+\n" +
                "d) Ânion Cl-");
        if (teclado.nextLine().equalsIgnoreCase("b")) {
            System.out.println("Parabéns! Resposta correta! Os ácidos liberam o cátion H+ em solução aquosa.");
        } else {
            System.out.println("Incorreto! Os ácidos liberam o cátion H+ em solução aquosa.");
        }
        ;

        System.out.println("3) O que se forma quando o ácido reage com a água?\n" +
                "a) Íon hidrônio\n" +
                "b) Íon hidroxila\n" +
                "c) Óxido de hidrogênio\n" +
                "d) Cátion metálico");
        if (teclado.nextLine().equalsIgnoreCase("a")){
            System.out.println("Parabéns! Resposta correta! Quando um ácido reage com água se forma íon hidrônio.");
        } else {
            System.out.println("Incorreto! Quando um ácido reage com água se forma íon hidrônio.");
        }
    }
}