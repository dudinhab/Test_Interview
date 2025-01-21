package orderNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
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
    public static List orderNumber(List arrayNumber) {
        List arrayNewOrder = new ArrayList<>();
        int last = arrayNumber.size() - 1;
        int size = arrayNumber.size()/2;
        boolean isEven = arrayNumber.size()%2==0;

        for (int i = 0; i < size; i++) {
            arrayNewOrder.add(arrayNumber.get(i));
            arrayNewOrder.add(arrayNumber.get(last - i));
        }
        if (!isEven){
            arrayNewOrder.add(arrayNumber.get(size));
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
