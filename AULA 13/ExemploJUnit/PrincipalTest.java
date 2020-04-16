import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class PrincipalTest {
  public static void main(String[] args) {
      
    System.out.println("\f");  
    Result result = JUnitCore.runClasses(PessoaTest.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
}