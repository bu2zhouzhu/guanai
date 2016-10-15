public class Main {

    public static void main(String[] args) {
        int[] a = {2, 1, 4, 3, 5};

        System.out.println(select(a, a.length / 2));
        selectionSort(a);
        printArray(a);
    }

    public static int select(int[] array, int k) {
        for (int i = 0; i <= k; i++) {
            int minIndex = i;
            int minValue = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minIndex = j;
                    minValue = array[j];
                }
            }
            swap(array, i, minIndex);
        }
        return array[k];
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private static void printArray(int[] array) {
        for (int e : array) {
            System.out.println(e);
        }
    }

}