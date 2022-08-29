import org.junit.jupiter.api.*;

import java.io.FileNotFoundException;

public class Annotation {
    @Test
    public void One() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(1);
    }
    @BeforeAll
    public static void Two() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(2);
    }
    @AfterAll
    public static void Three() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(3);
    }
    @BeforeEach
    public void Four() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(4);
    }
    @AfterEach
    public void Five() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(5);
    }
    @Test
    public void testSix() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(6);
    }
    @Test
    public void testSeven() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        System.out.println(7);
    }
}
