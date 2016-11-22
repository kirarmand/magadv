/**
 * 
 */
package com.gp2.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gp2.component.Entity;
import com.gp2.component.Exit;
import com.gp2.component.ExitWithItem;
import com.gp2.component.Item;
import com.gp2.component.NPC;
import com.gp2.component.Player;
import com.gp2.component.Room;

/**
 * @author group2
 * 
 * Test the good work of the player class according to its Javadoc
 * @see com.gp2.component.Player
 */
public class PlayerTest {

	private Room roomA,roomB;
	private Player myPlayerNamed;
	private Player myPlayerUnamed;
	private Item dummy;


	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		dummy = new Item("dummy", "a simple dummy");
		roomA = new Room("Bathroom", "Just a normal bathroom");
		roomB = new Room("Kitchen", "Just a normal kitchen");
		roomA.addExit("north", new Exit(roomA, roomB));
		roomB.addExit("north", new ExitWithItem(roomB,roomA,dummy));
		myPlayerNamed = new Player("Simon", roomA);
		myPlayerUnamed = new Player("", roomB);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test naming from method for {@link com.gp2.component.Player#Player(java.lang.String, com.gp2.component.Room)}.
	 * Test is the name is correctly set through constructor, when name is given.
	 */
	@Test
	public void testPlayerNamingWithConstructor() {
		assertEquals(myPlayerNamed.getName(),"Simon");
	}
	
	/**
	 * Test no naming from method for {@link com.gp2.component.Player#Player(java.lang.String, com.gp2.component.Room)}.
	 * Test is the name is correctly set through constructor, when no name is given.
	 */
	@Test
	public void testPlayerNoName() {
		assertEquals(myPlayerUnamed.getName(),"Roberto");
	}

	/**
	 * Test method for {@link com.gp2.component.Player#move(com.gp2.component.Exit)}.
	 * Test if the player move toward an always accessible exit.
	 */
	@Test
	public void testMoveAccessible() {
		Room beforeMove = myPlayerNamed.getCurrentRoom();
		myPlayerNamed.move(myPlayerNamed.getCurrentRoom().getExits().get("north"));
		Room afterMove = myPlayerNamed.getCurrentRoom();
		assertNotEquals(beforeMove,afterMove);
	}
	
	/**
	 * Test method for {@link com.gp2.component.Player#move(com.gp2.component.Exit)}.
	 * Test if the player move toward an always inaccessible exit.
	 */
	@Test
	public void testMoveInaccessible() {
		assertTrue(!myPlayerUnamed.getInventory().contains(dummy));
		Room beforeMove = myPlayerUnamed.getCurrentRoom();
		myPlayerUnamed.move(myPlayerUnamed.getCurrentRoom().getExits().get("north"));
		Room afterMove = myPlayerUnamed.getCurrentRoom();
		assertEquals(beforeMove,afterMove);
	}

	/**
	 * Test method for {@link com.gp2.component.Player#pickUp(com.gp2.component.Entity)}.
	 * Test if the player can pick up a item that is not in the room.
	 */
	@Test
	public void testPickUpItemNotInRoom() {
		myPlayerNamed.pickUp(dummy);
		assertTrue(!myPlayerNamed.getInventory().contains(dummy));
	}
	
	/**
	 * Test method for {@link com.gp2.component.Player#pickUp(com.gp2.component.Entity)}.
	 * Test if the player can pick up a item that is in the room.
	 */
	@Test
	public void testPickUpItemInRoom() {
		roomA.getContent().add(dummy);
		myPlayerNamed.pickUp(dummy);
		assertTrue(myPlayerNamed.getInventory().contains(dummy));
	}
	
	/**
	 * Test method for {@link com.gp2.component.Player#pickUp(com.gp2.component.Entity)}.
	 * Test if the player can pick up a entity that is not carriageable
	 */
	@Test
	public void testPickUpItemNoCarriageable() {
		NPC dummyNonCarriableBecauseNPC = new NPC("dummy", "a simple dummy",new ArrayList<>());
		roomA.getContent().add(dummyNonCarriableBecauseNPC);
		myPlayerNamed.pickUp(dummyNonCarriableBecauseNPC);
		assertTrue(!myPlayerNamed.getInventory().contains(dummyNonCarriableBecauseNPC));
	}

	/**
	 * Test method for {@link com.gp2.component.Player#dropOff(com.gp2.component.Entity)}.
	 * Test if player can drop off an owned item.
	 */
	@Test
	public void testDropOff() {
		ArrayList<Entity> step1 = (ArrayList<Entity>) myPlayerNamed.getInventory().clone();;
		myPlayerNamed.getInventory().add(dummy);
		ArrayList<Entity> step2 = (ArrayList<Entity>) myPlayerNamed.getInventory().clone();;
		myPlayerNamed.dropOff(dummy);
		ArrayList<Entity> step3 = (ArrayList<Entity>) myPlayerNamed.getInventory().clone();;
		assertTrue(step1.equals(step3) && !step1.equals(step2) && !step3.equals(step2));
	}

}
