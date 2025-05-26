package quimica.topicos;

import java.util.Scanner;
import geral.Topico;

public class Oxidos extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println("Óxidos são compostos binários (iônicos ou moleculares), que têm dois elementos.");
        System.out.println("Possuem oxigênio na sua composição, sendo ele o seu elemento mais eletronegativo.");
    }

    @Override
    public void questoes() {
        System.out.println("1) O que é um óxido?\n" +
                "a) Composto binário com oxigênio como elemento mais eletronegativo\n" +
                "b) Composto orgânico\n" +
                "c) Um gás nobre\n" +
                "d) Composto formado por três elementos");
        if (teclado.nextLine().equalsIgnoreCase("a")) {
            System.out.println(
                    "Parabéns! Resposta correta! Os óxidos são compostos binários com oxigênio como elemento mais eletronegativo.");
        } else {
            System.out.println(
                    "Incorreto! Os óxidos são compostos binários com oxigênio como elemento mais eletronegativo.");
        }

        System.out.println("2) Quantos elementos formam um óxido?");
        if (teclado.nextInt() == 2) {
            System.out.println("Parabéns! Resposta correta! Os óxidos são compostos por 2 elementos");
        } else {
            System.out.println("Incorreto! Os óxidos são compostos por 2 elementos");
        }
        teclado.nextLine();

        System.out.println("3) O oxigênio em um óxido é:\n" +
                "a) O elemento menos eletronegativo\n" +
                "b) O único elemento presente\n" +
                "c) O elemento mais eletronegativo\n" +
                "d) O elemento que perde elétrons");
        if (teclado.nextLine().equalsIgnoreCase("c")){
            System.out.println("Parabéns! Resposta correta! O oxigênio é o elemento mais eletronegativo em um óxido.");
        } else {
            System.out.println("Incorreto! O oxigênio é o elemento mais eletronegativo em um óxido.");
        }
    }
}
