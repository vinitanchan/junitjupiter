
import io.javabrains.MathUtils;
import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    public void beforeAllExample() {
        System.out.println("before all example");
    }

    @AfterAll
    public void afterAllExample() {
        System.out.println("after all example");
    }

    @BeforeEach
    public void init() {
        System.out.println("Before Each");
        mathUtils = new MathUtils();
    }

    @AfterEach
    public void endOfMethod() {
        System.out.println("method call end");
    }

    @Nested
    @DisplayName("Add numbers")
    public class AddNumbersTest {

        @Test
        @DisplayName("when numbers are positive !!!!!")
        @Tag("Math")
        public void addPositiveNumbersTest() {
            int i = mathUtils.add(2, 2);
            int expected = 4;
            Assertions.assertEquals(expected, i, () -> "Add positive " + expected + " test failed.");
        }

        @Test
        @DisplayName("when numbers are negative !!!!!")
        @Tag("Math")
        public void addNegativeNumbersTest() {
            int i = mathUtils.add(-1, -2);
            Assertions.assertEquals(-3, i, "Add negative test failed.");
        }
    }

    @Test
    @Disabled
    public void isNameVinitTest() {
        Assertions.assertFalse(mathUtils.isNameVinit(), "isNameVinit test failed.");
    }


    @Test
    public void addValue() {
        Assertions.assertAll(() -> System.out.println("add value 1"),
                () -> System.out.println("add value 1"),
                () -> System.out.println("add value 1"),
                () -> System.out.println("add value 1"));
    }

    @Test
    public void getList() {
        boolean isServerUp = true;
        Assumptions.assumeTrue(isServerUp);
        Assertions.assertIterableEquals(Arrays.asList("hello", "how", "is", "romania"), mathUtils.getList(), "doesn't work");
    }

    @RepeatedTest(3)
    public void computeCircleAreaTest(RepetitionInfo repetitionInfo) {
        if (repetitionInfo.getCurrentRepetition() == 2) {
            System.out.println(" ========== 2nd Repetition");
        }
        Assertions.assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "should return right circle area.");
    }

    @Test
    @Tag("Math")
    public void divideTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide should throw arithmetic exception");
    }

}