
interface fog{
    public String something();
}
public class LamdaDemo {
    public static void main(String[] args) {
        fog f = () -> {
            return "Hi";

        };
        System.out.println(f.something());
    }
}

