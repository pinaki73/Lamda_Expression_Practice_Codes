import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        Map<String ,String > arr = new HashMap<>();
        arr.put("roy", "pinaki");
        arr.put("chatterjee", "anirban");
        arr.put("banerjee", "anirban");
        System.out.println("The for each loop is");
        arr.forEach((u,i) -> System.out.println("The first name is "+i+" "+"the last name is "+u));

    }
}


