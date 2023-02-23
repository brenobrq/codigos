package Exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("informe salario");
            double sm = teclado.nextDouble();
            System.out.println("Agora o reajuste");
            double pr = teclado.nextDouble();

            double ms = (sm + pr);
            System.out.println("novo salario " + ms);





            teclado.close();
        }
    }








