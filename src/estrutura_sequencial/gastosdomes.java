package estrutura_sequencial;
import java.util.Scanner;
public class gastosdomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotal = 0;
        System.out.println("luz");
        valorTotal+= scanner.nextDouble();
        System.out.println("agua");
        valorTotal+= scanner.nextDouble();
        System.out.println("telefone");
        valorTotal+= scanner.nextDouble();
        System.out.println("escola");
        valorTotal+= scanner.nextDouble();
        System.out.println("mercado");
        valorTotal+= scanner.nextDouble();
        System.out.println("cartão");
        valorTotal+= scanner.nextDouble();
        System.out.println("O valor total e:"+ valorTotal);

    }
}
