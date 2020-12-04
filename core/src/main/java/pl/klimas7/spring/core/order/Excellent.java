package pl.klimas7.spring.core.order;

public class Excellent implements Rating {
    @Override
    public int getRating() {
        return 1;
    }
}
