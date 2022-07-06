package decisao;

import java.util.Scanner;

public class lista5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com sua Primeira nota: ");
        float primeiraDoAlunoNota = scanner.nextFloat();
        System.out.print("Entre com sua segunda nota: ");
        float segundaDoAlunoNota = scanner.nextFloat();
        int numeroDeProvas = 2;
        double mediaDeNotas = (primeiraDoAlunoNota + segundaDoAlunoNota) / numeroDeProvas;
        int notaParaAMedia = 7;
        int notaParaAprovacaoComLouvor = 10;
        Boolean alunoAprovado = mediaDeNotas >= notaParaAMedia & mediaDeNotas < notaParaAprovacaoComLouvor;
        Boolean alunoAprovadoComDistincao = mediaDeNotas >= notaParaAprovacaoComLouvor;
        if (alunoAprovado) {
            System.out.println("Você passou " + mediaDeNotas);
        } else if (alunoAprovadoComDistincao) {
            System.out.println("Voce passou com distinção com  media " + mediaDeNotas);
        } else {
            System.out.println("Voce reprovou com a média de " + mediaDeNotas);
        }
        scanner.close();
    }}
