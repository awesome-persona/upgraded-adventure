package lesson10;

public enum DayOfWeek {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true),
    SUNDAY {
        @Override
        public boolean isWeekend() {
            return true;
        }
    };

    private final boolean weekend;

    DayOfWeek(boolean weekend) {
        this.weekend = weekend;
    }

    DayOfWeek() {
        this(false);
//        this.weekend = false;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public static void main(String[] args) {
        DayOfWeek tuesday = DayOfWeek.TUESDAY;

        DayOfWeek dayOfWeek = DayOfWeek.valueOf("THURSDAY");

        DayOfWeek[] values = DayOfWeek.values();
        DayOfWeek value = values[0];
        String name = value.name();
        int ordinal = value.ordinal();
        System.out.println(ordinal);

        switch (value) {
            case MONDAY:
                System.out.println("");
                break;
            case TUESDAY:
                System.out.println("");

            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY, SUNDAY:
            default:
//            case MONDAY -> System.out.println("");
//            case TUESDAY -> System.out.println("");
//            case SATURDAY -> System.out.println("");
        }
    }
}
