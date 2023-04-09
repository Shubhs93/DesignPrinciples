package ProtoTypeRegisteryPatter;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        HashMap<String,Student> hm=new HashMap<>();
        Student aprBatch=new Student();
        aprBatch.setBathName("APR-2022");
        aprBatch.setYOE(2022);
        aprBatch.setAvgPsp(90);

        hm.put("APR-BATCH",aprBatch);

        Student aprBathStudent1=hm.get("APR-BATCH").clone();
        Student aprBathStudent2=hm.get("APR-BATCH").clone();
        //Student aprBathStudent3=aprBatch.clone();

        aprBathStudent1.setId(1);
        aprBathStudent1.setName("A");

        aprBathStudent2.setId(2);
        aprBathStudent2.setName("B");

        /*aprBathStudent1.setId(3);
        aprBathStudent1.setName("C");*/
        System.out.println(aprBathStudent1);
        System.out.println(aprBathStudent2);
    }
}
