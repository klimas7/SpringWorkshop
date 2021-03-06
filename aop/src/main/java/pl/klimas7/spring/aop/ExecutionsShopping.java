package pl.klimas7.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class ExecutionsShopping {
    private final Shop shop;
    private final VerySmartCustomer verySmartCustomer;

    public ExecutionsShopping(Shop shop, VerySmartCustomer verySmartCustomer) {
        this.shop = shop;
        this.verySmartCustomer = verySmartCustomer;
    }

    @PostConstruct
    public void shopping() {
        shop.buy();

        shop.addToBasket("KrzEsło");
        shop.addToBasket("Krzesło");
        shop.addToBasket("KrzeSło");
        shop.addToBasket("  Krzesło");
        shop.addToBasket("Stół");
        shop.addToBasket("Kubek");
        shop.addToBasket("Kubek ");
        shop.addToBasket(null);

        log.info("----------------------");
        verySmartCustomer.showCounts();

        log.info("----------------------");
        ((SelfServiceShop)shop).selfBuy();
    }
}
