package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    public static void main(String[] args) {
        List array_a = new ArrayList<>(Arrays.asList(14, 5, 23, 89, 23));
        List array_b = new ArrayList<>(Arrays.asList(5, 89, 5, 14, 6));
        List array_c = new ArrayList<>(Arrays.asList(50, 89, 5, 14));

        List<Integer> array_final = compareArrays(array_a, array_b, array_c);

        System.out.println(array_final);

        array_final.sort(null);

        System.out.println(array_final);
    }

    private static List<Integer> compareArrays(List array_a, List array_b, List array_c) {
        List<Integer> array_final = new ArrayList();

        return (List<Integer>) array_a.stream().map(a -> (array_b.contains(a) && array_c.contains(a)) ? a:null).collect(Collectors.joining(","));
    }
}
