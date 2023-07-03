package Exercicio02;

import java.math.BigDecimal;

public class ConversorDolar {

    private BigDecimal dolarHoje = new BigDecimal(5.25);
    private BigDecimal valorFinal = new BigDecimal(0.0);
    public BigDecimal converteDolar(BigDecimal dinheiro){
        valorFinal = dinheiro.multiply(dolarHoje);
        return valorFinal;


    }
}
