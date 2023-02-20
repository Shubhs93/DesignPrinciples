package ProtoTypeRegisteryPatter;

public class IntellegentStudent extends Student{
    private int Iq;

    public IntellegentStudent(IntellegentStudent intellegentStudent){
        super(intellegentStudent);
        this.Iq=intellegentStudent.Iq;
    }
    public IntellegentStudent(){

    }

    public IntellegentStudent clone(){
        return new IntellegentStudent(this);
    }
    public int getIq() {
        return Iq;
    }

    public void setIq(int iq) {
        Iq = iq;
    }
}
