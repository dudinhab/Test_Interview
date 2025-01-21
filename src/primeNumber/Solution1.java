package primeNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {

        int inputQuantityRound = readJustInt();

        List primeNumberList = extractedPrimeNumbers(inputQuantityRound);

        if (primeNumberList.size() != 0) {
            System.out.println("This is the prime numbers list:");
            viewArray(primeNumberList);
        } else {
            System.out.println("The quantity number inserted is " + inputQuantityRound + ", so don't have a list number!");
        }
    }

    //Metodo per leggere solo numeri interi inserite dell'utente
    //Method for read just integer number
    private static int readJustInt() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input the quantity prime numbers:");
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Sorry, just Integer numbers!");
                System.out.println();
            }
        }
    }

    //Metodo per prendere una lista di numeri primi con la stessa quantità inserita dell'utente
    //Method for extracted prime numbers list with the quantity inserted
    private static List extractedPrimeNumbers(int inputQuantityRound) {
        int quantityRound = 1;
        int testNumber;
        int primeNumber = 1;
        boolean foundPrimeNumber = false;
        List primeNumberList = new ArrayList();
        while (inputQuantityRound >= quantityRound) {
            testNumber = primeNumber;

            while (!foundPrimeNumber) {
                List divisorNumbersList = new ArrayList();
                for (int i = 1; i <= testNumber; i++) {
                    if (testNumber % i == 0) {
                        divisorNumbersList.add(i);
                    }
                }

                if (divisorNumbersList.size() <= 2) {
                    foundPrimeNumber = true;
                    primeNumber = testNumber;
                } else {
                    testNumber++;
                }
            }
            foundPrimeNumber = false;
            primeNumberList.add(primeNumber);
            primeNumber++;
            quantityRound++;
        }
        return primeNumberList;
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
