package AdapterDesignPattern.Example2;

public class AdapterXmlToJason extends DataAnalyticsTool{
    private XmlData xmlData;

    public AdapterXmlToJason(XmlData xmlData) {
        this.xmlData = xmlData;
    }

    public void AnalyseData(){
        System.out.println("Converting XMLData to Jason Data +" + xmlData.getXmlData());
        System.out.println("Analysing json Data");
    }
}
