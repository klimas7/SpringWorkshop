package pl.klimas7.spring.core.order;

public class Good implements Rating {
    @Override
    public int getRating() {
        return 2;
    }
}
