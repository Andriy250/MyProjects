public class MyException {
    public static void main(String[] args){
        int i = -5;
        while(i < 0){
            try{
                throw new Exception("less than zero");
            } catch (Exception e){
                i++;
            }
        }
        System.out.println("fixed integer i equals " + i);
    }
}
