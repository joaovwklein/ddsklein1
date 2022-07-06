package decisao;
import java.util.Scanner;
public class sexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o seu sexo: 1-M ; 2-F");
        String sexo = scanner.next();
        if (sexo.equals("M") || sexo.equals("m") ){
            System.out.println("Seu sexo e masculino");
        }
        else if (sexo.equals("F") || sexo.equals("f") ){
            System.out.println("Seu sexo e feminino");
        }
        else System.out.println("Sexo invalido");
    }
}
