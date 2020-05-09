package org.mad.money.oo;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal applyTax(BigDecimal amount);
}
