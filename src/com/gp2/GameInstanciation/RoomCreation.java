package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;

public class RoomCreation {
	
// Attributes which describe each room in the game
	
	public Room tour;
	public Room cour;
	public Room reserve;
	public Room ecurie;
	public Room salleBanquet;
	public Room salleTrone;
	public Room vestibule;
	public Room prison;
	public Room cuisine;
	
	public RoomCreation(){
		//tour
		tour = new Room("tour","Salle initiale où se trouve notre licorne");
		tour.addExit("DOWN", new Exit(tour,cour));
		tour.addExit("WEST", new Exit(cour,prison));
		//cour
		cour = new Room("cour","cour principale du chateau");
		cour.addExit("EAST", new Exit(cour,ecurie));
		cour.addExit("WEST", new Exit(cour,salleBanquet));
		cour.addExit("NORTH", new Exit(cour,reserve));
		//reserve
		reserve = new Room("reserve","");
		reserve.addExit("EAST", new Exit(reserve,cour));
		
		
	}
	
	
	
}
