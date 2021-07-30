package HundredQuestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class question30 {
    public static void main(String[] args) {
        String string = "2021-07-30";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println("The Date is : " + date);
    }
}
