import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySort {
    private List<Integer> input;

    public MySort(List<Integer> inputArr) {
        this.input = inputArr;
    }

    public List<Integer> Sorted() {
        if (input.size() == 0 || input.size() == 1) {
            return input;
        }

        boolean isSorted = true;
        for (int i = 0; i < input.size() - 1; i++) {
            if ( input.get(i) > input.get(i+1) ){
                isSorted = false;
                break;
            }
        }
        if (isSorted) return input;

        List<Integer> sortedArr = new ArrayList<>();
        List<Integer> dupInput = new ArrayList<>(input);
        for (Integer integer : input) {
            int maxInt = findMax(dupInput);
            sortedArr.add(0,maxInt);
            int index = dupInput.indexOf(maxInt);
            dupInput.remove(index);
        }

        return sortedArr;

    }

    private int findMax(List<Integer> inputArr) {
        int max = inputArr.get(0);
        for (Integer integer : inputArr) {
            if (integer > max) {
                max = integer;
            }
        }
        return max;
    }
}


// Input
//  * List of Integer = List<Integer>
// Output
//  * List of sorted number
// Input         Expected
// [5,4,3,2,1]   [1,2,3,4,5]
//
// Test cases
// []=>[]
// [1]=>[1]
// [1,2]=>[1,2]
// [2,1]=>[1,2]
// [1,2,3]=>[1,2,3]
// [2,1,3]=>[1,2,3]
// [1,3,2]=>[1,2,3]
// [3,2,1]=>[1,2,3]
// [5,4,3,2,1]=>[1,2,3,4,5]
