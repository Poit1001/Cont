package Sorts;

import SortInterface.InterfaceMain;


public class QuickSort implements InterfaceMain {

    public void sort(int[] arr, int low, int high) {
        if (arr.length == 0) return;
        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;

        int temp;

        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) sort(arr, low, j);
        if (high > i) sort(arr, i, high);
    }

    public void sort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    @Override
    public String toString() {
        return "Quick";
    }
}
