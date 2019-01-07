public class MyException {

    public static void main(String[] args){
        Object nullObject = null;

        try{
            System.out.println(nullObject.toString());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
