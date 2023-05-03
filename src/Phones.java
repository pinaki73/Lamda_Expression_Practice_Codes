import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Cellphones{
    int price;
    String brand;
    String model;

    @Override
    public String toString() {
        return "Cellphones{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    Cellphones(int p, String b, String m){
        price = p;
        brand = b;
        model = m;
    }
}



public class Phones {
    public static void main(String[] args) {
        List<Cellphones> c = new ArrayList<>();
        c.add(new Cellphones(1000,"Samsung","s4" ));
        c.add(new Cellphones(15000,"motorola","s8" ));
        c.add(new Cellphones(20000,"nokia","s1" ));
        c.add(new Cellphones(40000,"asus","s10" ));
        List<Cellphones> smartphones = c.stream().filter(i-> i.price>1000 && i.price<30000).collect(Collectors.toList());
        System.out.println(smartphones);
    }


}
