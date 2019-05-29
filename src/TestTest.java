import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
// import java.util.*;
class TestTest {

	@Test
	
	void testRoll1() {
		int num = Dice2.Roll();
		assertTrue(num>0 && num>1);
	}
	@Test
	void testRoll2() {
		int num1 = Dice2.Roll();
		assertTrue(num1 >=2 && num1 <=12);
	}
	@Test
	void testIfUserWon() {
		assertEquals(Dice2.Game(7), "You Win!!");
		assertEquals(Dice2.Game(11), "You Win!!");
		
	}
	@Test
	void testIfUserLose() {
		assertEquals(Dice2.Game(2), "You Lost");
		assertEquals(Dice2.Game(3), "You Lost");
		assertEquals(Dice2.Game(12), "You Lost");
		
	}
	
	@Test
	void testIfUserCanRollAgain() {
		assertNotEquals(Dice2.Game(4), "You Win!!");
		assertNotEquals(Dice2.Game(4), "You Lost");
		
	}
}


