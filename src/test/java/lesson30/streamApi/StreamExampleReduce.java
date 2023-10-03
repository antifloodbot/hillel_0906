package lesson30.streamApi;

import java.util.stream.Stream;

public class StreamExampleReduce {

    public static void main(String[] args) {
        int count = Stream.of(1,2,3).reduce(0, (x, y) -> x + y);
        System.out.println(count);

        int count2 = 0;
        int[] array = {1,2,3};
        for (int x : array) {
            count2 += x;
        }

        System.out.println(count2);
    }
}
