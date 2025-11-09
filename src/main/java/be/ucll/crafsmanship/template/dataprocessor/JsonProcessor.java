package be.ucll.crafsmanship.template.dataprocessor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class JsonProcessor extends DataProcessor {
    private List<String> data;

    public JsonProcessor() {
        this.data = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("Loading data from JSON file...");
        this.data.add("{\"name\":\"John\",\"age\":25,\"city\":\"New York\"}");
        this.data.add("{\"name\":\"Jane\",\"age\":30,\"city\":\"London\"}");
        this.data.add("{\"name\":\"Bob\",\"age\":35,\"city\":\"Paris\"}");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming JSON data (adding timestamp to each record)...");
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        List<String> transformedData = new ArrayList<>();

        for (String record : data) {
            // Add timestamp to each JSON record
            String transformedRecord = record.replace("}", ",\"processedAt\":\"" + timestamp + "\"}");
            transformedData.add(transformedRecord);
        }

        data = transformedData;
        System.out.println("Transformed data: " + data);
    }

    @Override
    protected void save() {
        System.out.println("Saving transformed data to new JSON file...");
        System.out.println("JSON processing complete!");
    }
}
