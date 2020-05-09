package org.mad.money.fp;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.function.Function;

@Component("fpApplication")
public class Application {
    private final Function<BigDecimal, BigDecimal> calculateFinalPriceForListingPrice;

    public Application(Function<BigDecimal, BigDecimal> calculateFinalPriceForListingPrice) {
        this.calculateFinalPriceForListingPrice = calculateFinalPriceForListingPrice;
    }

    public BigDecimal run(BigDecimal listingPrice) {
        return calculateFinalPriceForListingPrice.apply(listingPrice);
    }
}
