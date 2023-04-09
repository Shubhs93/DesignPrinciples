package AdapterDesignPattern.Example2;

public class Main {
    public static void main(String[] args) {
        XmlData xmlData=new XmlData("sample xml Data");
        //DataAnalyticsTool dataAnalyticsTool=new DataAnalyticsTool("");
        DataAnalyticsTool dataAnalyticsTool=new AdapterXmlToJason(xmlData);
        Client client=new Client();
        client.ProcessData(dataAnalyticsTool);
    }
}
