public class MyException {

    public static void main(String args[]){
        try{
            throw new ArrayIndexOutOfBoundsException("Index is out boundary");
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
