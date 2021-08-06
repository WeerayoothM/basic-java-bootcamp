import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    public void emptyArray() {
        List<Integer> inputArr = new ArrayList<>();
        MySort mySort = new MySort(inputArr);
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = mySort.Sorted();
        assertEquals(expected, actual);
    }

}