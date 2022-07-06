package estrutura_sequencial;


import java.util.Scanner;

public class exercico5 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos metros voce deseja converter:");
        double metros = scanner.nextDouble();
        double resultado = metros * 100 ;
        System.out.println("A conversão e:" + resultado + "cm" );




    }
}
