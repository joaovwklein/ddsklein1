package decisao;
import java.util.Scanner;
public class exerciciosnotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite aqui a sua nota:");
        Double nota = scanner.nextDouble();
        if (nota < 70)
        System.out.println("Voce nao passou");
        else
        System.out.println("Parabéns, você passou");


    }
}