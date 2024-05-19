public class App {
    enum WeekDays {
        MONDAY("This day work") {
            @Override
            void test() {
                System.out.println("Monday test");
            }
        };
        // TUESDAY, WENTHDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        private String s;

        WeekDays() {
        }

        WeekDays(String s) {
            this.s = s;
        }

        public String getS() {
            return s;
        }

        abstract void test();
    }

    public static void main(String[] args) throws Exception {
        WeekDays.MONDAY.test();
    }
}
