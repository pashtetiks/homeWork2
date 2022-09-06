package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayUtil {
    public void sumOfValue(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == value) {
                    System.out.println("[" + arr[i] + ", " + arr[j] + "]");
                    return;
                }
            }
        }
        System.out.println("Подходящих пар нет");
    }

    public void sumOfValueWithStream(Integer[] arr, int value){
        List<Integer> newArr = Arrays.stream(arr)
                .filter(p -> Arrays.stream(arr)
                        .anyMatch(v -> v == value - p ))
                .limit(1)
                .collect(Collectors.toList());
        newArr.add(value - newArr.get(0));
        System.out.println(newArr);
    }
}
