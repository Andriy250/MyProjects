public class Main {

    public static void main(String[] args){
        try{
            throw new MyException();
        } catch (MyException e){
            System.err.println("Caught " + e);
        }


        try{
            throw new MyException();
        } catch (MyException e){
            System.err.println("Caught " + e);
        }
    }
}
