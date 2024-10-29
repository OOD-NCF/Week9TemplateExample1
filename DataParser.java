// Abstract class defining the template method
abstract class DataParser {

    // Template method
    public final void parseData() {
        readData();
        processData();
        writeData();
    }

    // Steps to be implemented by subclasses
    abstract void readData();
    abstract void processData();

    // Common step for all subclasses (optional override in subclasses)
    void writeData() {
        System.out.println("Writing processed data to output...");
    }
}