package Builder;

public class Student {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private Student(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
    }
    public static Builder builder(){
        Builder b=new Builder();
        return b;
    }


    public static class Builder {
        private int age;
        private String name;

        public Builder() {
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public  Student build(){
            //logic for validations
            Student s=new Student(this);
            return  s;
        }
    }
}
