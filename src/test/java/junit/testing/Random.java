package junit.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Random {

    @Test
    @DisplayName("When second number is greater")
    public void compare() {
        Basics basics = new Basics();
        Assertions.assertEquals("Second number is greater", basics.compare2(5, 10));
    }
}
