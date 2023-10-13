package lecture_nr_12.example_2;

public enum WeekDays {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay(){
        if(this == SATURDAY || this == SUNDAY)
            return true;

        return false;
    }
}
