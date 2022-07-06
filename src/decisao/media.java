package decisao;
import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        double media = nota1 + nota2  ;
        double media1 = media / 2 ;
        if (media1 <= 7 ){
            System.out.println("A nota alcançada e: "+media1+" ,Voce reprovou");
        }
        else if (media1 >= 10 ){
            System.out.println("A nota alcnaçada e: "+media1+" ,Voce passou com distinção");
        }
        else System.out.println("A nota alcançada e: "+media1+" ,voce passou");
    }
}