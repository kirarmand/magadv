/**
 * 
 */
package com.gp2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gp2.component.Exit;
import com.gp2.component.Room;

/**
 * @author group2
 * 
 * Test the good work of the room class according to its Javadoc
 * @see com.gp2.component.Room
 */
public class RoomTest {

	private Room roomA,roomB;
	
	/**
	 * @throws java.lang.Exception
	 */
	// test
	@Before
	public void setUp() throws Exception {
		roomA = new Room("Bathroom", "Just a normal bathroom");
		roomB = new Room("Kitchen", "Just a normal kitchen");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.gp2.component.Room#Room(java.lang.String, java.lang.String)}.
	 * Test the naming of a new room through constructor
	 */
	@Test
	public void testRoomNameAndDescription() {
		assertTrue(roomA.getName().equals("Bathroom") && roomA.getDescription().equals("Just a normal bathroom"));
	}

	/**
	 * Test method for {@link com.gp2.component.Room#addExit(java.lang.String, com.gp2.component.Exit)}.
	 * Test the adding of a new suitable exit.
	 */
	@Test
	public void testAddNewGoodExit() {
		Exit exit1 = new Exit(roomA, roomB);
		roomA.addExit("north", exit1);
		assertEquals(roomA.getExits().get("north"),(exit1));
	}
	
	/**
	 * Test method for {@link com.gp2.component.Room#addExit(java.lang.String, com.gp2.component.Exit)}.
	 * Test the adding of a exit with wrong starting room
	 */
	@Test
	public void testAddNewBadStartExit() {
		//Try to set an exit with a Bad Starting Room
		Exit exitBadStartingRoom = new Exit(new Room("WC", "You dont wanna know"), roomB);
		roomA.addExit("north", exitBadStartingRoom);
		assertTrue(!roomA.getExits().containsKey("north"));
	}
	
	/**
	 * Test method for {@link com.gp2.component.Room#addExit(java.lang.String, com.gp2.component.Exit)}.
	 * Test the adding of a exit with no direction given
	 */
	@Test
	public void testExitAddNewNoDirectionGiven() {
		//Try to set an exit with no direction
		Exit goodExit = new Exit(roomA, roomB);
		roomA.addExit("", goodExit);
		assertTrue(!roomA.getExits().containsValue(goodExit));
	}
	
	/**
	 * Test method for {@link com.gp2.component.Room#addExit(java.lang.String, com.gp2.component.Exit)}.
	 * Test the adding of a exit with direction that is already given
	 */
	@Test
	public void testExitAddNewDirectionAlreadyGiven() {
		//Try to set an exit with the same direction as an other one
		Exit goodExit = new Exit(roomA, roomB);
		roomA.addExit("north", goodExit);
		assertTrue(roomA.getExits().containsValue(goodExit));
		Exit toWaterCloset = new Exit(roomA, new Room("WC", "You dont wanna know"));
		roomA.addExit("north", toWaterCloset);
		assertTrue(!roomA.getExits().containsValue(toWaterCloset));
	}
	
	/**
	 * Test method for {@link com.gp2.component.Room#addExit(java.lang.String, com.gp2.component.Exit)}.
	 * Test the adding of a exit with exit that is already given
	 */
	@Test
	public void testExitAddNewExitAlreadyGiven() {
		//Try to set an exit with the same direction as an other one
		Exit goodExit = new Exit(roomA, roomB);
		roomA.addExit("north", goodExit);
		assertTrue(roomA.getExits().containsValue(goodExit));
		roomA.addExit("south", goodExit);
		assertTrue(!roomA.getExits().containsKey("south"));
	}
}
