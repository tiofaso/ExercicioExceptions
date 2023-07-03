package Exercicio02;

import java.math.BigDecimal;

public class ConversorDolarCanadense {

    private BigDecimal canadenseHoje = new BigDecimal(4.15);
    private BigDecimal valorFinal = new BigDecimal(0.0);
    public BigDecimal converteDolarCanadense(BigDecimal dinheiro){
        valorFinal = dinheiro.multiply(canadenseHoje);
        return valorFinal;


    }
}
