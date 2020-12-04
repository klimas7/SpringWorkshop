package pl.klimas7.spring.core.order;

public class Bad implements Rating {
    @Override
    public int getRating() {
        return 3;
    }
}
