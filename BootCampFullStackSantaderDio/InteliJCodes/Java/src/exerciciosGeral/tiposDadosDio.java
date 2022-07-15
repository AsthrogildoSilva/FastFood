package exerciciosGeral;

public class tiposDadosDio {
    public static void main(String[] args) {
        // Criar duas variáveis para cada tipo de dado apresentado.
            // Inteiros:
        byte b = -128;
        byte B = 127;
        short s = -32768;
        short S = 32767;
        int i = -2147483648;
        int I = 2147483647;
        long l = -9223372036854775808L;
        long L = 9223372036854775807L;
            // Fracionados:
        float f = 3.14f;
        double F = 3.14;
            // Lógicos:
        boolean t = false;
        boolean T = true;
            // Textuais:
        char c = '\u0084'; // Buscar porque ele não reconheceu o texto unicode.
        char C = 'T';
        String a = "Textos completos.";

        System.out.println(b);
        System.out.println(B);
        System.out.println(s);
        System.out.println(S);
        System.out.println(i);
        System.out.println(I);
        System.out.println(l);
        System.out.println(L);
        System.out.println(f);
        System.out.println(F);
        System.out.println(t);
        System.out.println(T);
        System.out.println(c);
        System.out.println(C);
        System.out.println(a);
    }
}
