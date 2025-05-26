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
        System.out.println("Questão!! Uhuul :D ");
    }
}