public class Outer {

    public class Inner{}

    private Inner method(){return new Inner();}

    static public void main(String... args){
        Outer out = new Outer();

        Inner in = out.method();
    }
}
