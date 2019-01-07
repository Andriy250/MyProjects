public class MyException extends Exception{

    public MyException(String msg){super(msg);}

    public static void main(String[] args){
        try{
            throw new MyException("the exception occurred");
        } catch (MyException e){
            e.printStackTrace();
        }
    }
}
