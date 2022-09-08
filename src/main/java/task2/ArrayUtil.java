package task2;

import java.util.Arrays;

public class ArrayUtil {
    public Pair sumOfValue(Integer[] arr, int sumOfPair) {
        for (int i = 0 ; i < arr.length - 1; i++) {
            final int first = arr[i];
            Integer[] subArr = Arrays.copyOfRange(arr, i + 1, arr.length);
            Pair correctPair = Arrays.stream(subArr)
                    .map(value -> new Pair(first, value))
                    .filter(pair -> sumOfPair == pair.sum())
                    .findFirst()
                    .orElse(null);
            if(correctPair != null){
                return correctPair;
            }
        }
        return null;
    }

}

