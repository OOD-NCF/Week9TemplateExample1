// CSVParser subclass that implements the specific steps for CSV
class CSVParser extends DataParser {
    @Override
    void readData() {
        System.out.println("Reading data from CSV file");
    }

    @Override
    void processData() {
        System.out.println("Processing data from CSV file");
    }
}
