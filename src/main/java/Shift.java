

public class Shift {

    int startTimeHours;
    int bedTimeHours;

    double total;

    final Double BEGINNING_HOUR_RATE = 12.00;
    final Double BED_TIME_RATE = 8.00;
    final Double END_SHIFT_RATE = 16.00;

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

        if (bedTimeHours <= 4) {
            bedTimeHours += 24;
        }

        for (int i = startTimeHours; i < bedTimeHours; i++)
            if (i < 20) {
                total += BEGINNING_HOUR_RATE;
            } else if (i >= 20 && i < 24) {
                total += BED_TIME_RATE;
            } else if (i >= 24 && i <= 28){
                total += END_SHIFT_RATE;
            }
        return total;
      }

}
