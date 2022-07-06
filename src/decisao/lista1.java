package decisao;

import java.util.Scanner;

public class lista1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite outro numero: ");
        double numero2 = scanner.nextDouble();

        if(numero1 >= numero2) {
            System.out.println("o numero maior:" + numero1);

        }
        else{
            System.out.println("o numero maior:" +numero2);}
    }
}
