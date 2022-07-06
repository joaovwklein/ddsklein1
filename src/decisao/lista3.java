package decisao;

import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1-masculino ou 2-feminino ");
        int sexo = scanner.nextInt();
        Boolean masculino  = sexo == 1 ;
        Boolean feminino  = sexo == 2 ;

        if ( masculino ){
            System.out.println("Masculino");
        }
        else if ( feminino ){
            System.out.println("Feminino");

        }
        else {
            System.out.println("Voce se considera um honda civic??????");

        }

    }
}
