package ExercicioMetodosDio;

public class AreaQuadradoRetanguçoTrapezio {

    public static void areaQuadrado(double lado1, double lado2) {
        double resultado = lado1 * lado2;
        System.out.println("A área do quadrado informado é: " + resultado);
    }

    public static void areaRetangulo(double base, double altura) {
        double resultado = base * altura;
        System.out.println("A área do trapezio é: " + resultado);
    }

    public static void areaTrapezio(double baseMaior, double baseMenor, double altura) {
        double resultado = ((baseMaior+baseMenor)*altura)/2;
        System.out.println("A área do trapezio é igual a: " + resultado);
    }
}
