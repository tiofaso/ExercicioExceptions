package Exercicio02;

import java.math.BigDecimal;

public class ConversorEuro {

    private BigDecimal euroHoje = new BigDecimal(6.15);
    private BigDecimal valorFinal = new BigDecimal(0.0);
    public BigDecimal converteEuro(BigDecimal dinheiro){
        valorFinal = dinheiro.multiply(euroHoje);
        return valorFinal;


    }
}
