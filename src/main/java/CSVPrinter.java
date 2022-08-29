import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

public class CSVPrinter {
    Reader reader;
    public CSVPrinter(String fileName) throws FileNotFoundException {
        reader = new FileReader(fileName);
    }
    public Iterable<CSVRecord> read() throws IOException {
        Iterable<CSVRecord> record = CSVFormat.DEFAULT.parse(this.reader);
        return record;
    }

}
