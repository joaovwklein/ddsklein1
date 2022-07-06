package decisao;
import java.util.Scanner;
public class exercicio13 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite a sua altura:");
        double altura = scanner.nextDouble();
        System.out.print("selecione o genero:M=1/F=2");
        Double genero = scanner.nextDouble();
        Boolean generoMasculino = genero == 1;

        if ( generoMasculino ){
            double masculino = 72.7 * altura - 58;
            System.out.print("O resultado e:"+masculino);
        }else{
            double feminino = 62.1 * altura - 44.7;

            System.out.print("O resultado e : "+ feminino);
        }

    }
}
