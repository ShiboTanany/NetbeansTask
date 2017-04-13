
package test8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author shibo
 */
public class Test8 {

    public static void main(String[] args) {
        System.out.println(""+LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    }
    
}
