package epam.task9;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Eliminatinga {


    //A is removed if it is present in first 2 characters
    /*1. ABCD=>BCD
     2.AACD=>CD
     3.BACD=>BCD
     4.BBAA=>BBAA
     5.AABAA=>BAA
     */
     App st = null ;
     @BeforeEach
     public  void setup() {
     st= new App();
     }
     @Test
    void test1() {
    assertEquals("BCD",st.swap("ABCD"));
    }


	@Test
	void test2() {
		assertEquals("CD",st.swap("AACD"));
	}
	@Test
	void test3() {
		assertEquals("BCD",st.swap("BACD"));
	}
	@Test
	void test4() {
		assertEquals("BBAA",st.swap("BBAA"));
	}
    @Test
    void test5() {
    	assertEquals("BAA",	st.swap("AABAA"));
    }

}
