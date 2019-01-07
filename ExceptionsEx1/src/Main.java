public class Main extends Exception{


    public Main(String msg){
        super(msg);
    }


    public static void main(String[] args) {
        try {

            throw new Main("Exception here");
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            System.out.println("\nI am in finally scope");
        }
    }
}
