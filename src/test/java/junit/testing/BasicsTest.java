package junit.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicsTest {

    Basics basics = new Basics();

    @Test
    @DisplayName("First number is greater than second")
    public void compare() {
        Basics basicsTests = new Basics();
        int value = basicsTests.compare(2, 1);
        Assertions.assertEquals(1, value);
    }

    @Test
    @DisplayName("First number is less than the second")
    public void compare2() {
        Basics basicsTests = new Basics();
        int value = basicsTests.compare(2, 3);
        Assertions.assertEquals(-1, value);
    }

    @Test
    @DisplayName("First number is equal to the second")
    public void compare3() {
        Basics basicsTests = new Basics();
        int value = basicsTests.compare(2, 2);
        Assertions.assertEquals(0, value);
    }

    @Test
    @DisplayName("When Both number are equal")
    public void compare4() {
        Basics basics = new Basics();
        Assertions.assertEquals("Both are equal", basics.compare2(5, 5));
    }

    @Test
    @DisplayName("When First Number is greater than second")
    public void compare5() {
        String str = basics.compare2(10, 5);
        Assertions.assertEquals("First number is greater", str);
    }


}
