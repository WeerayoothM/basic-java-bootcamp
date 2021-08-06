import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRangeTest {
    @Test
    public void startWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean isInclude = myRange.checkStartWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void startWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        boolean isInclude = myRange.checkStartWithInclude();
        assertFalse(isInclude);
    }

    @Test
    public void getFirstNumberAndStartWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int firstNumber = myRange.getFirstNumber();
        assertEquals(1, firstNumber);
    }

    @Test
    public void getFirstNumberAndStartWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        int firstNumber = myRange.getFirstNumber();
        assertEquals(2, firstNumber);
    }

    @Test
    public void endWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean isInclude = myRange.checkEndWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void endWithExclude() {
        MyRange myRange = new MyRange("(1,5)");
        boolean isInclude = myRange.checkEndWithInclude();
        assertFalse(isInclude);
    }

    @Test
    public void getEndNumberAndEndWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int endNumber = myRange.getEndNumber();
        assertEquals(5, endNumber);
    }

    @Test
    public void getEndNumberAndEndWithExclude() {
        MyRange myRange = new MyRange("(1,5)");
        int endNumber = myRange.getEndNumber();
        assertEquals(4, endNumber);
    }

}