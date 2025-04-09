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

  @Test
  public void testInitialSize() {
    DynamicStringList list = new DynamicStringList();
    assertEquals(0, list.size(), "Initial size should be 0");
  }


  @Test
  public void testSizeAfterRemoval() {
      DynamicStringList list = new DynamicStringList();
      list.set(0, "A");
      list.set(1, "B");
      list.set(2, "C");

      // list.remove(1); // Remove "B"
      assertEquals(3, list.size(), "Size should be 2 after removing one element");
  }
}