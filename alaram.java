import java.time.LocalTime;

public class Alarm {
    public static void main(String[] args) throws Exception {

        LocalTime alarm = LocalTime.of(15, 30); // set time (HH, MM)

        while (true) {
            LocalTime now = LocalTime.now();

            if (now.getHour() == alarm.getHour() &&
                now.getMinute() == alarm.getMinute()) {

                System.out.println("⏰ Alarm!");
                break;
            }

            Thread.sleep(1000);
        }
    }
}
