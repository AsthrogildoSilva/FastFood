package exerciciosGeral;

import java.util.Scanner;

public class MetodosDio01_Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = 0;
        int y = 0;
        String operacao;

        System.out.println("Primeiro número: ");
        x = ler.nextInt();
        System.out.println("Segundo número: ");
        y = ler.nextInt();
        System.out.println("Escolha a operação +, -, *: ");
        ler.nextLine();
        operacao = ler.nextLine();
        //System.out.println(soma(x, y));
        if (operacao == "soma") {
            soma(x, y);
        } if (operacao == "-") {
            subtracao(x, y);
        } else {
            System.out.println("Digite algo Valido.");
        }
    }

    public static int soma(int j, int k) {
        int resultado = j + k;
        return resultado;
    }
    public static int subtracao(int j, int k) {
        int resultado = j - k;
        return resultado;
    }
    public static int multiplicacao(int j, int k) {
        int resultado = j * k;
        return resultado;
    }
    //public static int divisao()
}
