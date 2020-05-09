package org.mad.money.oo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component("ooApplication")
public class Application {
    private final Pricing pricing;

    Application(Pricing pricing) {
        this.pricing = pricing;
    }

    public BigDecimal run(BigDecimal listingPrice) {
        return pricing.calculateFinalPrice(listingPrice);
    }
}
