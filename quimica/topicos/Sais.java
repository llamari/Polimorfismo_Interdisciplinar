package quimica.topicos;

import java.util.Scanner;
import geral.Topico;

public class Sais extends Topico {
    Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println(
                "Sais são compostos iônicos que apresentam, no mínimo, um cátion diferente de H+ e um ânion diferente de OH-.");
        System.out.println(
                "Um sal pode ser obtido em uma reação de neutralização, que é a reação entre um ácido e uma base.");
    }

    @Override
    public void questoes() {
        System.out.println("1) O que caracteriza um sal?\n" +
                "a) Possui H+ e OH- como íons principais\n" +
                "b) Tem cátion diferente de H+ e ânion diferente de OH-\n" +
                "c) É formado apenas por metais\n" +
                "d) É um composto molecular");
        if (teclado.nextLine().equalsIgnoreCase("b")) {
            System.out.println(
                    "Parabéns! Resposta correta! Um sal é um composto que tem cátion diferente de H+ e ânion diferente de OH-.");
        } else {
            System.out.println(
                    "Incorreto! Um sal é um composto que tem cátion diferente de H+ e ânion diferente de OH-.");
        }

        System.out.println("2) Como um sal é obtido?\n" +
                "a) Pela queima de um combustível\n" +
                "b) Pela dissolução de uma base\n" +
                "c) Pela reação de neutralização entre ácido e base\n" +
                "d) Pela evaporação de água");
        if (teclado.nextLine().equalsIgnoreCase("c")) {
            System.out.println(
                    "Parabéns! Resposta correta! Um sal é obtido pela reação de neutralização entre ácido e base.");
        } else {
            System.out.println(
                    "Incorreto! Um sal é obtido pela reação de neutralização entre ácido e base.");
        }

        System.out.println("3) Sais são compostos de qual tipo?\n" +
                "a) Covalentes\n" +
                "b) Iônicos\n" +
                "c) Orgânicos\n" +
                "d) Voláteis");
        if (teclado.nextLine().equalsIgnoreCase("b")){
            System.out.println(
                    "Parabéns! Resposta correta! Sais são compostos iônicos.");
        } else {
            System.out.println(
                    "Incorreto! Sais são compostos iônicos.");
        }
    }
}
