package decisao;
import java.util.Scanner;
public class operadoresex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        double produto = scanner.nextDouble();
        if (produto <= 99){
            double frete = produto + 15;
            System.out.println("O valor total e:"+frete);
        }
        else{
            System.out.println("O valor total e:"+ produto);
    }
}}
