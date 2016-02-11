public class Shift {

    int startTimeHours;
    int endTimeHours;

    double total = 0;

    final Double BEGINNING_HOUR_RATE = 12.00;
    final Double BED_TIME_RATE = 8.00;
    final Double END_SHIFT_RATE = 16.00;

    public Shift(int beginHours, int endHours) {
        if (beginHours >= 17 && (endHours <= 4 || endHours >= 17)) {
            startTimeHours = beginHours;
            endTimeHours = endHours;
        }
    }

    public int getStartTimeHours(){
        return startTimeHours;
    }

    public int getEndTimeHours() {
        return endTimeHours;
    }

    public Double calculatePay() {
        if (endTimeHours <= 4) {
            endTimeHours += 24;
        }
        for (int i = startTimeHours; i < endTimeHours; i++) {
            total += calculateBeginningHourPay(i);
            total += calculateBedTimePay(i);
            total += calculateEndTimePay(i);
          }
          return total;
      }

      public Double calculateBeginningHourPay(int hour) {
        if (hour < 20) {
            return BEGINNING_HOUR_RATE;
          } else {
            return 0.0;
          }
      }

      public Double calculateBedTimePay(int hour) {
        if (hour >= 20 && hour < 24) {
            return BED_TIME_RATE;
        } else {
            return 0.0;
        }
      }

        public Double calculateEndTimePay(int hour) {
           if (hour >= 24 && hour <= 28){
              return END_SHIFT_RATE;
           } else {
              return 0.0;
           }
        }

}
