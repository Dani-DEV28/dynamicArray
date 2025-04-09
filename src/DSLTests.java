import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DSLTests {

  @Test
  public void DSLGetTest_outOfBounds() {
    DynamicStringList test = new DynamicStringList();

    assertThrows(IndexOutOfBoundsException.class, () -> {
        test.get(-1);
    });
  }


}