public interface Lamda {
    public void something(int r);
}
class Demo {
    public static void main(String[] args) {
        Lamda l = (int u) -> {
            System.out.println("Hi"+" "+u);
        };
        l.something(8);
    }
}
