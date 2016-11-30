/**
 * Coucou les gens c'est Dori !!
 */
package com.gp2.tests;
import com.gp2.component.*;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author group2
 */
public class EntityItemNPCTest {

    NPC brenda;
    DialogueManager sentence = new DialogueManager(new DialogueStage("hello i'm the mama"));
    ArrayList<DialogueManager> listDialogue;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    	listDialogue.add(sentence);
        brenda = new NPC("Brenda", "The mama of the familia",listDialogue);   
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }
    /**
     * Test method for {@link com.gp2.component.Entity#getName()}.
     */
    @Test
    public void testGetName() {
        assertEquals(brenda.getName(), "Brenda");
    }

    /**
     * Test method for {@link com.gp2.component.Entity#getDescription()}.
     */
    @Test
    public void testGetDescription() {
        assertEquals(brenda.getDescription(), "The mama of the familia");
    }
    /**
     * Test method for {@link com.gp2.component.Entity#getDialogueManager()}.
     */
    @Test
    public void testGetDialogueManager() {
        assertEquals(brenda.getDialogueManager(), "The mama of the familia");
    }
    
    

}
