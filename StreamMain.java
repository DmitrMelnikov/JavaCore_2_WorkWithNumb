import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class StreamMain {

    public static void main(String[] args) {

//        Отфильтруйте положительные числа.
//        Найдите среди этих положительных чисел четные.
//        Отсортируйте отфильтрованные числа в порядке возрастания.
//        Выведите результат на экран.

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> stream = intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder()).toList();

        stream.forEach(System.out::println);
        System.out.println(stream);
    }
}
