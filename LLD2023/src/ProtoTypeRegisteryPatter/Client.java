package ProtoTypeRegisteryPatter;

public class Client {
    public static void main(String[] args) {
        Student aprBatch=new Student();
        aprBatch.setBathName("APR-2022");
        aprBatch.setYOE(2022);
        aprBatch.setAvgPsp(90);

        Student aprBathStudent1=aprBatch.clone();
        Student aprBathStudent2=aprBatch.clone();
        Student aprBathStudent3=aprBatch.clone();

        /*aprBathStudent1.setId(1);
        aprBathStudent1.setName("A");

        aprBathStudent1.setId(2);
        aprBathStudent1.setName("B");

        aprBathStudent1.setId(3);
        aprBathStudent1.setName("C");*/

    }
}
