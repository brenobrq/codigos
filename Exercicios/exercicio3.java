package Exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o valor numerico");
        double valorN = teclado.nextDouble();

        double ns = (valorN + 1);
        System.out.println("valor sucessor" + ns);

        double na = (valorN - 1);
        System.out.println("valor antecessor" + na);

        teclado.close();

    }


}
