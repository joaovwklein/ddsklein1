package decisao;

import java.util.Scanner;

public class lista2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double numero = scanner.nextDouble();

        if ( numero >= 0 ) {
            System.out.println("esse numero e positivo");
        }
        else {
            System.out.println("Esse numero e negativo");
        }


    }
}
