package exerciciosGeral;

public class conversoesCastingDio {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        long li;
        int il = 10;
        li = il;

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;

        int i3;
        long l3 = 10000L;
        i3 = (int) l3;

        System.out.println(li);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(s1);

    }

}
