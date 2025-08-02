import java.time.*;
import java.time.format.DateTimeFormatter;

// Immutable Date class that wrap java.time.LocalDate

public class DateModern {
    private LocalDate date;

    public DateModern(int year, int month, int day) {
        try {
            this.date = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("Invalid date: " + e.getMessage());
        }
    }

    public int getYear() {
        return date.getYear();
    }

    public int getMonth() {
        return date.getMonthValue();
    }

    public int getDay() {
        return date.getDayOfMonth();
    }

    @Override
    public String toString() {
        return date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    // return object
    public DateModern withDate(int year, int month, int date) {
        return new DateModern(year, month, date);
    }
}