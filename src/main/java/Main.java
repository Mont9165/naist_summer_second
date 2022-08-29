import org.apache.commons.csv.CSVRecord;

import java.io.IOException;

public class Main {
    private String platform;
    private String browser;

    public static void main(String[] args) throws IOException {

        CSVPrinter csvPrint = new CSVPrinter("src/main/sample.csv");
        for (CSVRecord record : csvPrint.read()){
            System.out.println((record.get(0)));
        }

    }
    void renderBanner() {
        int resize = 0;
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0 )
        {
            // do something
        }
    }

    private boolean wasInitialized() {
        boolean b = false;
        return b;
    }
}
