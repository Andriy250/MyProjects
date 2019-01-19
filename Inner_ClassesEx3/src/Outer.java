public class Outer {
    private String field;

    public Outer(String field) {
        this.field = field;
    }

    public class Inner{
        @Override
        public String toString() {
            return field;
        }
    }

    private Inner method(){return new Inner();}

    static public void main(String... args){
        Outer out = new Outer("Some String");

        Inner in = out.method();

        System.out.println(in.toString());
    }
}
