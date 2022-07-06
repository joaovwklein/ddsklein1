package decisao;
import java.util.Scanner;
public class nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota de matematica:");
        double mat = scanner.nextDouble();
        System.out.println("Digite a nota de portugues:");
        double port = scanner.nextDouble();
        double media = mat + port;
        if (media <= 149){
            System.out.println("Voce não passou");
        }
        else {
            System.out.println("Voce passou");
        }
    }
}
