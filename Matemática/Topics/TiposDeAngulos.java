import java.util.Scanner;

public class TiposDeAngulos extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void Explicacao() {
        System.out.println("Ângulos básicos são classificados de acordo com a sua medida:");
        System.out.println("- Agudo: menor que 90°");
        System.out.println("- Reto: igual a 90°");
        System.out.println("- Obtuso: maior que 90° e menor que 180°");
        System.out.println("- Raso: igual a 180°");
        System.out.println("- Giro completo: igual a 360°");
    }

    @Override
    public void Questoes() {
        System.out.println("1. Classifique um ângulo de 45°. (agudo, reto, obtuso, raso, giro completo)");
        String resposta1 = teclado.nextLine();

        if (resposta1 == "agudo" || resposta1=="Agudo") {
            System.out.println("Correto! Um ângulo de 45° é um ângulo agudo. Parabéns!");
        } else{
            System.out.println("Incorreto! Um ângulo de 45° é um ângulo agudo.");
        }

        System.out.println("2. Um ângulo de 150° é agudo, reto ou obtuso?");
        String resposta2 = teclado.nextLine();

        if (resposta2 == "obtuso" || resposta2 == "Obtuso") {
            System.out.println("Correto! Um ângulo de 150° é um ângulo obtuso. Parabéns!");
        } else{
            System.out.println("Incorreto! Um ângulo de 150° é um ângulo obtuso.");
        }
    }
}