// Main class to test the Template Method pattern
public class TemplateMethodExample {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        DataParser jsonParser = new JSONParser();
        DataParser xmlParser = new XMLParser();

        System.out.println("CSV Parsing:");
        csvParser.parseData();

        System.out.println("\nJSON Parsing:");
        jsonParser.parseData();

        System.out.println("\nXML Parsing:");
        xmlParser.parseData();
    }
}