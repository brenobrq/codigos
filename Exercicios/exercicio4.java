package Exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        System.out.println("informe o valor");

        int valorA = teclado.nextInt();
        int valorB = teclado.nextInt();

        System.out.println(valorA - valorB);

        teclado.close();
    }
}
