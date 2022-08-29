import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class annotationCSVPrinterTest {
    @AfterAll
    public static void testReadFile() throws IOException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        Iterable<CSVRecord> it = printer.read();
        int size = 0;
        for(CSVRecord r: it){
            size++;
        }
        Assertions.assertEquals(3, size);
    }
    @AfterEach
    public void testCSVFormat() throws IOException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
        Iterable<CSVRecord> it = printer.read();
        List<Integer> ansSize = new ArrayList<>(Arrays.asList(3, 5, 1));
        List<Integer> LenSize = new ArrayList<Integer>();
        for(CSVRecord r: it){
            LenSize.add(r.size());
        }
        testcheck(LenSize, ansSize);

    }
    @BeforeAll
    public static void testCSVFileExist() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
    }
    public void testcheck(List LenSize, List Ans) throws IOException {
        Assertions.assertEquals(LenSize.get(0), Ans.get(0));
        Assertions.assertEquals(LenSize.get(1), Ans.get(1));
        Assertions.assertEquals(LenSize.get(2), Ans.get(2));
    }
}
