package Exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("informe o valor de A: ");
        double A = teclado.nextDouble();

        System.out.println("informe o valor de B: ");
        double B = teclado.nextDouble();

        System.out.println("informe o valor de C: ");
        double C = teclado.nextDouble();


        double delta = (B * B - (4 * A * C));

        double X1 = (-B + Math.sqrt(delta)) / ((2 * A));
        double X2 = (-B - Math.sqrt(delta)) / ((2 * A));

        if (delta < 0){
            System.out.println("Não há solução nos números reais");
        }

        if (delta == 0){
            System.out.println(X1);
        }


        if (delta > 0){
            System.out.println("esse será o valor: " + X1 + "|" + X2);
        }


        teclado.close();
    }
}



