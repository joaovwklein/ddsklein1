package com.company;

import java.util.Scanner;


public class exercicio6 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("coloque o raio do circulo:");
        double raio = scanner.nextDouble();
        double area = 3.14 * raio * raio ;

        System.out.println("A area do circulo e:" + area );


    }

}
