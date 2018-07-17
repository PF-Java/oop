package ClassStopWatch;

import java.util.Random;

public class AlgorithmsSort {
    public static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int current = list[i];
            int j;
            for (j = i - 1; j > 0 && list[j] > current; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = current;
        }
    }
}
