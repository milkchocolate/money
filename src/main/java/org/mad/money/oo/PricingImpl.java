package org.mad.money.oo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class PricingImpl implements Pricing {
    private final Discount discount;
    private final Tax tax;

    PricingImpl(Discount discount, Tax tax) {
        this.discount = discount;
        this.tax = tax;
    }

    @Override
    public BigDecimal calculateFinalPrice(BigDecimal listingPrice) {
        var discountedPrice = discount.applyDiscount(listingPrice);
        return tax.applyTax(discountedPrice);
    }
}
