package matematica.topicos;

import java.util.Scanner;
import geral.Topico;

public class TiposDeAngulos extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println("Ângulos básicos são classificados de acordo com a sua medida:");
        System.out.println("- Agudo: menor que 90°");
        System.out.println("- Reto: igual a 90°");
        System.out.println("- Obtuso: maior que 90° e menor que 180°");
        System.out.println("- Raso: igual a 180°");
        System.out.println("- Giro completo: igual a 360°");
    }

    @Override
    public void questoes() {
        //Questão 1
        System.out.println("1. Classifique um ângulo de 45°. (agudo, reto, obtuso, raso, giro completo)");
        String resposta1 = teclado.nextLine(); //le a resposta

        if (resposta1.equalsIgnoreCase("agudo")) {
            System.out.println("Correto! Um ângulo de 45° é um ângulo agudo. Parabéns!");
        } else{
            System.out.println("Incorreto! Um ângulo de 45° é um ângulo agudo.");
        }

        //Questão 2
        System.out.println("2. Um ângulo de 150° é agudo, reto ou obtuso?");
        String resposta2 = teclado.nextLine(); //le a resposta

        if (resposta2.equalsIgnoreCase("obtuso")) {
            System.out.println("Correto! Um ângulo de 150° é um ângulo obtuso. Parabéns!");
        } else{
            System.out.println("Incorreto! Um ângulo de 150° é um ângulo obtuso.");
        }

        //Questão 3
        System.out.println("3. Quantos graus tem um ângulo reto?");
        int resposta3 = teclado.nextInt(); //le a resposta

        if (resposta3 == 90) {
            System.out.println("Correto! Um ângulo reto é um ângulo de 90°. Parabéns!");
        } else{
            System.out.println("Incorreto! Um ângulo reto é um ângulo de 90°.");
        }
    }
}