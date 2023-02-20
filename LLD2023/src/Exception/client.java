package Exception;

public class client {
    public static void main(String[] args) {
        int age=17;
        try{
            if(age<18){
                throw new CustomException("age 18 se badi honi hai bahi mere");
            }
        }catch (Exception e){
            System.out.println("error hai");
            System.out.println("kya error hai"+ e);
        }
    }
}
