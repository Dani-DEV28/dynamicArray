import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DSLTests {

  @Test
  public void DSLGetTest_negativeOutOfBounds() {
    DynamicStringList list = new DynamicStringList();

    assertThrows(IndexOutOfBoundsException.class, () -> {
        list.get(-1);
    });
  }

  @Test
  public void DSLGetTest_positiveOutOfBounds() {
    DynamicStringList list = new DynamicStringList();

    list.add("A");
    list.add("B");

    assertThrows(IndexOutOfBoundsException.class, () -> {
        list.get(2);
    });
  }

  @Test
  public void DSLSetTest_outOfBounds() {
    
  }


  @Test
  public void DSLAddTest_outOfBounds() {
    
  }

  @Test
  public void DSLRemoveTest_outOfBounds(){
    
  }

  @Test
  public void DSLSizeTest_outOfBounds() {

  }

  @Test
  public void DSLCapacityTest_outOfBounds() {

  }
}