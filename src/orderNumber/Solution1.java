package orderNumber;

public class Solution1 {
    public static void main(String[] args) {
        int[] arrayNumber = {14, 5, 23, 89, 4, 50};
        int[] arrayNewOrder = orderNumber(arrayNumber);

        System.out.println("First array:");
        viewArray(arrayNumber);
        System.out.println("Ordered array:");
        viewArray(arrayNewOrder);
    }

    //Metodo per ordinare di forma mesclata il primo e l'ultimo numero dell'array
    //Method for order first and last number from array
    public static int[] orderNumber(int[] arrayNumber) {
        int[] arrayNewOrder = new int[arrayNumber.length];
        int last = arrayNumber.length - 1;
        int first = 0;

        for (int i = 0; i < arrayNumber.length; i++) {
            if (i % 2 == 0) {
                arrayNewOrder[i] = arrayNumber[first];
                first++;
            } else {
                arrayNewOrder[i] = arrayNumber[last];
                last--;
            }
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
