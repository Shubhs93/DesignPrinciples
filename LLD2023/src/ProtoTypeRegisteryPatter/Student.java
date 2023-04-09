package ProtoTypeRegisteryPatter;

public class Student {
    private int id;
    private String name;
    private String BathName;
    private int avgPsp;
    private int YOE;

    public Student(){

    }
    public Student(Student student){
        this.BathName=student.BathName;
        this.avgPsp=student.avgPsp;
        this.YOE=student.YOE;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", BathName='" + BathName + '\'' +
                ", avgPsp=" + avgPsp +
                ", YOE=" + YOE +
                '}';
    }

    public Student clone(){
        return new Student(this);

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBathName() {
        return BathName;
    }

    public int getAvgPsp() {
        return avgPsp;
    }

    public int getYOE() {
        return YOE;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBathName(String bathName) {
        BathName = bathName;
    }

    public void setAvgPsp(int avgPsp) {
        this.avgPsp = avgPsp;
    }

    public void setYOE(int YOE) {
        this.YOE = YOE;
    }
}
