package Exercicios;

import java.util.Scanner;

public class exercico13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Integer[] numeros = new Integer[12];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "elemento");
            numeros[i] = teclado.nextInt();
        }

        int troca;
        for (int l = 0; l < numeros.length; l++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] < numeros[i + 1]){
                    troca = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = troca;
                }
            }

        }

        System.out.print("elementos ordenados em ordem dcrescente");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ",");
        }

        teclado.close();
    }
}

