package artes;

import java.util.Scanner;
import geral.Topico;
import artes.topicos.Cinema;
import artes.topicos.Danca;
import artes.topicos.Pintura;

public class Artes {
    Scanner teclado = new Scanner(System.in);
    Topico topico;
    String respostaQuestoes;

    public void Geral() {
        System.out.println("Você selecionou a matéria 'Artes'!");
        System.out.println(
                "O conteúdo que irá estudar a seguir é sobre: Formas de expressão artística. Vamos começar!\n");
        System.out.println("1 - Cinema\n2 - Dança\n3 - Pintura\nQual tópico você gostaria de ver?");

        int resposta = teclado.nextInt();
        teclado.nextLine();

        switch (resposta) {
            case 1:
                topico = new Cinema();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes.equalsIgnoreCase("sim")) {
                    topico.questoes();
                }
                break;

            case 2:
                topico = new Danca();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes.equalsIgnoreCase("sim")) {
                    topico.questoes();
                }
                break;

            case 3:
                topico = new Pintura();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes.equalsIgnoreCase("sim")) {
                    topico.questoes();
                }
                break;

            default:
                System.out.println("A opção inserida não está entre as alternativas. Tente novamente...");
                break;
        }
    }
}
