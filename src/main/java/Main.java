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
        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if (isMacOs && isIE && wasInitialized() && wasResized) {
            // do something
        }
    }

    private boolean wasInitialized() {
        boolean b = false;
        return b;
    }
}
