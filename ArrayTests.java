import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedMultipleElems() {
    int[] input3 = { 1 , 2 , 3 , 4 , 5 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{ 5 , 4 , 3 , 2 , 1 }, input3);
  }

  @Test
  public void testReversedTwo() {
    int[] input4 = { 1 , 2 };
    assertArrayEquals(new int[]{ 2 , 1 }, ArrayExamples.reversed(input4));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input4 = { 3 , 3 , 3 };
    assertEquals(3, ArrayExamples.averageWithoutLowest(input4), 0.0);
  }
}
