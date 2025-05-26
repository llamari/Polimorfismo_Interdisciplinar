package matematica.topicos;

import java.util.Scanner;
import geral.Topico;

public class AngulosPorRetas extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println("Quando duas retas se cruzam, formam ângulos com propriedades especiais:");
        System.out.println("- Ângulos opostos pelo vértice: têm a mesma medida.");
        System.out.println("- Ângulos complementares: somam 90°.");
        System.out.println("- Ângulos suplementares: somam 180°.");
    }

    @Override
    public void questoes() {
        //Questão 1
        System.out.println("1. Se dois ângulos são opostos pelo vértice e um mede 70°, qual é a medida do outro?");
        int resposta1 = teclado.nextInt(); //le resposta
        if (resposta1==70) { 
            System.out.println("Parabéns! Resposta correta! A medida do outro ângulo é 70°.");
        } else{
            System.out.println("Que pena... Resposta incorreta. A medida do outro ângulo é 70°");
        }

        //Questão 2
        System.out.println("2. Um ângulo mede 35°. Qual é o seu complementar?");
        int resposta2 = teclado.nextInt(); //le resposta
        if (resposta2 == 55) {
            System.out.println("Parabéns! Resposta correta! O ângulo complementar de 35° é 55°.");
        } else{
            System.out.println("Que pena... Resposta incorreta. O ângulo complementar de 35° é 55°.");
        }

        //Questão 3
        System.out.println("3. Um ângulo mede 110°. Qual é o seu suplementar?");
        int resposta3 = teclado.nextInt(); //le resposta
        if (resposta3 == 70) {
            System.out.println("Parabéns! Resposta correta! O ângulo sumplementar de 110° é 70°.");
        } else{
            System.out.println("Que pena... Resposta incorreta. O ângulo sumplementar de 110° é 70°.");
        }
    }
}
