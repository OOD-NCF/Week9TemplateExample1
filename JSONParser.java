// JSONParser subclass that implements the specific steps for JSON
class JSONParser extends DataParser {
    @Override
    void readData() {
        System.out.println("Reading data from JSON file");
    }

    @Override
    void processData() {
        System.out.println("Processing data from JSON file");
    }
}