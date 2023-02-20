package Builder;

public class client {


    public static void main(String[] args) {
        Student s= Student.builder()
                .setAge(23)
                .setName("Shubham")
                .build();
        System.out.println(s.getName());
    }
}
