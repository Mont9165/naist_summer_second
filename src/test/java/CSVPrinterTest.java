import com.beust.ah.A;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.*;
import org.testng.asserts.Assertion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVPrinterTest {
    static ArrayList<CSVRecord> it;
    @BeforeAll
    public static void testCSVFileExist() throws IOException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        it = new ArrayList<>();
        for(CSVRecord r: printer.read()) {
            it.add(r);
        }
        System.out.println("FileCheck");
    }

    @AfterAll
    public static void testReadFile() throws IOException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        int size = 0;
        for(CSVRecord r: it){
            size++;
        }
        Assertions.assertEquals(3, size);
        System.out.println("reafline");
    }
    @Test
    public void testCSVFormat() throws IOException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");

        List<Integer> LenSize = new ArrayList<Integer>();
        for(CSVRecord r: it){
            LenSize.add(r.size());
        }
        Assertions.assertEquals(LenSize.get(0), 3);
        Assertions.assertEquals(LenSize.get(1), 5);
        Assertions.assertEquals(LenSize.get(2), 1);
        System.out.println("csvformat");
    }

}
