

public class Shift {

int startTimeHours;
int bedTimeHours;

    public Shift(int beginHours, int endHours) {
        if (beginHours >= 17 && (endHours <= 4 || endHours >= 17)) {
            startTimeHours = beginHours;
            bedTimeHours = endHours;
        }
    }

    public int getStartTimeHours(){
        return startTimeHours;
    }

    public int getBedTimeHours() {
        return bedTimeHours;
    }

    public Double calculatePay() {
        return 12.00 * (double)(20 - startTimeHours);
    }




}
