package quimica;

import java.util.Scanner;
import geral.Topico;
import quimica.topicos.Acidos;
import quimica.topicos.Bases;
import quimica.topicos.Oxidos;
import quimica.topicos.Sais;

public class Quimica {
    Scanner teclado = new Scanner(System.in);
    Topico topico;
    String respostaQuestoes;

    public void Geral() {
        System.out.println("Você selecionou a matéria 'Química'!");
        System.out.println("O conteúdo que irá estudar a seguir é sobre: Funções inorgânicas. Vamos começar!\n");
        System.out.println("1 - Ácidos\n2 - Bases\n3 - Óxidos\n4 - Sais\nQual tópico você gostaria de ver?");

        int resposta = teclado.nextInt();
        teclado.nextLine();

        switch (resposta) {
            case 1:
                topico = new Acidos();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes == "sim") {
                    topico.questoes();
                }
                break;

            case 2:
                topico = new Bases();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes == "sim") {
                    topico.questoes();
                }
                break;

            case 3:
                topico = new Oxidos();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes == "sim") {
                    topico.questoes();
                }
                break;

            case 4:
                topico = new Sais();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes == "sim") {
                    topico.questoes();
                }
                break;

            default:
                System.out.println("A opção inserida não está entre as alternativas. Tente novamente...");
                break;
        }
    }
}