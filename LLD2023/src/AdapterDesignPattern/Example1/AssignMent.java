package AdapterDesignPattern.Example1;

public class AssignMent {
    private Pen pen;

    public AssignMent() {

    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
    public void writeAssignMent(String str){
        pen.write(str);
    }
}
