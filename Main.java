import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Отфильтруйте положительные числа.
//        Найдите среди этих положительных чисел четные.
//        Отсортируйте отфильтрованные числа в порядке возрастания.
//        Выведите результат на экран.

        List<Integer> result = new ArrayList<>();
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.sort(Comparator.naturalOrder());
        for (int x : intList) {
            if (x <= 0) continue;
            if (x % 2 != 0) continue;
            result.add(x);

        }
        System.out.println(result);
    }
}