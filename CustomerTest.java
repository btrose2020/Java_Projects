import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * CustomerTest class.
 */
public class CustomerTest {

   /**
    * Set location test.
    */
   @Test
   public void setLocationTest1() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }

   /**
    * Second set location test.
    */
   @Test
   public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta, GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }

   /**
    * Balance change test.
    */
   @Test
   public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   }

   /**
    * Returns String.
    */
   @Test
   public void toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }

   /**
    * Main method to run the tests.
    * @param args - arguments.
    */
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(CustomerTest.class);
   
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
   
      System.out.println(result.wasSuccessful());
   }
}
