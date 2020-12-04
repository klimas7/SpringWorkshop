package pl.klimas7.spring.aop;

public interface Customer {
    default void buy() {
    }

    default void addToBasket(String name) {
    }
}
