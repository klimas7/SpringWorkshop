package pl.klimas7.spring.core.diff;

public class Square implements Shape {
    private final static int a = 5;
    @Override
    public int area() {
        return  a * a;
    }
}
