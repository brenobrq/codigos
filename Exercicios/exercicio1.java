package Exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o valor em celsius");
        double celsius = teclado.nextDouble();

        double fahrenheit = (9 * celsius + 160) /5;

        System.out.println("o valor é" + fahrenheit);


            teclado.close();
    }
}
