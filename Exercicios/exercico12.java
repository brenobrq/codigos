package Exercicios;

import java.util.Scanner;

public class exercico12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] temperatura = new double[21];
        double soma = 1;


        for (int i=1; i < temperatura.length; i++){
            System.out.println("Digite as temperaturas " + (i) + ":");
            temperatura[i] = teclado.nextDouble();
            soma = temperatura[i];
        }

        double menortemperatura = Integer.MAX_VALUE;
        for (int i = 1; i < temperatura.length; i++) {
            if (temperatura[i] < menortemperatura)
                menortemperatura = temperatura[i];




        }


        double maiorTemperatura = Integer.MIN_VALUE;
        for (int i = 1; i < temperatura.length; i++) {
            if (temperatura[i] > maiorTemperatura) {
                maiorTemperatura = temperatura[i];
            }
        }

        double mediaDeTemperatura = soma / 20;

        System.out.println("A maior temperatura foi " + maiorTemperatura);
        System.out.println("A menor temperatura foi " + menortemperatura);
        System.out.println("A média temperatura foi " + mediaDeTemperatura);

        teclado.close();

    }
}

