package AdapterDesignPattern.Example2;

public class DataAnalyticsTool {
    private String jsonData;

    public DataAnalyticsTool() {
    }

    public DataAnalyticsTool(String jsonData) {
        this.jsonData = jsonData;
    }

    public String getJsonData() {
        return jsonData;
    }

    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    public void AnalyseData(){
        System.out.println("Analysing json Data");
    }
}
