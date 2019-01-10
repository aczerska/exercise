import org.junit.Test;
import static org.junit.Assert.*;

public class SecondSmallestTest {

    @Test (expected = Exception.class)
    public void forArraySmallerThan2() throws Exception {
        // Given
        int[] arr = {2};
        // When & Then
        SecondSmallest.findSecondSmallest(arr);
        SecondSmallest.findSecondSmallestOther(arr);
    }

    @Test
    public void forArrayWithMinMaxValues() throws Exception {
        // Given
        int[] arr = {2147483647, -2147483647};
        // When
        int result1 = SecondSmallest.findSecondSmallestOther(arr);
        int result2 = SecondSmallest.findSecondSmallest(arr);
        // Then
        assertEquals(2147483647, result1);
        assertEquals(2147483647, result2);
    }

    @Test
    public void forArraysWithMoreThan2MinValues() throws Exception {
        // Given
        int[] arr = {0, 0, 0, 1};
        // When
        int result1 = SecondSmallest.findSecondSmallest(arr);
        int result2 = SecondSmallest.findSecondSmallestOther(arr);
        // Then
        assertEquals(0, result1);
        assertEquals(0, result2);
    }


}