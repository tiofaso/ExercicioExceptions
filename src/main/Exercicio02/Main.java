package Exercicio02;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Boas vindas ao conversor de moedas");

        //Iniciando leitor de teclado
        LeitorTeclado teclado = new LeitorTeclado();

        int moedaEscolhida = teclado.menuTeclado();


        BigDecimal valorZero = BigDecimal.valueOf(0.0);

        switch (moedaEscolhida){
            case 1://Real para dólar
                LeitorTeclado dolarTeclado = new LeitorTeclado();
                BigDecimal dinheiroDolar = dolarTeclado.valorConverter();

                if(dinheiroDolar.compareTo(valorZero) <= 0){
                    System.out.println("Valor inválido, por favor, tente novamente");
                    dinheiroDolar = dolarTeclado.valorConverter();
                }

                //Convertendo dinheiro
                ConversorDolar dolar = new ConversorDolar();
                System.out.println("CONVERÇÃO - REAL > DÓLAR");
                System.out.println("R$" + dinheiroDolar + "= US$" + dolar.converteDolar(dinheiroDolar));

                break;

            case 2://Real para dólar canadense
                LeitorTeclado canadenseTeclado = new LeitorTeclado();
                BigDecimal dinheiroDolaCanadense = canadenseTeclado.valorConverter();


                if(dinheiroDolaCanadense.compareTo(valorZero) <= 0){
                    System.out.println("Valor inválido, por favor, tente novamente");
                    dinheiroDolaCanadense = canadenseTeclado.valorConverter();
                }

                //Convertendo dinheiro
                ConversorDolarCanadense dolarCanadense = new ConversorDolarCanadense();
                System.out.println("CONVERÇÃO - REAL > DÓLAR CANADENSE");

                System.out.println("R$" + dinheiroDolaCanadense + "= CAD$" + dolarCanadense.converteDolarCanadense(dinheiroDolaCanadense) );
                break;
            case 3://Real para euro
                LeitorTeclado euroTeclado = new LeitorTeclado();
                BigDecimal dinheiroEuro = euroTeclado.valorConverter();


                if(dinheiroEuro.compareTo(valorZero) <= 0){
                    System.out.println("Valor inválido, por favor, tente novamente");
                    dinheiroEuro = euroTeclado.valorConverter();
                }

                //Convertendo dinheiro
                ConversorEuro euro = new ConversorEuro();
                System.out.println("CONVERÇÃO - REAL > EURO");

                System.out.println("R$" + dinheiroEuro + "= EU$" + euro.converteEuro(dinheiroEuro) );

                break;
            case 4://Real para libra esterlina
                LeitorTeclado libraTeclado = new LeitorTeclado();
                BigDecimal dinheiroLibra = libraTeclado.valorConverter();


                if(dinheiroLibra.compareTo(valorZero) <= 0){
                    System.out.println("Valor inválido, por favor, tente novamente");
                    dinheiroLibra = libraTeclado.valorConverter();
                }

                //Convertendo dinheiro
                ConversorLibra libra = new ConversorLibra();
                System.out.println("CONVERÇÃO - REAL > LIBRA");

                System.out.println("R$" + dinheiroLibra + "= £$" + libra.converteLibra(dinheiroLibra) );

                break;

        }//fim switch



    }
}
