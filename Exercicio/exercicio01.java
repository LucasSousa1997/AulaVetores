package Exercicio;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        String[] nome = new String[3];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o seu nome: ");
            nome[i] = entrada.nextLine();

        }
        for (int i = nome.length - 1; i >= 0; i--) {
            System.out.println(nome[i] + " ");

        }
        entrada.close();
    }

}
