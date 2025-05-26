package artes.topicos;

import java.util.Scanner;
import geral.Topico;

public class Pintura extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
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
        String resposta1 = teclado.nextLine();

        if (resposta1 == "B") {
            System.out.println(
                    "Parabéns! Resposta correta! A dança pode ser considerada uma forma de expressão porque transmite emoções por meio do corpo.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. A dança pode ser considerada uma forma de expressão porque transmite emoções por meio do corpo.");
        }

        // Questão 2
        System.out.println("2. Uma pintura abstrata é caracterizada por:\n" +
                "A) Representar pessoas com muitos detalhes\n" +
                "B) Mostrar paisagens naturais\n" +
                "C) Não representar figuras reais e usar formas livres \n" +
                "D) Imitar uma fotografia ");
        String resposta2 = teclado.nextLine();

        if (resposta2 == "C") {
            System.out.println(
                    "Parabéns! Resposta correta! Um estilo de dança popular no Brasil é o samba.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. Um estilo de dança popular no Brasil é o samba.");
        }

        // Questão 3
        System.out.println(
                "3. Qual destes materiais é normalmente usado na pintura?\n" +
                        "A) Gesso\n" +
                        "B) Tinta acrílica\n" +
                        "C) Argila\n" +
                        "D) Mármore");
        String resposta3 = teclado.nextLine();
        if (resposta3 == "B") {
            System.out.println(
                    "Parabéns! Resposta correta! Todas as ocasiões a dança costuma estar presente, não somente uma em particular.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. Todas as ocasiões a dança costuma estar presente, não somente uma em particular.");
        }
    }
}
