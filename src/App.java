import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;

public class App {
    enum WeekDays {
        MONDAY("This day work"), TUESDAY, WENTHDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        private String s;

        WeekDays() {
        }

        WeekDays(String s) {
            this.s = s;
        }

        public String getS() {
            return s;
        }

    }

    public static void main(String[] args) throws Exception {
        // System.out.println(WeekDays.values());
        // for (WeekDays days : WeekDays.values()) {
        // System.out.println(days);
        // }

        // System.out.println(Arrays.toString(WeekDays.values()));
        EnumSet<WeekDays> day = EnumSet.allOf(WeekDays.class);// != new this abstract class
        System.out.println(day);
        day = EnumSet.range(WeekDays.FRIDAY, WeekDays.SUNDAY);
        System.out.println(day);
        EnumSet<WeekDays> day2 = EnumSet.noneOf(WeekDays.class);
        day2.add(WeekDays.FRIDAY);
        System.out.println(day2);
        day2.addAll(day);
        System.out.println(day2);
        day2.remove(WeekDays.FRIDAY);
        System.out.println(day2);
        EnumMap<WeekDays, String> day3 = new EnumMap<>(WeekDays.class);
        day3.put(WeekDays.MONDAY, "Working day");
        day3.put(WeekDays.SUNDAY, "off day");
        System.out.println(day3);

    }
}
