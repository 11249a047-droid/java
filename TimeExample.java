import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class TimeExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Time: " + time.format(format));
    }
}