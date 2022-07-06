package estrutura_sequencial;

import java.util.Scanner;

public class outroexercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conta de luz:");
        double luz = scanner.nextDouble();
        System.out.println("Conta de agua:");
        double agua = scanner.nextDouble();
        System.out.println("Conta telefone:");
        double telefone = scanner.nextDouble();
        System.out.println("Escola do filho:");
        double escola = scanner.nextDouble();
        System.out.println("Fatura do cartão:");
        double cartao = scanner.nextDouble();
        System.out.println("Conta do super-mercado:");
        double mercado = scanner.nextDouble();
        double total = luz+ agua + telefone+escola+cartao+mercado;
        System.out.println("O total do mes e:"+total+" mes");
    }
}
