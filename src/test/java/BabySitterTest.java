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
      assertEquals(0, shift.getBedTimeHours());
  }

  @Test
  public void paid12PerHourFromStartTimetoBedTimeAt20() {
      //Arrange


      //Act
      Shift shift = new Shift(17,3);

      //Assert
      assertEquals(36, shift.calculatePay(), 0); 
  }


}
