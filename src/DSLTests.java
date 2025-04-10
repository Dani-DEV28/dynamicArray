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
  public void DSLGetTest_successfulGet() {
    DynamicStringList list = new DynamicStringList();
    list.add("A");
    list.add("B");

    String result = list.get(0);

    assertEquals("A", result);
  }

  @Test
  public void DSLSetTest_negativeOutOfBounds() {
    DynamicStringList list = new DynamicStringList();
    list.add("A");
    list.add("B");

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.set(-1, "C");
    });
  }

  @Test
  public void DSLSetTest_positiveOutOfBounds() {
    DynamicStringList list = new DynamicStringList();
    list.add("A");
    list.add("B");

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.set(2, "C");
    });
  }

  @Test
  public void DSLSetTest_successfulSet() {
    DynamicStringList list = new DynamicStringList();
    list.add("A");
    list.add("B");

    list.set(0, "C");
    String result = list.get(0);

    assertEquals("C", result);
  }


  @Test
  public void DSLAddTest_capacity2() {
    DynamicStringList list = new DynamicStringList(1);
    
    list.add("A");
    list.add("B");

    assertEquals("[A, B]", list.toString());
  }

  @Test
  public void DSLAddTest_capacity4() {
    DynamicStringList list = new DynamicStringList(1);
    
    list.add("A");
    list.add("B");
    list.add("C");

    assertEquals("[A, B, C, null]", list.toString());
  }

  @Test
  public void DSLAddTest_capacity10() {
    DynamicStringList list = new DynamicStringList();
    
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");

    assertEquals("[A, B, C, D, E, null, null, null, null, null]", list.toString());
  }

  @Test
  public void DSLRemoveTest_negativeOutOfBounds(){
    DynamicStringList list = new DynamicStringList(1);
    list.add("A");
    list.add("B");

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.remove(-1);
    });
  }

  @Test
  public void DSLRemoveTest_positiveOutOfBounds(){
    DynamicStringList list = new DynamicStringList(1);
    list.add("A");
    list.add("B");

    assertThrows(IndexOutOfBoundsException.class, () -> {
      list.remove(2);
    });
  }

  @Test
  public void DSLRemoveTest_successfulRemoval(){
    DynamicStringList list = new DynamicStringList(1);
    list.add("A");
    list.add("B");

    String result = list.remove(1);

    assertEquals("B", result);
  }

  @Test
  public void DSLRemoveTest_successfulRemovalWithString(){
    DynamicStringList list = new DynamicStringList(1);
    list.add("A");
    list.add("B");

    list.remove(1);

    assertEquals("[A, null]", list.toString());
  }

  @Test
  public void DSLRemoveTest_successfulRemovalWithTenStringCapacity(){
    DynamicStringList list = new DynamicStringList();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");

    list.remove(1);

    assertEquals("[A, C, D, null, null, null, null, null, null, null]", list.toString());
  }

  @Test
  public void DSLRemoveTest_successfulRemovalAndAddWithString(){
    DynamicStringList list = new DynamicStringList(1);
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");

    list.remove(1);
    list.add("E");

    assertEquals("[A, C, D, E]", list.toString());
  }

  @Test
  public void DSLSizeTest() {
    DynamicStringList list = new DynamicStringList();
    list.add("A");
    list.add("B");

    int result = list.size();

    assertEquals(2, result);
  }

  @Test
  public void DSLCapacityTest() {
    DynamicStringList list = new DynamicStringList(1);
    list.add("A");
    list.add("B");
    list.add("C");

    int result = list.capacity();

    assertEquals(4, result);
  }
}