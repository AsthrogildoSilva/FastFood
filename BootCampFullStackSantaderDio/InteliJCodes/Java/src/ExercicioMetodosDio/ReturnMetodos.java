package ExercicioMetodosDio;

public class ReturnMetodos {

    public static int idadeAtual(int ano) {
        int idade = 2022 - ano;
        return idade;
    }

    public static void deMaior(int idade) {
        if (idade < 18) {
            System.out.println("Cai Fora");
        } else
            System.out.println("Bem Vindo a putaria.");
    }
}
