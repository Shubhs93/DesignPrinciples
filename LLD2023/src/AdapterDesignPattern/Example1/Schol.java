package AdapterDesignPattern.Example1;

public class Schol {
    public static void main(String[] args) {
        Pen pa=new PenAdapter();

        AssignMent assignMent= new AssignMent();
        assignMent.setPen(pa);
        assignMent.writeAssignMent("Hey ! write something yr");
    }


}
