import org.junit.jupiter.api.*;

import java.io.FileNotFoundException;

public class Annotation {
    @Test
    public void testOne() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(1);
    }
    @BeforeAll
    public static void testTwo() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(2);
    }
    @AfterAll
    public static void testThree() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(3);
    }
    @BeforeEach
    public void testFour() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(4);
    }
    @AfterEach
    public void testFive() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(5);
    }
    @Test
    public void testSix() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(6);
    }
}
