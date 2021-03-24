package Exercicio;

import java.util.Scanner;

public class exercicio02 { 
    public static void main(String[] args) {
        double[] nota = new double[4];
        Scanner entrada = new Scanner(System.in);
        double media = 0;
        int maior = 0;

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a sua nota: ");
            nota[i] = entrada.nextDouble();
            media += nota[i];
        }
        media /= nota.length;

        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > media) {
                maior++;
            }

        }
        System.out.println("Média: " + media);
        System.out.println("Notas acima da média: " + maior);

        entrada.close();
    }

}
