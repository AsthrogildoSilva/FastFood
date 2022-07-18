package ExercicioMetodosDio;

public class main {
    public static void main(String[] args) {

        //CalculadoraSimples.soma(5, 10);
        //Mensagens.obterMensagem(10);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
