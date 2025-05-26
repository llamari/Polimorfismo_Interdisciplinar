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
        //introdução básica ao que será falado
        System.out.println("Você selecionou a matéria 'Artes'!");
        System.out.println(
                "O conteúdo que irá estudar a seguir é sobre: Formas de expressão artística. Vamos começar!");
        System.out.println("1 - Cinema\n2 - Dança\n3 - Pintura\nQual tópico você gostaria de ver?");

        //utilizei opções numéricas pois a ç estava dando problemas
        int resposta = teclado.nextInt();
        teclado.nextLine();

        switch (resposta) {
            case 1:
            //se o usuário escolher cinema, será chamada a explicação do objeto cinema
                topico = new Cinema();
                topico.explicacao();

                //verificação se o usuário quer fazer exercícios sobre o assunto
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes.equalsIgnoreCase("sim")) {
                    topico.questoes();
                }
                break;

            case 2:
            //Se o usuário escolher dança, será chamado a explicação do objeto dança
                topico = new Danca();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes.equalsIgnoreCase("sim")) {
                    //chama a função de questões da dança
                    topico.questoes();
                }
                break;

            case 3:
            //Se o usuário escolher pintura, chama a explicação do objeto pintura
                topico = new Pintura();
                topico.explicacao();
                //verifica se o usuário que fazer questões
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
