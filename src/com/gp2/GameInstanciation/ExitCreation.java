package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;

// This class instantiate all exits of the program 
// It takes in parameters a last room and a next room

public class ExitCreation {
	
	// Door between The tower and the courtyard
	private Exit Door_TC;
	// Door between The jail and the tower
	private Exit Door_JT;
	
	// Door between The courtyard and the tower
	private Exit Door_CT;
	// Door between The courtyard and the stable
	private ExitWithItem Door_CS;
	// Door between The courtyard and the banquet hall
	private Exit Door_CbH;
	// Door between The courtyard and stock
	private Exit Door_CSt;
	
	// Door between The stable and the courtyard
	private Exit Door_SC;
	// Door between The stock and courtyard
	private Exit Door_StC;
	
	// Door between The banquet hall and the courtyard
	private Exit Door_bHC;
	// Door between The banquet hall and vestibule
	private Exit Door_bHV;
	// Door between The banquet hall and the kitchen
	private Exit Door_bHK;
	
	// Door between The kitchen and banquet hall
	private Exit Door_KbH;
	
	// Door between The vestibule and the banquet hall
	private Exit Door_VbH;
	// Door between The vestibule and the throne hall
	private Exit Door_VtH;
	// Door between The throne hall and the vestibule
	private Exit Door_tHV;
	
	private RoomCreation roomCr; // Instantiation of the class roomCreation
	private ItemCreation unlockItem; // Instantiation of the class ItemCreation
	private ArrayList<Exit> exitList; // Creation of list in order to stock all exits
	
	public ExitCreation(){
		
		// Creation of a new Exit in the variable Door_TC
		Door_TC = new Exit(roomCr.getAllRooms().get(0),roomCr.getAllRooms().get(1)); 
		// Door_TC is added in the list exitList
		exitList.add(Door_TC); 
		Door_JT = new Exit(roomCr.getAllRooms().get(7),roomCr.getAllRooms().get(0));
		exitList.add(Door_JT);
		
		Door_CT = new Exit(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(0));
		exitList.add(Door_CT);
		// The class instantiate is the ExitWithItem class which extends Exit class.
		// We have to input an item with unlock this door.
		Door_CS = new ExitWithItem(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(3),unlockItem.getKey());
		exitList.add(Door_CS);
		Door_CbH = new Exit(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(4));
		exitList.add(Door_CbH);
		Door_CSt = new Exit(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(2));
		exitList.add(Door_CSt);
		
		Door_SC = new Exit(roomCr.getAllRooms().get(0),roomCr.getAllRooms().get(1));
		exitList.add(Door_SC);
		
		Door_StC = new Exit(roomCr.getAllRooms().get(3),roomCr.getAllRooms().get(1));
		exitList.add(Door_StC);
		
		Door_bHC = new Exit(roomCr.getAllRooms().get(4),roomCr.getAllRooms().get(1));
		exitList.add(Door_bHC);
		Door_bHV = new Exit(roomCr.getAllRooms().get(4),roomCr.getAllRooms().get(6));
		exitList.add(Door_bHV);
		Door_bHK = new Exit(roomCr.getAllRooms().get(4),roomCr.getAllRooms().get(8));
		exitList.add(Door_bHK);
		
		Door_KbH = new Exit(roomCr.getAllRooms().get(8),roomCr.getAllRooms().get(4));
		exitList.add(Door_KbH);
		
		Door_VbH = new Exit(roomCr.getAllRooms().get(6),roomCr.getAllRooms().get(4));
		exitList.add(Door_VbH);
		Door_VtH = new Exit(roomCr.getAllRooms().get(6),roomCr.getAllRooms().get(5));
		exitList.add(Door_VtH);
		
		Door_tHV = new Exit(roomCr.getAllRooms().get(5),roomCr.getAllRooms().get(6));
		exitList.add(Door_tHV);
	}
	/**
	 * This getter method return a list which contains all exits
	 * The aim is to use that method from another class to call exits
	 * @return exitList 
	 */
	public ArrayList<Exit> getAllDoor(){
		return exitList;
	}
}

