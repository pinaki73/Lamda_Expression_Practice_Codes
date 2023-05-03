package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String > arr = new ArrayList<>();
        arr.add("Rohit");
        arr.add("Henry");
        arr.add("Michael");
        arr.add("Rohan");
        arr.add("George");
        arr.add("Raghav");
        List<String > nameswithR = arr.stream().sorted().collect(Collectors.toList());
        for ( String i:nameswithR)
              {
                  System.out.println(i);
        }
        System.out.println("The original list is");
        for (String a:arr
             ) {
           System.out.println(a);
        }
//        Or we can directly print the nameswithR object like this;
//          System.out.println(nameswithR);
    }
}
