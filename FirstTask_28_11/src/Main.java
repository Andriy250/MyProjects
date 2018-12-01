import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        StringBuilder temp = new StringBuilder(s);
        if(s.length() % 2 == 0) {
            int position1 = s.length() / 2;

            int position2 = s.length() / 2 - 1;
            for (int i = 0; i < s.length(); ++i) {
                temp.setCharAt(i, ' ');
            }
            System.out.println(temp);
            for (int i = 0; i < s.length() / 2; ++i) {
                temp.setCharAt(position1 + i, s.charAt(position1 + i));
                temp.setCharAt(position2 - i, s.charAt(position2 - i));
                System.out.println(temp);
            }
            for (int i = s.length() / 2 - 1; i >= 0  ; --i){
                temp.setCharAt(position1 + i, ' ');
                temp.setCharAt(position2 - i, ' ');
                System.out.println(temp);
            }
        } else{
            int position = s.length() / 2 ;
            for (int i = 0; i < s.length(); ++i){
                temp.setCharAt(i, ' ');
            }
            System.out.println(temp);
            for (int i = 0; i< s.length() / 2 + 1 ; ++i){
                temp.setCharAt(position + i, s.charAt(position + i));
                temp.setCharAt(position - i, s.charAt(position - i));
                System.out.println(temp);
            }
            for (int i = s.length() / 2 ; i>= 0  ; --i){
                temp.setCharAt(position + i, ' ');
                temp.setCharAt(position - i, ' ');
                System.out.println(temp);
            }
        }
    }
}
