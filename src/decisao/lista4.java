package decisao;

import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra:");
        String letra = scanner.nextLine();
        boolean vogais = letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")||letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u");

        if (vogais){
            System.out.println("Essa letra e uma vogal");

        }
        else {
            System.out.println("Essa letra e uma consoante");
        }
    }
}
