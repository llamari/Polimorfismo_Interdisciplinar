package geral;

//classe abstrada q todas as subclasses dos tópicos vão herdar
public abstract class Topico {

    //obrigatório ter uma explicação do conteúdo
    public abstract void explicacao();

    //obrigatório ter questões do conteúdo
    public abstract void questoes();
}