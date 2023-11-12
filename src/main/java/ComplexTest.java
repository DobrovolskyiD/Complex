public class ComplexTest {
    public static void main(String[] args) {
        // Test cases for add, sub, mul, div
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();

        // Additional test case for i^2 = -1
        testImaginarySquare();
    }

    private static void testAddition() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(1, 4);
        Complex result = a.add(b);
        checkResult("Addition", result, new Complex(3, 7));
    }

    private static void testSubtraction() {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 1);
        Complex result = a.sub(b);
        checkResult("Subtraction", result, new Complex(3, 2));
    }

    private static void testMultiplication() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(4, 5);
        Complex result = a.mul(b);
        checkResult("Multiplication", result, new Complex(-7, 22));
    }

    private static void testDivision() {
        Complex a = new Complex(6, 3);
        Complex b = new Complex(2, 1);
        Complex result = a.div(b);
        checkResult("Division", result, new Complex(3, 0));
    }

    private static void testImaginarySquare() {
        Complex i = new Complex(0, 1);
        Complex result = i.mul(i);
        checkResult("Imaginary Square", result, new Complex(-1, 0));
    }

    private static void checkResult(String operation, Complex result, Complex expected) {
        if (result.equals(expected)) {
            System.out.println(operation + " - Ok");
        } else {
            System.out.println(operation + " - FAILED: expected " + expected + ", got " + result);
        }
    }
}
