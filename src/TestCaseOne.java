import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestCaseOne {
    @Test
    void bastShoe() {
        String actual = Level1.BastShoe("1 a");
        String expected = "a";
        assertEquals(expected, actual);

        String actual_1 = Level1.BastShoe("1 b");
        String expected_1 = "ab";
        assertEquals(expected_1, actual_1);

        String actual_2 = Level1.BastShoe("1 c");
        String expected_2 = "abc";
        assertEquals(expected_2, actual_2);

        String actual_3 = Level1.BastShoe("1 d");
        String expected_3 = "abcd";
        assertEquals(expected_3, actual_3);

        String actual_4 = Level1.BastShoe("1 e");
        String expected_4 = "abcde";
        assertEquals(expected_4, actual_4);

        String actual_5 = Level1.BastShoe("4");
        String expected_5 = "abcd";
        assertEquals(expected_5, actual_5);

        String actual_6 = Level1.BastShoe("4");
        String expected_6 = "abc";
        assertEquals(expected_6, actual_6);

        String actual_7 = Level1.BastShoe("4");
        String expected_7 = "ab";
        assertEquals(expected_7, actual_7);

        String actual_8 = Level1.BastShoe("4");
        String expected_8 = "a";
        assertEquals(expected_8, actual_8);

        String actual_9 = Level1.BastShoe("4");
        String expected_9 = "";
        assertEquals(expected_9, actual_9);

        String actual_10 = Level1.BastShoe("5");
        String expected_10 = "a";
        assertEquals(expected_10, actual_10);

        String actual_11 = Level1.BastShoe("5");
        String expected_11 = "ab";
        assertEquals(expected_11, actual_11);

        String actual_12 = Level1.BastShoe("1 A");
        String expected_12 = "abA";
        assertEquals(expected_12, actual_12);

        String actual_13 = Level1.BastShoe("4");
        String expected_13 = "ab";
        assertEquals(expected_13, actual_13);

        String actual_14 = Level1.BastShoe("1 B");
        String expected_14 = "abB";
        assertEquals(expected_14, actual_14);

        //break Undo story

        String actual_15 = Level1.BastShoe("3 0");
        String expected_15 = "a";
        assertEquals(expected_15, actual_15);

        String actual_16 = Level1.BastShoe("3 1");
        String expected_16 = "b";
        assertEquals(expected_16, actual_16);

        String actual_17 = Level1.BastShoe("4");
        String expected_17 = "abb";
        assertEquals(expected_17, actual_17);

        String actual_18 = Level1.BastShoe("1 D");
        String expected_18 = "abbD";
        assertEquals(expected_18, actual_18);

        String actual_19 = Level1.BastShoe("2 2");
        String expected_19 = "ab";
        assertEquals(expected_19, actual_19);

        String actual_20 = Level1.BastShoe("3 0");
        String expected_20 = "a";
        assertEquals(expected_20, actual_20);

        String actual_21 = Level1.BastShoe("4");
        String expected_21 = "abbDa";
        assertEquals(expected_21, actual_21);

        String actual_22 = Level1.BastShoe("1 R");
        String expected_22 = "abbDaR";
        assertEquals(expected_22, actual_22);

        //break Undo story

        String actual_23 = Level1.BastShoe("5");
        String expected_23 = "abbDaR";
        assertEquals(expected_23, actual_23);

        String actual_24 = Level1.BastShoe("4");
        String expected_24 = "abbDa";
        assertEquals(expected_24, actual_24);

        String actual_25 = Level1.BastShoe("1 P");
        String expected_25 = "abbDaP";
        assertEquals(expected_25, actual_25);

        String actual_26 = Level1.BastShoe("3 3");
        String expected_26 = "D";
        assertEquals(expected_26, actual_26);

        String actual_27 = Level1.BastShoe("4");
        String expected_27 = "abbDaD";
        assertEquals(expected_27, actual_27);
    }
}