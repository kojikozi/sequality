/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test public void testSum() {
    Calculate cal1 = new Calculate();
    Calculate cal2 = new Calculate();
    Calculate cal3 = new Calculate();
    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", cal1.cal1(2, 3));
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", cal2.cal2());
    assertEquals("Sum of odd of 1 to 10 is 25. Sum of even is 30.", cal3.cal3());
  }

}