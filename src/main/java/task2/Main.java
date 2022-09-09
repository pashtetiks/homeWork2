package task2;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 4, 5, 7};


        ArrayUtil arrayUtil = new ArrayUtil();


        showPair(arrayUtil.sumOfValue(arr, 10));

    }
    private static void showPair(Pair foundedPair){
        if (foundedPair != null){
            System.out.println("[" + foundedPair.getFirst() + ", " + foundedPair.getSecond() + "]");
        } else{
            System.out.println("pair not found");
        }

    }
}
