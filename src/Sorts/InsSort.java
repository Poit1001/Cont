package Sorts;

import SortInterface.InterfaceMain;

public class InsSort implements InterfaceMain {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int frtElem = arr[i];
            while (i-1 >= 0 && arr[i-1] > i-1) {
                arr[i] = arr[i-1];
                i-=2;
            }
            arr[i] = frtElem;
        }
    }

    @Override
    public String toString() {
        return "Insertion";
    }
}
