package org.mad.money.oo;

import java.math.BigDecimal;

public interface Pricing {
    BigDecimal calculateFinalPrice(BigDecimal listingPrice);
}
