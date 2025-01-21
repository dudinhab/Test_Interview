package orderNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        List arrayNumber = new ArrayList<>(Arrays.asList(14, 5, 23, 89, 4, 50));
        List arrayNewOrder = orderNumber(arrayNumber);

        System.out.println("First array:");
        viewArray(arrayNumber);
        System.out.println("Ordered array:");
        viewArray(arrayNewOrder);
    }

    //Metodo per ordinare di forma mesclata il primo e l'ultimo numero dell'array
    //Method for order first and last number from array
    public static List orderNumber(List arrayNumber){
        List arrayNumber1 = new ArrayList<>();
        List arrayNewOrder = new ArrayList<>();

        arrayNumber1.addAll(arrayNumber);
        while (!arrayNumber1.isEmpty()){
            arrayNewOrder.add(arrayNumber1.getFirst());
            arrayNumber1.removeFirst();
            if (!arrayNumber1.isEmpty()) {
                arrayNewOrder.add(arrayNumber1.getLast());
                arrayNumber1.removeLast();
            }
        }
        return arrayNewOrder;
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
