/**
 * 
 */

import com.gp2.component.*;
import javafx.scene.control.Dialog;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author goup2
 * 
 * Test the good work of the room class according to its Javadoc
 * @see Room
 */
public class AllDialogueStageTest {

	private Room roomA,roomB;
	private String sentence1,sentence2,sentence3;
	private int testNumber;
	private Exit exit1, exit2;
	private Item dummy;
	private DialogueStage truck1;

	/**
	 * @throws Exception
	 */
	// test
	@Before
	public void setUp() throws Exception {
        roomA = new Room("Bathroom", "Just a normal bathroom");
        roomB = new Room("Kitchen", "Just a normal kitchen");
        exit1 = new Exit(roomA, roomB);
        exit2 = new Exit(roomA, roomB, "thin wooden door");
        dummy = new Item("dummy", "a simple dummy");
        sentence1 = "coucou c'est moi";
        sentence2 = "coucou c'est toi";
        sentence3 = "coucou c'est eux";
        testNumber = 3;
        truck1 = new DialogueStage (sentence1);
	}

	/**
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
    public testGetSentence(){
        assertEquals(DialogueStage.getSentence(), sentence1);
    }


	/**
	 * Test method for {@link Room#addExit(String, Exit)}.
	 * Test the adding of a new suitable exit.
	 */
	@Test
	public void testAddNewGoodExit() {
		Exit exit1 = new Exit(roomA, roomB);
		roomA.addExit("north", exit1);
		assertEquals(roomA.getExits().get("north"),(exit1));
	}

	/**
	 * Test method for {@link Room#addExit(String, Exit)}.
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
	 * Test method for {@link Room#addExit(String, Exit)}.
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
	 * Test method for {@link Room#addExit(String, Exit)}.
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
	 * Test method for {@link Room#addExit(String, Exit)}.
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
