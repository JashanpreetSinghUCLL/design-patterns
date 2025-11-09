package be.ucll.crafsmanship.template.dataprocessor;

import java.util.ArrayList;
import java.util.List;

public class CSVProcessor extends DataProcessor {
    private List<String> data;

    public CSVProcessor() {
        this.data = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("Loading data from CSV file...");
        this.data.add("name,age,city");
        this.data.add("John,25,New York");
        this.data.add("Jane,30,London");
        this.data.add("Bob,35,Paris");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming CSV data (making all values uppercase)...");
        data.replaceAll(String::toUpperCase);
        System.out.println("Transformed data: " + data);
    }

    @Override
    protected void save() {
        System.out.println("Saving transformed data to new CSV file...");
        System.out.println("CSV processing complete!");
    }
}
