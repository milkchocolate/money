package org.mad.money;

import org.mad.money.oo.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class MoneyApplication implements CommandLineRunner {
    private final Application ooApplication;
    private final org.mad.money.fp.Application fpApplication;

    MoneyApplication(Application ooApplication, org.mad.money.fp.Application fpApplication) {
        this.ooApplication = ooApplication;
        this.fpApplication = fpApplication;
    }

    public static void main(String[] args) {
        SpringApplication.run(MoneyApplication.class, args);
    }

    @Override
    public void run(String... args) {
        var listingPrice = new BigDecimal(100);

        System.out.println(ooApplication.getClass().getName());
        System.out.println(ooApplication.run(listingPrice));

        System.out.println();

        System.out.println(fpApplication.getClass().getName());
        System.out.println(fpApplication.run(listingPrice));
    }
}
