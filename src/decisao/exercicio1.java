package decisao;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
        System.out.println("ESCOLHA UMA DAS OPÇÕES PARA CALCULAR OS NÚMEROS");
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão ");
        System.out.print(":");
        double variavelRecebeOpcao = scanner.nextDouble();
        if (variavelRecebeOpcao == 1) {
            System.out.print("DIGITE O PRIMEIRO NÚMERO:");
            double primeiroNumero = scanner.nextDouble();
            System.out.print("DIGITE O SEGUNDO NÚMERO:");
            double segundoNumero = scanner.nextDouble();
            double somaDosNumeroDigitados = primeiroNumero + segundoNumero;
            System.out.println("A SOMA DO PRIMEIRO NÚMERO COM O SEGUNDO NÚMERO É IGUAL A: " + somaDosNumeroDigitados);
        } else if (variavelRecebeOpcao == 2) {
            System.out.print("DIGITE O PRIMEIRO NÚMERO:");
            double primeiroNumero = scanner.nextDouble();
            System.out.print("DIGITE O SEGUNDO NÚMERO:");
            double segundoNumero = scanner.nextDouble();
            double subtracaoDosNumeroDigitados = primeiroNumero - segundoNumero;
            System.out.print("A SUBTRAÇÃO DO PRIMEIRO NÚMERO COM O SEGUNDO NÚMERO É IGUAL A: " + subtracaoDosNumeroDigitados);
        } else if (variavelRecebeOpcao == 3) {
            System.out.print("DIGITE O PRIMEIRO NÚMERO:");
            double primeiroNumero = scanner.nextDouble();
            System.out.print("DIGITE O SEGUNDO NÚMERO:");
            double segundoNumero = scanner.nextDouble();
            double multiplicaoDosNumeroDigitado = primeiroNumero * segundoNumero;
            System.out.print("A MULTIPLICAÇÃO DO PRIMEIRO NÚMERO COM O SEGUNDO NÚMERO É IGUAL A: " + multiplicaoDosNumeroDigitado);
        } else if (variavelRecebeOpcao == 4) {
            System.out.print("DIGITE O PRIMEIRO NÚMERO:");
            double primeiroNumero = scanner.nextDouble();
            System.out.print("DIGITE O SEGUNDO NÚMERO:");
            double segundoNumero = scanner.nextDouble();
            double divasaoDosNumeroDigitado = primeiroNumero / segundoNumero;
            System.out.print("A MULTIPLICAÇÃO DO PRIMEIRO NÚMERO COM O SEGUNDO NÚMERO É IGUAL A:" + divasaoDosNumeroDigitado);
        } else {
            System.out.println("O NÚMERO NÃO ESTÁ ENTRE AS OPÇÕES DE ESCOLHA !");
        }
        scanner.close();
    }
}


