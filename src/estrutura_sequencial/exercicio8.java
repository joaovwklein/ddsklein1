package estrutura_sequencial;

import java.util.Scanner;


public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quanto voce ganha por hora:");
        double valorPorHora = scanner.nextDouble();
        System.out.println("Informe quantas horas voce trabalha no mes:");
        double horasNoMes = scanner.nextDouble();
        double salario = valorPorHora * horasNoMes;
        System.out.println("Seu salario e:" + salario );
    }
}
