package task2;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 3, 4, 2, 7};


        ArrayUtil arrayUtil = new ArrayUtil();

        arrayUtil.sumOfValue(arr, 10);
        arrayUtil.sumOfValueWithStream(arr, 10);
    }
}
