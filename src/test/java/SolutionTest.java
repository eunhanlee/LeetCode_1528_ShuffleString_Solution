import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.Solution;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testRestoreString() {
        Solution solution = new Solution();

        int[] indices1 = {4, 3, 2, 1, 0};
        String s1 = "abcde";
        String expected1 = "edcba";
        String actual1 = solution.restoreString(s1, indices1);
        assertEquals(expected1, actual1);

        int[] indices2 = {1, 0, 3, 2};
        String s2 = "word";
        String expected2 = "owdr";
        String actual2 = solution.restoreString(s2, indices2);
        assertEquals(expected2, actual2);

        int[] indices3 = {0, 1, 2, 3, 4, 5};
        String s3 = "abcdef";
        String expected3 = "abcdef";
        String actual3 = solution.restoreString(s3, indices3);
        assertEquals(expected3, actual3);

        int[] indices4 = {3, 1, 4, 0, 2};
        String s4 = "world";
        String expected4 = "lodwr";
        String actual4 = solution.restoreString(s4, indices4);
        assertEquals(expected4, actual4);

        int[] indices5 = {0};
        String s5 = "x";
        String expected5 = "x";
        String actual5 = solution.restoreString(s5, indices5);
        assertEquals(expected5, actual5);

        int[] indices6 = {2, 0, 1};
        String s6 = "123";
        String expected6 = "231";
        String actual6 = solution.restoreString(s6, indices6);
        assertEquals(expected6, actual6);

        int[] indices7 = {5, 4, 3, 2, 1, 0};
        String s7 = "fedcba";
        String expected7 = "abcdef";
        String actual7 = solution.restoreString(s7, indices7);
        assertEquals(expected7, actual7);

        int[] indices8 = {0, 2, 1};
        String s8 = "xyz";
        String expected8 = "xzy";
        String actual8 = solution.restoreString(s8, indices8);
        assertEquals(expected8, actual8);

        int[] indices9 = {3, 2, 0, 1};
        String s9 = "abcd";
        String expected9 = "cdba";
        String actual9 = solution.restoreString(s9, indices9);
        assertEquals(expected9, actual9);

        System.out.println("All test cases passed.");
    }
}
