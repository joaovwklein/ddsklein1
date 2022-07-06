package decisao;
import java.util.Scanner;
public class valordoproduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        double valor = scanner.nextDouble();
         System.out.println("digite o tipo de pagamento/ 1-a vista / 2- a prazo:");
         Integer pagamento = scanner.nextInt();

         boolean pagamentoAVista = pagamento.equals(1);

         Double juros = 0.0;

         if (!pagamentoAVista){
             juros = 10.0 ;

         }
        Double acrescimo = valor * juros / 100 ;

         Double valorTotal = acrescimo + valor;
        System.out.println("Valor total:"+valorTotal);










}}
