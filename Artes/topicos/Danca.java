package artes.topicos;

import java.util.Scanner;
import geral.Topico;

public class Danca extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println("A dança é uma forma de expressão por meio do corpo em movimento. ");
        System.out.println(
                "Pode acompanhar música ou ser feita em silêncio, e serve para mostrar emoções, contar histórias ou celebrar tradições culturais. ");
        System.out.println("Existem muitos estilos, como balé, dança de rua, samba, entre outros.");
    }

    @Override
    public void questoes() {
        // Questão 1
        System.out.println("1. A dança pode ser considerada uma forma de expressão porque:\n" +
                "A) Usa apenas figurinos bonitos\n" +
                "B) Mostra movimentos técnicos\n" +
                "C) Transmite emoções por meio do corpo\n" +
                "D) É sempre feita em grupo");
        String resposta1 = teclado.nextLine();

        if (resposta1 == "C") {
            System.out.println(
                    "Parabéns! Resposta correta! A dança pode ser considerada uma forma de expressão porque transmite emoções por meio do corpo.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. A dança pode ser considerada uma forma de expressão porque transmite emoções por meio do corpo.");
        }

        // Questão 2
        System.out.println("2. Qual das opções abaixo é um estilo de dança popular no Brasil?\n" +
                "A) Balé clássico\n" +
                "B) Sapateado\n" +
                "C) Hip hop\n" +
                "D) Samba ");
        String resposta2 = teclado.nextLine();

        if (resposta2 == "D") {
            System.out.println(
                    "Parabéns! Resposta correta! Um estilo de dança popular no Brasil é o samba.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. Um estilo de dança popular no Brasil é o samba.");
        }

        // Questão 3
        System.out.println(
                "3. Em quais ocasiões a dança costuma estar presente?\n" +
                        "A) Apenas em festas religiosas\n" +
                        "B) Em festas, rituais, espetáculos e celebrações\n" +
                        "C) Somente em escolas de dança\n" +
                        "D) Apenas em casamentos");
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
