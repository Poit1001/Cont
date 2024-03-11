import SortInterface.InterfaceMain;
import Sorts.BubbleSort;
import Sorts.InsSort;
import Sorts.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("10 Elements:");
        int[] array100Elems = new int[100];
        fillArr(array100Elems);
        sortTests(new BubbleSort(), Arrays.copyOf(array100Elems, array100Elems.length));
        sortTests(new InsSort(), Arrays.copyOf(array100Elems, array100Elems.length));
        sortTests(new QuickSort(), Arrays.copyOf(array100Elems, array100Elems.length));

        System.out.println("1000 Elements:");
        int[] array1000Elems = new int[1000];
        fillArr(array1000Elems);
        sortTests(new BubbleSort(), Arrays.copyOf(array1000Elems, array1000Elems.length));
        sortTests(new InsSort(), Arrays.copyOf(array1000Elems, array1000Elems.length));
        sortTests(new QuickSort(), Arrays.copyOf(array1000Elems, array1000Elems.length));

        System.out.println("10000 Elements:");
        int[] array10000Elems = new int[10000];
        fillArr(array10000Elems);
        sortTests(new BubbleSort(), Arrays.copyOf(array10000Elems, array10000Elems.length));
        sortTests(new InsSort(), Arrays.copyOf(array10000Elems, array10000Elems.length));
        sortTests(new QuickSort(), Arrays.copyOf(array10000Elems, array10000Elems.length));

    }

    public static void sortTests(InterfaceMain sortMethod, int[] arr) {
        System.out.println("Sort method: " + sortMethod);
        RunTimer(new BubbleSort(), arr);
        System.out.println();
    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandom();
        }
    }

    private static int getRandom() {
        return (int)(Math.random() * 100);
    }

    private static long RunTimer(InterfaceMain sortMethod, int[] arr) {
        long start = System.nanoTime();
        sortMethod.sort(arr);
        long finish = System.nanoTime();
        System.out.println("RunTime: " + (finish - start));
        return finish - start;
    }

    public void QuickSort(int[] arr, int low, int high) {
        if (arr.length == 0) return;
        if (low >= high) return;

        int cent = low + (high - low) / 2;
        int centValue = arr[cent];

        int i = low, j = high;

        int temp;

        while (i <= j) {
            while (arr[i] < centValue) {
                i++;
            }
            while (arr[j] > centValue) {
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

    public void sort(int[] arr, int i, int length) {
        sort(arr, 0, arr.length);
    }

}
