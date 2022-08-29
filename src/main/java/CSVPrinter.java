import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CSVPrinter {
    Reader reader;
    public CSVPrinter(String fileName) throws FileNotFoundException {
        reader = new FileReader(fileName);
    }
    public Iterable<CSVRecord> read() throws IOException {
        Iterable<CSVRecord> record = CSVFormat.DEFAULT.parse(this.reader);
        return record;
    }
    String foundPerson(String[] people){
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")){
                return "Don";
            }
            if (people[i].equals("John")){
                return "John";
            }
            if (people[i].equals("Kent")){
                return "Kent";
            }
        }
        return "";
    }


}
