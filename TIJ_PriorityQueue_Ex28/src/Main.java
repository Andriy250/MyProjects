import java.util.PriorityQueue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        PriorityQueue<Double> pq = new PriorityQueue<>();
        Random rnd = new Random();
        Double rangeMax = new Double(100);
        Double rangeMin = new Double(0);
        Double randomValue;
        for (int i = 0; i < 10; ++i){
            randomValue = rangeMax - (rangeMax - rangeMin) * rnd.nextDouble();
            pq.offer(randomValue);
        }

        System.out.println(pq);

        PriorityQueue<MyClass> pqEx29 = new PriorityQueue<>();
        for (int i = 0 ; i < 3; ++i) {  // in this loop will create exception after one circle, because it will add first element, but couldn't
            try{ // compare it with the second one
                pqEx29.offer(new MyClass());
            } catch (Exception ex){
                System.out.println("Doesn't work without Comparator");
            }
        }
    }
}
