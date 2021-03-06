import static org.junit.Assert.*;
import org.junit.Test;

public class BabySitterTest {

  @Test
  public void startBefore5DoesNotBeginShift() {
      //Arrange

      //Act
      Shift shift = new Shift(16, 3);

      //Assert
      assertEquals(0, shift.getStartTimeHours());
  }

  @Test
  public void endAfter4amDoesNotBeginShift() {
      //Arrange

      //Act
      Shift shift = new Shift(17, 5);

      //Assert
      assertEquals(0, shift.getEndTimeHours());
  }

  @Test
  public void paid12PerHourFromStartTimetoBedTimeAt20() {
      //Arrange


      //Act
      Shift shift = new Shift(17, 20);

      //Assert
      assertEquals(36, shift.calculatePay(), 0);
  }

  @Test
  public void paid8PerHourFromSBedTimeToMidnight() {
      //Arrange


      //Act
      Shift shift = new Shift(20, 24);

      //Assert
      assertEquals(32, shift.calculatePay(), 0);
  }

  @Test
  public void paid16PerHourFromMidnightToEndOfJob() {
      //Arrange


      //Act
      Shift shift = new Shift(24, 3);

      //Assert
      assertEquals(48, shift.calculatePay(), 0);
  }

  @Test
  public void endToEndShiftTest() {
      //Arrange


      //Act
      Shift shift = new Shift(17, 4);

      //Assert
      assertEquals(132, shift.calculatePay(), 0);
  }


}
