import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("เมื่อทำการสร้าง employee ด้วย default contructor จะต้องได้ค่าว่าง")
    public void testCase01(){
        String expectedResult = " : ";
        Employee employee = new Employee();
        String actualResult = employee.getFullName();
        // Assert of check
        assertEquals(expectedResult,actualResult);
    }

    @Test
    @DisplayName("เมื่อทำการสร้าง employee ด้วย Weerayooth Manawanich จะต้องได้ Weerayoth : Manawanich ")
    public void testCase02(){
        String expectedResult = "Weerayooth : Manawanich";
        Employee employee = new Employee("Weerayooth","Manawanich");
        String actualResult = employee.getFullName();
        // Assert of check
        assertEquals(expectedResult,actualResult);
    }
}