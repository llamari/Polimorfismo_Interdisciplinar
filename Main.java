//Importações
import java.util.Scanner;
import java.util.ArrayList;
import matematica.Matematica;
import quimica.Quimica;
import artes.Artes;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner teclado = new Scanner(System.in);

        //Guarda todas as escolhas de matérias q ele fez. Interessante para numa aprimoração do sistema poder ver quais matérias ele mais estudou, etc
        ArrayList<String> escolhas = new ArrayList<>();
        int x = 0;

        //enquanto x for 0, o sistema vai rodar
        while (x == 0) {
            //apresentação básica
            System.out.println("Bem-vindo(a)! Você está em um sistema de estudos.");
            System.out.println("Qual matéria você deseja praticar no momento? (matematica, quimica, artes):");
            String escolha = teclado.nextLine().toLowerCase();;
            escolhas.add(escolha);

            switch (escolha) {
                case "matematica":
                    //Se ele escolher matematica, chamaos a função Geral do objeto matematica, que faz todo o menu, etc
                    Matematica matematica = new Matematica();
                    matematica.Geral();
                    break;

                case "quimica":
                    //Chamamos a função geral do de quimica
                    Quimica quimica = new Quimica();
                    quimica.Geral();
                    break;

                case "artes":
                    //chamamos a função de artes
                    Artes artes = new Artes();
                    artes.Geral();
                    break;

                default:
                //se ele digitar algo errado, ele avisa que não é válido
                    System.out.println(
                            "Opa! Parece que a resposta inserida não está dentre as opções listadas. Tente novamente...");
                    break;
            }
            //pergunta se quer continuar
            System.out.println("Deseja continuar no programa? (sim/nao): ");
            String op = teclado.nextLine();
            if (op.equalsIgnoreCase("nao")) {
                //Se ele não quiser continuar, mostra o histórico de matérias estudadas e encerra o programa
                System.out.println("Segue abaixo o histórico de matérias estudadas:");
                for (String materia : escolhas) {
                    System.out.println("- " + materia);
                }
                System.out.println("Obrigada por usar o sistema de estudos! Até a próxima!");
                x = 1;
            }
        }
        teclado.close();
    }
}