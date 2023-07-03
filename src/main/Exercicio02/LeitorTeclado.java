package Exercicio02;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeitorTeclado {
    private int valorDigitado;
    private BigDecimal dinheiro;

    public int menuTeclado(){
        System.out.printf("Selecione abaixo uma opção:\n");
        System.out.println("1 - Dólar americano");
        System.out.println("2 - Dólar canadense");
        System.out.println("3 - Euro");
        System.out.println("4 - Libra Esterlina");

        Scanner entrada = new Scanner(System.in);

        valorDigitado = entrada.nextInt();

        if(valorDigitado < 1 || valorDigitado > 4){
            throw new IllegalArgumentException("Tipo de moeda inválido");
        }else {return valorDigitado;}

    }//fim menuTeclado

    public int menuSair(){
        System.out.println("\nDeseja sair do programa? [0 - Não | 1 - Sim]");
        Scanner entrada = new Scanner(System.in);
        int sair = entrada.nextInt();
        return sair;
    }//fim menuSair

    public int menuErro(){
        System.out.println("> AVISO! - É preciso escolher uma opção!\n");
        System.out.printf("Selecione abaixo uma opção:\n");
        System.out.println("1 - Dólar americano");
        System.out.println("2 - Dólar canadense");
        System.out.println("3 - Euro");
        System.out.println("4 - Libra Esterlina");

        try(Scanner entrada = new Scanner(System.in)){
            valorDigitado = entrada.nextInt();
            return valorDigitado;
        }catch (InputMismatchException erro){
            System.out.println("É preciso digitar um número inteiro entre 1-4");
        }finally {
            if (valorDigitado < 1 || valorDigitado > 4) {
                throw new IllegalArgumentException("Tipo de moeda escolhida inválido");
            } else {
                return valorDigitado;
            }
        }
    }//Fim menuErro

    public BigDecimal valorConverter(){
        System.out.println("Digite o valor a ser convertido (em Bigdecimal)");

        Scanner entrada = new Scanner(System.in);

        try {
            dinheiro = entrada.nextBigDecimal();
            return dinheiro;
        }catch (InputMismatchException erro) {
            throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal.");
        }

    }//Fim valorConverter
}
