package artes.topicos;

import java.util.Scanner;
import geral.Topico;

public class Cinema extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println(
                "O cinema é uma forma de arte que usa imagens em movimento para contar histórias ou transmitir emoções.");
        System.out.println(
                "Ele combina som, imagem, roteiro, atuação e direção para criar uma experiência visual e emocional.");
        System.out.println("Pode ser um filme de ficção, documentário ou animação por exemplo.");
    }

    @Override
    public void questoes() {
        // Questão 1
        System.out.println("1. Qual é o principal objetivo do uso da trilha sonora em um filme?\n" +
                "A) Distrair o público\n" +
                "B) Preencher o tempo do filme\n" +
                "C) Criar emoção e reforçar o clima das cenas\n" +
                "D) Mostrar o talento dos músicos");
        String resposta1 = teclado.nextLine();

        if (resposta1 == "C") {
            System.out.println(
                    "Parabéns! Resposta correta! O principal objetivo do uso da trilha sonora é criar emoção e reforçar o clima das cenas.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. O principal objetivo do uso da trilha sonora é criar emoção e reforçar o clima das cenas.");
        }

        // Questão 2
        System.out.println("2. O que diferencia um documentário de um filme de ficção?\n" +
                "A) O documentário é sempre em preto e branco\n" +
                "B) O documentário apresenta fatos reais\n" +
                "C) A ficção é baseada em notícias\n" +
                "D) O documentário usa efeitos especiais");
        String resposta2 = teclado.nextLine();

        if (resposta2 == "B") {
            System.out.println(
                    "Parabéns! Resposta correta! O documentário apresenta fatos reais.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. O documentário apresenta fatos reais.");
        }

        // Questão 3
        System.out.println(
                "3. Qual destes profissionais é responsável por dirigir os atores e organizar as cenas no cinema?\n" +
                        "A) Produtor\n" +
                        "B) Roteirista\n" +
                        "C) Diretor\n" +
                        "D) Editor");
        String resposta3 = teclado.nextLine();
        if (resposta3 == "C") {
            System.out.println(
                    "Parabéns! Resposta correta! O Diretor é responsável por dirigir os atores e organizar as cenas no cinema.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. O Diretor é responsável por dirigir os atores e organizar as cenas no cinema.");
        }
    }
}
