import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1,2,3,4,5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5,4,3,2,1 }, input1);
	}


  @Test
  public void testReversed1() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 5,4,3,2,1 };
    assertArrayEquals(new int[]{ 1,2,3,4,5 }, ArrayExamples.reversed(input1));
  }


  @Test
  public void testAverageWithoutLowest1() {
    double[] inputDub = { 80.00, 90.00, 100.00, 70.00 };
    assertEquals(90.00, ArrayExamples.averageWithoutLowest(inputDub), 0.01);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] inputDub = { 80.00, 80.00, 80.00, 80.00  };
    assertEquals(80.00, ArrayExamples.averageWithoutLowest(inputDub), 0.01);
  }
}
