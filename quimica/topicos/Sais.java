package quimica.topicos;

import java.util.Scanner;
import geral.Topico;

public class Sais extends Topico{
        Scanner teclado = new Scanner(System.in);

    @Override
    public void explicacao() {
        System.out.println("Sais são compostos iônicos que apresentam, no mínimo, um cátion diferente de H+ e um ânion diferente de OH-.");
        System.out.println("Um sal pode ser obtido em uma reação de neutralização, que é a reação entre um ácido e uma base.");
    }

    @Override
    public void questoes() {
        System.out.println("Questão!! Uhuul :D ");
    }
}
