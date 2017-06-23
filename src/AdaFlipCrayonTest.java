

import static org.junit.Assert.*;

import org.junit.Test;

public class AdaFlipCrayonTest {

	@Test
	public void noOfFlips() {
		assertEquals(0, f("U"));
		assertEquals(1, f("UUDDDUUU"));
		assertEquals(0, f("UU"));
		assertEquals(1, f("UUD"));
		assertEquals(0, f("D"));
		assertEquals(1, f("DU"));
		assertEquals(2, f("DDDUDDUUDD"));
	}

	private int f(String string) {
		return AdaFlipCrayon.noOfFlips(string);
	}

}
