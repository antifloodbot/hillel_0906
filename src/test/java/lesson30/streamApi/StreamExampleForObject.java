package lesson30.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExampleForObject {
    public static void main(String[] args) {
        List<CarForStream> carForStreamList = new ArrayList<>();
        carForStreamList.add(new CarForStream("BMW", 2010));
        carForStreamList.add(new CarForStream("Honda", 2010));
        carForStreamList.add(new CarForStream("Tesla", 2020));
        carForStreamList.add(new CarForStream("VAZ", 2000));
        carForStreamList.add(new CarForStream("opel", 2005));
        carForStreamList.add(new CarForStream("BMW", 2018));
        carForStreamList.add(new CarForStream("bmw", 2013));

        Stream<CarForStream> carForStreamStream = carForStreamList.stream();

        Stream<CarForStream> filteredStream = carForStreamStream.filter(x -> x.getYear() > 2012)
                .filter(x -> !"BMW".equalsIgnoreCase(x.getModel()));

        filteredStream.forEach(System.out::println);

    }
}
