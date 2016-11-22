/**
 * 
 */
package com.gp2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gp2.component.Exit;
import com.gp2.component.ExitWithItem;
import com.gp2.component.ExitWithString;
import com.gp2.component.Item;
import com.gp2.component.Player;
import com.gp2.component.Room;

/**
 * @author group2
 * 
 * Test the good work of all the exit class according to its Javadoc
 * @see com.gp2.component.Exit
 * @see com.gp2.component.ExitWithItem
 * @see com.gp2.component.ExitWithString
 * 
 */
public class AllExitTest {
	
	
	private Room roomA,roomB;
	private Exit exit1,exit2;
	private ExitWithItem exitIt1,exitIt2;
	private ExitWithString exitSt1,exitSt2;
	private Item dummy;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		roomA = new Room("Bathroom", "Just a normal bathroom");
		roomB = new Room("Kitchen", "Just a normal kitchen");
		exit1 = new Exit(roomA, roomB);
		exit2 = new Exit(roomA, roomB, "thin wooden door");
		dummy = new Item("dummy", "a simple dummy");
		exitIt1 = new ExitWithItem(roomA, roomB, dummy);
		exitIt2 = new ExitWithItem(roomA, roomB,"strange gate",dummy);
		exitSt1 = new ExitWithString(roomA, roomB, "say hello","hello");
		exitSt2 = new ExitWithString(roomA, roomB,"THIS DOOR SPEAKS!","say hi","hi");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test the building of a new exit through constructor
	 */
	@Test
	public void testExitConstructor() {
		assertEquals(exit2.getDescription(), "thin wooden door");
		/*assertEquals(exit1,new Exit(roomA, roomB,""));*/
	}
	
	/**
	 * Test the building of a new exit through constructor for ExitWithItem
	 */
	@Test
	public void testExitWithItemConstructor() {
		assertEquals(exitIt2.getDescription(), "strange gate");
		/*assertEquals(exitIt1,new ExitWithItem(roomA, roomB,"",dummy));*/
	}
	
	/**
	 * Test the building of a new exit through constructor for ExitWithString
	 */
	@Test
	public void testExitWithStringConstructor() {
		assertEquals(exitSt2.getDescription(), "THIS DOOR SPEAKS!");
		/*assertEquals(exitSt1,new ExitWithString(roomA, roomB,"","say hi","hi"));*/
	}

	/**
	 * Test method for {@link com.gp2.component.Exit#canPass(com.gp2.component.Player)}.
	 * Test if a player is able to pass basic door.
	 */
	@Test
	public void testCanPass() {
		Player p = new Player("Simon", roomA);
		assertTrue(exit1.canPass(p) && exit2.canPass(p));
	}
	
	/**
	 * Test method for {@link com.gp2.component.Exit#canPass(com.gp2.component.Player)}.
	 * Test if a player is able to pass a door that require a dummy item.
	 */
	@Test
	public void testCanPassWithItem() {
		Player p = new Player("Simon", roomA);
		p.getInventory().add(dummy);
		assertTrue(p.getInventory().contains(dummy));
		assertTrue(exitIt1.canPass(p));/* && exitIt2.canPass(p));*/
	}
	
	/**
	 * Test method for {@link com.gp2.component.Exit#canPass(com.gp2.component.Player)}.
	 * Test if a player is able to pass door that require a the good string input
	 */
	/*@Test
	public void testCanPassWithString() {
		fail("We cannot check this now, string input cannot be read now.");
	}
	*/
	
	

}
