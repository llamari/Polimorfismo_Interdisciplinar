package matematica.topicos;

import java.util.Scanner;
import geral.Topico;

public class AngulosGeometriaPlana extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println("Na geometria plana, ângulos são muito usados em figuras como triângulos e polígonos:");
        System.out.println("- A soma dos ângulos internos de um triângulo é sempre 180°.");
        System.out.println(
                "- A soma dos ângulos internos de um polígono é dada por (n - 2) × 180°, onde n é o número de lados.");
        System.out.println("- Cada ângulo externo de um polígono regular é igual a 360° ÷ n.");
    }

    @Override
    public void questoes() {
        // Questão 1
        System.out.println("1. Qual é a soma dos ângulos internos de um hexágono?");
        int resposta1 = teclado.nextInt();
        if (resposta1 == 720) {
            System.out.println("Parabéns! Resposta correta! A soma dos ângulos internos de um hexágono é 720°.");
        } else {
            System.out.println("Que pena... Resposta incorreta. A soma dos ângulos internos de um hexágono é 720°.");
        }

        // Questão 2
        System.out.println("2. Qual é a medida de cada ângulo interno de um triângulo equilátero?");
        int resposta2 = teclado.nextInt();
        if (resposta2 == 60) {
            System.out.println(
                    "Parabéns! Resposta correta! A medida de cada ângulo interno de um triângulo equilátero é 60°.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. A medida de cada ângulo interno de um triângulo equilátero é 60°.");
        }

        System.out.println("3. Quantos graus mede cada ângulo externo de um octógono regular?");
        int resposta3 = teclado.nextInt();
        if (resposta3 == 45) {
            System.out.println(
                    "Parabéns! Resposta correta! A medida de cada ângulo externo de um octógono regular é 45°.");
        } else {
            System.out.println(
                    "Que pena... Resposta incorreta. A medida de cada ângulo externo de um octógono regular é 45°");
        }
    }
}