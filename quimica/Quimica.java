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
        //Apresentação e menuzinho
        System.out.println("Você selecionou a matéria 'Química'!");
        System.out.println("O conteúdo que irá estudar a seguir é sobre: Funções inorgânicas. Vamos começar!");
        System.out.println("1 - Ácidos\n2 - Bases\n3 - Óxidos\n4 - Sais\nQual tópico você gostaria de ver?");

        int resposta = teclado.nextInt();
        teclado.nextLine();

        switch (resposta) {
            case 1:
            //se ele quiser ver ácidos, mostrar explicaçã de ácidos
                topico = new Acidos();
                topico.explicacao();

                //questões de ácidos
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes == "sim") {
                    topico.questoes();
                }
                break;

            case 2:
            //chama a função para explicar bases
                topico = new Bases();
                topico.explicacao();

                //questões pra praticar bases
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes.equalsIgnoreCase("sim")) {
                    topico.questoes();
                }
                break;

            case 3:
            //chama a função que explica os oxidos
                topico = new Oxidos();
                topico.explicacao();

                //atividade de óxidos
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes.equalsIgnoreCase("sim")) {
                    topico.questoes();
                }
                break;

            case 4:
                //explicação de sais
                topico = new Sais();
                topico.explicacao();

                //exercicios de sais
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