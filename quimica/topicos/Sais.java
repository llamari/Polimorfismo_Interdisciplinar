package quimica.topicos;

import java.util.Scanner;
import geral.Topico;

public class Sais extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        //Explicação sobre sais
        System.out.println(
                "Sais são compostos iônicos que apresentam, no mínimo, um cátion diferente de H+ e um ânion diferente de OH-.");
        System.out.println(
                "Um sal pode ser obtido em uma reação de neutralização, que é a reação entre um ácido e uma base.");
    }

    @Override
    public void questoes() {

        //Questão 1
        System.out.println("1) O que caracteriza um sal?\n" +
                "a) Possui H+ e OH- como íons principais\n" +
                "b) Tem cátion diferente de H+ e ânion diferente de OH-\n" +
                "c) É formado apenas por metais\n" +
                "d) É um composto molecular");
        //Um sal é um composto q tenha um cátion diferentede H+ e um ânion diferente de OH-. Ou seja, se tiver H+ é ácido, se tiver OH- é base e se tiver 2 elementos e um foro Oxigenio é oxido. Se não for nenhuma ds opções é um sal.
        if (teclado.nextLine().equalsIgnoreCase("b")) {
            System.out.println(
                    "Parabéns! Resposta correta! Um sal é um composto que tem cátion diferente de H+ e ânion diferente de OH-.");
        } else {
            System.out.println(
                    "Incorreto! Um sal é um composto que tem cátion diferente de H+ e ânion diferente de OH-.");
        }

        //Questão 2
        System.out.println("2) Como um sal é obtido?\n" +
                "a) Pela queima de um combustível\n" +
                "b) Pela dissolução de uma base\n" +
                "c) Pela reação de neutralização entre ácido e base\n" +
                "d) Pela evaporação de água");
        //Um sal é obtido se vc neutralizar um ácido e base ao juntá-los. ácido + base = sal + H20
        if (teclado.nextLine().equalsIgnoreCase("c")) {
            System.out.println(
                    "Parabéns! Resposta correta! Um sal é obtido pela reação de neutralização entre ácido e base.");
        } else {
            System.out.println(
                    "Incorreto! Um sal é obtido pela reação de neutralização entre ácido e base.");
        }

        //Questão 3
        System.out.println("3) Sais são compostos de qual tipo?\n" +
                "a) Covalentes\n" +
                "b) Iônicos\n" +
                "c) Orgânicos\n" +
                "d) Voláteis");
        //Sais são compostos iônicos
        if (teclado.nextLine().equalsIgnoreCase("b")){
            System.out.println(
                    "Parabéns! Resposta correta! Sais são compostos iônicos.");
        } else {
            System.out.println(
                    "Incorreto! Sais são compostos iônicos.");
        }
    }
}
