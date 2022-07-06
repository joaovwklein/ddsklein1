package decisao;
import java.util.Scanner;
public class alfabeto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma letra: ");
        String letra = scanner.next();
        if (letra.equals("a") || letra.equals("A") || letra.equals("E")||letra.equals("e")||letra.equals("I")||letra.equals("i")||letra.equals("O")||letra.equals("o")||letra.equals("U")||letra.equals("u")){
            System.out.println("essa letra e vogal");}
        else System.out.println("essa letra e consoante");
        }
    }


