public enum WeekDay {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private boolean isWorkingDay;

    WeekDay(boolean isWorkday) {
        this.isWorkingDay = isWorkday;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }
}
