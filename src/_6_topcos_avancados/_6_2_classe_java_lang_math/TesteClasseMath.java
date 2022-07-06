package _6_topcos_avancados._6_2_classe_java_lang_math;

import static java.lang.Math.PI;
import static java.lang.Math.max;

public class TesteClasseMath {
    public static void main(String[] args) {
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("Comprimento: " + comprimento);

        double[] precosProdutoA = {30.20 , 25.49};
        double maiorPreco = max(precosProdutoA[0] , precosProdutoA[1]);
        System.out.println("Maior preço: " +maiorPreco);
        System.out.println("Menor preço: " + Math.min(precosProdutoA[0] , precosProdutoA[1]));

        System.out.println("2^3: " + Math.pow(2,3));

        System.out.println("Raiz de 9: " + Math.sqrt(9));

        double n = 5.4;
        System.out.println("Menor inteiro: " + Math.floor(n));
        System.out.println("Maior inteiro: " + Math.ceil(n));
        System.out.println("Arredondando: " + Math.round(n));


        System.out.println("Seno: " + Math.sin(40));

        double numeroAleatorio = Math.random() * 100;
        double numeroAleatorioArrendodado = Math.ceil(numeroAleatorio);
        System.out.println(numeroAleatorioArrendodado);





    }

}
