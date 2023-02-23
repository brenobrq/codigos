package Exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valorN = teclado.nextInt();

        if (valorN < 0 );
            valorN = valorN * (-1);

            System.out.println("o valor numerico transormado em positivo é" + valorN);

            teclado.close();

    }
}