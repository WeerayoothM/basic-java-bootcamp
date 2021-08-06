import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    public void case01() {
        List<Integer> inputArr = new ArrayList<>();
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    public void case02() {
        List<Integer> inputArr = Arrays.asList(1);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    public void case03(){
        List<Integer> inputArr = Arrays.asList(1,2);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1,2);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    public void case04(){
        List<Integer> inputArr = Arrays.asList(2,1);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1,2);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

}