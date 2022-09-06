package task2;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 2, 7};
        Integer[] arr1 = new Integer[]{3, 4, 5, 2, 7, 5};

        ArrayUtil arrayUtil = new ArrayUtil();

        arrayUtil.sumOfValue(arr, 10);
        arrayUtil.sumOfValueWithStream(arr1, 10);
    }
}
