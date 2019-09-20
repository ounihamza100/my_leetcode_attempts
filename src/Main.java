import solutions.ReverseInteger;

/**
 * @author Hamza Ouni
 */
public class Main {

    public static void main(String[] args) {

        //reverse integer
        ReverseInteger reverseInteger =  new ReverseInteger();
        System.out.println(reverseInteger.reverseInteger(0));
        System.out.println(reverseInteger.reverseInteger(2));
        System.out.println(reverseInteger.reverseInteger(-2));
        System.out.println(reverseInteger.reverseInteger(214748));
        System.out.println(reverseInteger.reverseInteger(-214748));


    }
}
