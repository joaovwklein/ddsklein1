package com.company;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado:");
        double lado = scanner.nextDouble();
        double area = lado * lado * 2 ;
        System.out.println("A area do quadrado e:" + area );
    }
}
