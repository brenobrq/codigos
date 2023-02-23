package Exercicios;

public class exercicio8 {
    public static void main(String[] args) {

        int celsius = 10;
        int fahrenheit = (9 * celsius + 160) /5;

        for (int i = 1; i <10; i++) {
            celsius = celsius + 10;
            System.out.println( celsius + "temperatura em celsius é " + celsius + " = fahrenheit"  + fahrenheit);
            fahrenheit = (9 * celsius + 160) /5;
        }
    }
}
