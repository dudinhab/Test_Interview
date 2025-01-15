import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
    public static void main(String[] args) {
        List arrayNumber = new ArrayList<>(Arrays.asList(14, 5, 23, 89, 4, 50));
        List arrayNewOrder = orderNumber(arrayNumber);


        System.out.println("First array:");
        System.out.println(arrayNumber);
        System.out.println();
        System.out.println("Ordered array:");
        System.out.println(arrayNewOrder);
    }

    //Metodo per ordinare di forma mesclata il primo e l'ultimo numero dell'array
    //Method for order first and last number from array
    public static List orderNumber(List arrayNumber) {
        List arrayNewOrder = new ArrayList<>();
        int last = arrayNumber.size() - 1;
        int size = arrayNumber.size()/2;
        for (int i = 0; i < size; i++) {
            arrayNewOrder.add(arrayNumber.get(i));
            arrayNewOrder.add(arrayNumber.get(last - i));
        }
        return arrayNewOrder;
    }
}
