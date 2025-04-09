import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;

public class DSLTests {

  private DynamicStringList list = new DynamicStringList();

  @Test
  public void DSLGetTest_outOfBounds() {

    assertThrows(IndexOutOfBoundsException.class, () -> {
        list.get(-1);
    });
  }

  @Test
  public void testInitialSize() {
    assertEquals(0, list.size(), "Initial size should be 0");
  }


  @Test
  public void testSizeAfterRemoval() {
    list.set(0, "A");
    list.set(1, "B");
    list.set(2, "C");

    // list.remove(1); // Remove "B"
    assertEquals(3, list.size(), "Size should be 2 after removing one element");
  }

  @Before
  public void setUp() {
      // Set custom capacity for the test
      list = new DynamicStringList(20);
  }

  @Test
  public void testChangingCaps(){

  }
}