public class CircularShiftArray {

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int time = 20;
        circularShiftArray(a, time);
        printArray(a);
    }

    public static <T> void circularShiftArray(T[] array, int time) {
        for (int i = 0; i < time % array.length; i++) {
            T b = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = b;
        }
    }

    private static <T> void printArray(T[] array) {
        for (T e : array) {
            System.out.println(e);
        }
    }
}
