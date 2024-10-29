// XMLParser subclass that implements the specific steps for XML
class XMLParser extends DataParser {
    @Override
    void readData() {
        System.out.println("Reading data from XML file");
    }

    @Override
    void processData() {
        System.out.println("Processing data from XML file");
    }
}