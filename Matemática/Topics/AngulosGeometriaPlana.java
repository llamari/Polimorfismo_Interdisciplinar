public class AngulosGeometriaPlana extends Topico {
    @Override
    public void Explicacao() {
        System.out.println("Na geometria plana, ângulos são muito usados em figuras como triângulos e polígonos:");
        System.out.println("- A soma dos ângulos internos de um triângulo é sempre 180°.");
        System.out.println("- A soma dos ângulos internos de um polígono é dada por (n - 2) × 180°, onde n é o número de lados.");
        System.out.println("- Cada ângulo externo de um polígono regular é igual a 360° ÷ n.");
    }

    @Override
    public void Questoes() {
        System.out.println("1. Qual é a soma dos ângulos internos de um hexágono?");
        System.out.println("2. Qual é a medida de cada ângulo interno de um triângulo equilátero?");
        System.out.println("3. Quantos graus mede cada ângulo externo de um octógono regular?");
    }
}