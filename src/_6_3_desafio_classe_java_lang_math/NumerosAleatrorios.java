package _6_3_desafio_classe_java_lang_math;

import java.util.Random;
import java.util.Scanner;

public class NumerosAleatrorios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int quantidadeDeJogos = entrada.nextInt();


        int numero;
        int[] num = new int[6];
        Random r = new Random();
        numero = r.nextInt(60) + 1;
        for (int i = 1; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (numero == num[j] && j != i) {
                    numero = r.nextInt(60) + 1;
                } else {
                    num[i] = numero;
                }
            }
        }
        for (int i = 1; i <=quantidadeDeJogos; i++) {
            System.out.print(num[i] + "  ");
        }

            }
        }
