import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    @DisplayName("Empty list should be sorted")
    public void case01() {
        List<Integer> inputArr = new ArrayList<>();
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[1] => [1]")
    public void case02() {
        List<Integer> inputArr = Arrays.asList(1);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[1,2] => [1,2]")
    public void case03(){
        List<Integer> inputArr = Arrays.asList(1,2);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1,2);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[2,1] => [1,2]")
    public void case04(){
        List<Integer> inputArr = Arrays.asList(2,1);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1,2);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[1,2,3] => [1,2,3]")
    public void case05(){
        List<Integer> inputArr = Arrays.asList(1,2,3);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1,2,3);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[2,1,3] => [1,2,3]")
    public void case06(){
        List<Integer> inputArr = Arrays.asList(2,1,3);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1,2,3);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[3,2,1] => [1,2,3]")
    public void case07(){
        List<Integer> inputArr = Arrays.asList(3,2,1);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1,2,3);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("[5,4,3,2,1] => [1,2,3,4,5]")
    public void case08(){
        List<Integer> inputArr = Arrays.asList(5,4,3,2,1);
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = Arrays.asList(1,2,3,4,5);
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

}