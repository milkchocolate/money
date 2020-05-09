package org.mad.money.oo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class TaxImpl implements Tax {
    private final BigDecimal rate;

    public TaxImpl(@Value("${money.tax.rate}") String rateString) {
        this.rate = new BigDecimal(rateString);
    }

    @Override
    public BigDecimal applyTax(BigDecimal amount) {
        var tax = amount.multiply(rate);
        return amount.add(tax);
    }
}
