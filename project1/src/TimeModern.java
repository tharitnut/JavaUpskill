import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeModern {

    // use LoaclTime from manage time
    private LocalTime time;

    public TimeModern() {
        this.time = LocalTime.of(0, 0, 0);
    }

    public TimeModern(int hour, int minute, int second) {
        this.time = LocalTime.of(hour, minute, second);
    }

    public int getHour() {
        return time.getHour();
    }

    public int getMinute() {
        return time.getMinute();
    }

    public int getSecond() {
        return time.getSecond();
    }

    public TimeModern withTime(int hour, int minute, int second) {
        return new TimeModern(hour, minute, second);
    }

    // crate new object that add 1 sec
    public TimeModern nextSecond() {
        // call plusSeconds(1)
        LocalTime newTime = this.time.plusSeconds(1);
        return new TimeModern(newTime.getHour(),
                newTime.getMinute(),
                newTime.getSecond());
    }

    @Override
    public String toString() {
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
