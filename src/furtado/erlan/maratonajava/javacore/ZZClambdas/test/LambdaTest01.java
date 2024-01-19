package furtado.erlan.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Erlan", "Furtado", "Luffy", "Zoro");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        //       forErach(strings, (String s) -> System.out.println(s));
        //       forErach(integers, (Integer i) -> System.out.println(i));
        forErach(integers, i -> System.out.println(i));
        forErach(strings, s -> System.out.println(s));
    }

    private static <T> void forErach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
