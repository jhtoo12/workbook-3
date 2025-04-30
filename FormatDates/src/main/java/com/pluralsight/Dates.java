import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(formatter2));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(now.format(formatter3));

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        System.out.println(now.format(formatter4));
    }
}



