package task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayUtil {
    public void sumOfValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    System.out.println("[" + arr[i] + ", " + arr[j] + "]");
                    return;
                }
            }
        }
        System.out.println("Подходящих пар нет");
    }

    public void sumOfValueWithStream(int[] arr, int value) {

        Integer[] arr1 = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (Integer) arr[i];
        }
        List<Integer> newArr = Arrays.stream(arr1)
                .filter(p -> Arrays.stream(arr1)
                        .anyMatch(v -> v == value - p))
                .limit(2)
                .collect(Collectors.toList());
        if (newArr.size() < 1){
            System.out.println("Подходящих пар нет");
        }else if(newArr.get(0) * 2 == value){
            int count = 0;
            for (int i: arr){
                if (i == newArr.get(0)){
                    count++;
                }
            }
            if (count == 2){
                newArr.remove(1);
            }else {
                newArr.remove(0);
            }
            newArr.add(value -newArr.get(0));
            System.out.println(newArr);
        }else {
            newArr.remove(1);
            newArr.add(value -newArr.get(0));
            System.out.println(newArr);
        }
    }
}
