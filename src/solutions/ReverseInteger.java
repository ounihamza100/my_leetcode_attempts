package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hamza Ouni
 */
public class ReverseInteger {

    public int reverseInteger(int x) {

        String s = String.valueOf(x);

        List<String> list = new ArrayList<>();

        if(s.startsWith("-")) list.add("-");

        int quotient;

        int rest;

        // x = 123
        quotient = x / 10 ;

        if(quotient == 0) return x  ;

        for(;;){

            rest =  x % 10;

            list.add(String.valueOf(Math.abs(rest)));

            x = quotient ;

            quotient = x / 10;
            if(quotient==0) {
                list.add(String.valueOf(Math.abs(x % 10)));
                break;
            }
        }

        String result = "";

        for(int i = 0 ; i < list.size(); i++){
            result+=list.get(i);
        }

        if(Double.parseDouble(result) > 2147483647
                || Double.parseDouble(result) < -2147483648)
            return 0;
        return Integer.parseInt(result);



    }



}
