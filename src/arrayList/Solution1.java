package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        Integer[] array_a = {14, 5, 23, 89, 23, 5, 5, 5};
        Integer[] array_b = {5, 89, 5, 14, 6, 5};
        Integer[] array_c = {50, 89, 5, 14, 5};

        HashSet<Integer> array_compare = compareArrays(array_a, array_b, array_c);

        List<Integer> array_final = new ArrayList<>(array_compare);

        //Order list
        //Ordina lista
        array_final.sort(null);
        viewArray(array_final);
    }

    //Compare with first array, if contain number in another array
    //Compara con il primo Array, si esiste quello numero in altro array
    private static HashSet<Integer> compareArrays(Integer[] array_a, Integer[] array_b, Integer[] array_c) {
        HashSet<Integer> array_final = new HashSet();
        List listArray_a = new ArrayList<>(Arrays.asList(array_a));
        List listArray_b = new ArrayList<>(Arrays.asList(array_b));
        List listArray_c = new ArrayList<>(Arrays.asList(array_c));

        for (int i = 0; i < listArray_a.size(); i++) {
            int a = array_a[i];
            if (listArray_b.contains(a) && listArray_c.contains(a)) {
                array_final.add(a);
            }
        }
        return array_final;
    }

    //Metodo per visualizzazione dei array
    //Method for Array visualization
    private static void viewArray(List arrayView) {
        for (int i = 0; i < arrayView.size(); i++) {
            if (i == arrayView.size() - 1) {
                System.out.println(arrayView.get(i));
            } else {
                System.out.print(arrayView.get(i) + ", ");
            }
        }
    }
}