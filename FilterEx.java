import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FilterEx<T, R> {
    public static <T> T[] filter(T[] arr, Function<T, T> func) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = func.apply(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {

        Function func1 = new Function<Integer, Integer>() {
            public Integer apply(Integer t) {
                return t * t;
            };
        };

        Function func2 = new Function<String, String>() {
            public String apply(String t) {
                return t.toUpperCase();
            };
        };    
        Integer[] arrInt = { 1, 2, 3, 4 };
        String[] arrString = { "text", "data", "uppercase"};
        Integer[] resultArrInt = filter(arrInt, func1);
        String[] resultArrString = filter(arrString, func2);

        System.out.println(Arrays.toString(resultArrInt));
        System.out.println(Arrays.toString(resultArrString));
    }

}
