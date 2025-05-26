package matematica;

import java.util.Scanner;
import geral.Topico;
import matematica.topicos.AngulosGeometriaPlana;
import matematica.topicos.AngulosPorRetas;
import matematica.topicos.TiposDeAngulos;

public class Matematica {
    Scanner teclado = new Scanner(System.in);
    Topico topico;
    String respostaQuestoes;

    public void Geral() {
        //Pequena introdução ao que será aparesentado e menu
        System.out.println("Você selecionou a matéria 'Matemática'!");
        System.out.println("O conteúdo que irá estudar a seguir é sobre: Ângulos. Vamos começar!");
        System.out.println(
                "1 - Ângulos na geometria plana\n2 - Ângulos formados por retas\n3 - Tipos de ângulos\nQual tópico você gostaria de ver?");
                
        //nós utilizamos seleção numérica pois os tópicos tem nomes muito longos
        int resposta = teclado.nextInt();
        teclado.nextLine();

        switch (resposta) {
            case 1:
                //cria o objeto de angulos na geometria plana e chama a função de explicação
                topico = new AngulosGeometriaPlana();
                topico.explicacao();

                //questões sobre essse tópico
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes.equalsIgnoreCase("sim")) {
                    topico.questoes();
                }
                break;

            case 2:
                //chama a função de explicação no objeto de ângulos formados por retas
                topico = new AngulosPorRetas();
                topico.explicacao();

                //questões desse assunto
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes.equalsIgnoreCase("sim")) {
                    topico.questoes();
                }
                break;

            case 3:
                //explicação dos tipos de ângulos
                topico = new TiposDeAngulos();
                topico.explicacao();

                //questões dos tipos de ângulos
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
