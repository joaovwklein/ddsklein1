package decisao;
import java.util.Scanner;
public class lista10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("informe o turno que voce estuda:\nM-matutino\nV-vespertino\nN-noturno");
        String turno = scanner.nextLine();

        if (turno.equals("M") || turno.equals("m")){
            System.out.println("Bom dia");
}
        else if (turno.equals("V")|| turno.equals("v")){
            System.out.println("Boa tarde");
        }
        else if (turno.equals("N")|| turno.equals("n")){
            System.out.println("Boa noite");
        }
        else System.out.println("Invalido");

    }}
