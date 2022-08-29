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
        boolean flag = testcheck(LenSize, ansSize);

    }
    @BeforeAll
    public static void testCSVFileExist() throws FileNotFoundException {
        CSVPrinter printer = new CSVPrinter("src/main/sample.csv");
    }
    public boolean testcheck(List LenSize, List ansSize) throws IOException {
        boolean flag = false;
        for(int i = 0; i < 3; i++){
             Assertions.assertEquals(LenSize.get(i), ansSize.get(i));
        }
        return true;
    }
}
