package Sorts;

import SortInterface.InterfaceMain;
import SortInterface.InterfaceMain;

public class BubbleSort implements InterfaceMain {
    public void sort(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Bubble";
    }
}
