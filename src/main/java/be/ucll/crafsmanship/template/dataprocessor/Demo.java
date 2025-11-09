package be.ucll.crafsmanship.template.dataprocessor;

public class Demo {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVProcessor();
        DataProcessor jsonProcessor = new JsonProcessor();

        System.out.println("=== Processing CSV Data ===");
        csvProcessor.process();

        System.out.println("\n=== Processing JSON Data ===");
        jsonProcessor.process();
    }
}
