package Exercicio;

import java.util.Scanner;



public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdeLampadas;
        boolean[] lampadas;

        System.out.println("Quantas lampadas teremos: ");
        qtdeLampadas = entrada.nextInt();

        lampadas = new boolean[qtdeLampadas];

        for (int caminhada = 1; caminhada <= lampadas.length; caminhada++) {
          for (int posicao = 1; posicao <= lampadas.length; posicao++) {
              if(posicao % caminhada == 0){
              lampadas[posicao-1] = !lampadas[posicao-1];
          }
        }

        }
        System.out.println("[");
    for (int i = 0; i < lampadas.length; i++) {
        if(lampadas[i]){
        System.out.println("ON");
        }else{
            System.out.println("OFF");
        }
    }
    System.out.println("]");
        entrada.close();
    }
    
}
