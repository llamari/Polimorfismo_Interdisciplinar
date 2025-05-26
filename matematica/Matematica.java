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
        System.out.println("Você selecionou a matéria 'Matemática'!");
        System.out.println("O conteúdo que irá estudar a seguir é sobre: Ângulos. Vamos começar!\n");
        System.out.println(
                "1 - Ângulos na geometria plana\n2 - Ângulos formados por retas\n3 - Tipos de ângulos\nQual tópico você gostaria de ver?");
                
        int resposta = teclado.nextInt();
        teclado.nextLine();

        switch (resposta) {
            case 1:
                topico = new AngulosGeometriaPlana();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes == "sim") {
                    topico.questoes();
                }
                break;

            case 2:
                topico = new AngulosPorRetas();
                topico.explicacao();
                System.out.println("Você deseja fazer exercícios sobre esse assunto? (sim/não)");
                respostaQuestoes = teclado.nextLine();
                if (respostaQuestoes == "sim") {
                    topico.questoes();
                }
                break;

            case 3:
                topico = new TiposDeAngulos();
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
