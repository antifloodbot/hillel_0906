package lesson30.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleMap {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");

        Set<String> stream = list.stream().map(String::toUpperCase).collect(Collectors.toSet());
        stream.forEach(System.out::println);
    }
}
