package decisao;
import java.util.Scanner;
public class desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto:");
        double quantidade = scanner.nextDouble();
        double subtotal = quantidade * valor;

        if (quantidade >= 10) {
            double porcentagem = subtotal * 0.90 ;
            System.out.println("O valor total com desoconto e:"+porcentagem);
        }
        else {
            System.out.println("o valor total sem desconto e :"+subtotal);

        }
    }
}
