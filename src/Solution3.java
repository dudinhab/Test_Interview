import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public static void main(String[] args) {
        int[] arrayNumber = {14, 5, 23, 89, 4, 50};
        List arrayNewOrder = orderNumber(arrayNumber);

        System.out.println("First array:");
        viewArray(arrayNumber);
        System.out.println("Ordered array:");
        System.out.println(arrayNewOrder);
    }

    //Metodo per ordinare di forma mesclata il primo e l'ultimo numero dell'array
    //Method for order first and last number from array
    public static List orderNumber(int[] arrayNumber) {
        List arrayNewOrder = new ArrayList<>();
        int last = arrayNumber.length - 1;
        int first = 0;
        while (last > first) {
            arrayNewOrder.add(arrayNumber[first]);
            arrayNewOrder.add(arrayNumber[last]);
            first++;
            last--;
        }
        return arrayNewOrder;
    }

    //Metodo per visualizzazione dei array
    //Method for Array visualization
    private static void viewArray(int[] arrayView) {
        for (int i = 0; i < arrayView.length; i++) {
            if (i == arrayView.length - 1) {
                System.out.println(arrayView[i]);
            } else {
                System.out.print(arrayView[i] + ", ");
            }
        }
    }
}
