package decisao;
import java.util.Scanner;
public class numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Outro numero:");
        double num2= scanner.nextDouble();
        System.out.println("Outro numero:");
        double num3 = scanner.nextDouble();

        boolean maior_numero = num1 > num2 & num1 > num3;
        boolean maior_numero2 = num2 > num1 & num2 > num3;

        if (maior_numero){
            System.out.println("O maior numero eh :" +num1);
        }
        else if (maior_numero2){
            System.out.println("o maior numero e :"+num2);
        }
        else {
            System.out.println("O maior numero e:"+num3);
        }

        boolean menor_numero = num1<num2 & num1<num3;
        boolean menor_numero2 = num2<num1 & num2<num3;

        if (menor_numero){
            System.out.println("O menor numero e:"+num1);
        }
        else if (menor_numero2){
            System.out.println("O menor numero e:"+num2);}

        else{
            System.out.println("Omenor numero e:"+num3);
        }




    }
}
