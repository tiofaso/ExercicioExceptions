package Exercicio02;

import java.math.BigDecimal;

public class ConversorLibra {

    private BigDecimal libraHoje = new BigDecimal(7.50);
    private BigDecimal valorFinal = new BigDecimal(0.0);
    public BigDecimal converteLibra(BigDecimal dinheiro){
        valorFinal = dinheiro.multiply(libraHoje);
        return valorFinal;


    }
}
