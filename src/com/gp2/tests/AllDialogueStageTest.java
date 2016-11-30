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
    private ArrayList <String> arrayTest;
    private DialogueStageChoice truck2;
    private DialogueStageExitJail truck3;
    private DialogueStageInput truck4;
    private DialogueStageGiveObject truck5;

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
        arrayTest = new ArrayList<>(Arrays.asList("Hello", "Im la mama"));
        truck2 = new DialogueStageChoice(sentence1,arrayTest,3);
        truck3 = new DialogueStageExitJail(sentence1,exit1);
        truck4 = new DialogueStageInput(sentence2,arrayTest);
        truck5 = new DialogueStageGiveObject(sentence1,dummy);
	}

	/**
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
    public void testGetSentence(){
        assertEquals(truck1.getSentence(), new DialogueStage(sentence1).getSentence());
    }

    @Test
    public void testGoodAnswer(){
        assertEquals(truck2.goodAnswer(3), new DialogueStageChoice(sentence1,arrayTest,3));
    }

    @Test
    public void testGetGoJAil(){
        assertTrue(truck3.getGoJail() instanceof Exit);
    }

    @Test
    public void testGoodAnswers(){
        assertTrue(truck4.goodAnswers("Hello"));
    }
    @Test
    public void testGetItem(){
            assertEquals(truck5.getItem(), dummy);
    }
}
