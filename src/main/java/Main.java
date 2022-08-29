import org.apache.commons.csv.CSVRecord;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CSVPrinter csvPrint = new CSVPrinter("src/main/sample.csv");
        for (CSVRecord record : csvPrint.read()){
            System.out.println((record.get(0)));
        }

    }
}
