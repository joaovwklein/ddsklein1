package decisao;

import java.util.Scanner;

public class produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro preço: ");
        double num1 = scanner.nextDouble();
        System.out.println("O segundo:");
        double num2= scanner.nextDouble();
        System.out.println("O terceiro:");
        double num3 = scanner.nextDouble();


        boolean menor_numero = num1<num2 & num1<num3;
        boolean menor_numero2 = num2<num1 & num2<num3;

        if (menor_numero){
            System.out.println("O mais barato e:"+num1);
        }
        else if (menor_numero2){
            System.out.println("O mais barato e:"+num2);}

        else{
            System.out.println("O mais barato e:"+num3);
        }

    }
}
