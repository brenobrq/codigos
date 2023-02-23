package Exercicios;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int vta = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        do {
            System.out.println("Informe valor: ");
            vta = teclado.nextInt();

            if (vta > maior){
                maior = vta;
            }

            if (vta < menor) {
                menor = vta;

            }

            System.out.println("Maior valor " + maior);
            System.out.println("Menor valor " + menor);

        }while (vta >= 0);




        teclado.close();
    }
}


