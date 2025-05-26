package artes.topicos;

import java.util.Scanner;
import geral.Topico;

public class Pintura extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        //Explicação sobre pintura
        System.out.println(
                "A pintura é a arte de criar imagens usando tintas sobre superfícies como tela, papel ou parede.");
        System.out.println(
                "É uma forma visual de expressão, onde o artista transmite sentimentos, ideias ou cenas, reais ou imaginárias.");
    }

    @Override
    public void questoes() {
        // Questão 1
        System.out.println("1. Na pintura, o uso de cores quentes como vermelho e amarelo geralmente transmite:\n" +
                "A) Frieza e tranquilidade\n" +
                "B) Alegria e energia\n" +
                "C) Tristeza e silêncio\n" +
                "D) Medo e suspense");
        //Na pintura e pensando também na teoria das cores, as cores quentes representam alegria e energia
        String resposta1 = teclado.nextLine();

        if (resposta1.equalsIgnoreCase("B")) {
            System.out.println(
                    "Parabéns! Resposta correta! Na pintura, as cores quentes transmitem alegria e energia.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. Na pintura, as cores quentes transmitem alegria e energia.");
        }

        // Questão 2
        System.out.println("2. Uma pintura abstrata é caracterizada por:\n" +
                "A) Representar pessoas com muitos detalhes\n" +
                "B) Mostrar paisagens naturais\n" +
                "C) Não representar figuras reais e usar formas livres \n" +
                "D) Imitar uma fotografia ");
        //pinturas abstratas utilizam formas livres e não tentam retratar a realidade com fidelidade
        String resposta2 = teclado.nextLine();

        if (resposta2.equalsIgnoreCase("C")) {
            System.out.println(
                    "Parabéns! Resposta correta! Uma pintura abstrata não representa figuras reais, além de usar formas livres.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. Uma pintura abstrata não representa figuras reais, além de usar formas livres.");
        }

        // Questão 3
        System.out.println(
                "3. Qual destes materiais é normalmente usado na pintura?\n" +
                        "A) Gesso\n" +
                        "B) Tinta acrílica\n" +
                        "C) Argila\n" +
                        "D) Mármore");
        //A tinta acrílica é geralmente usada na pintura. Os outros estão relacionados a outros tipos de artes
        String resposta3 = teclado.nextLine();
        if (resposta3.equalsIgnoreCase("B")) {
            System.out.println(
                    "Parabéns! Resposta correta! A tinta acrílica é normalmente usada na pintura.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. A tinta acrílica é normalmente usada na pintura.");
        }
    }
}
