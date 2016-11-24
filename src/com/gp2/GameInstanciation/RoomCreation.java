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
		tour = new Room("tour","Salle initiale ou se trouve notre licorne");
		tour.addExit("DOWN", new Exit(tour,cour));
		tour.addExit("WEST", new Exit(cour,prison));
		
		//cour
		cour = new Room("cour","cour principale du chateau");
		cour.addExit("EAST", new Exit(cour,ecurie));
		cour.addExit("WEST", new Exit(cour,salleBanquet));
		cour.addExit("DOWN", new Exit(cour,reserve));
		
		//reserve
		reserve = new Room("reserve","");
		reserve.addExit("UP", new Exit(reserve,cour));
		
		//ecurie
		ecurie = new Room("Ecurie","Dans cette ecurie il y a des chevaux");
		ecurie.addExit("SOUTH", new Exit(ecurie,cour));
		
		//salle banquet 
		salleBanquet = new Room ("Salle du banquet","Salle de banquet avec beaucoup beaucoup beaucoup de personnes");
		salleBanquet.addExit("EAST",new Exit(salleBanquet,vestibule));
		salleBanquet.addExit("SOUTH",new Exit(salleBanquet,cuisine));
		salleBanquet.addExit("WEST",new Exit(salleBanquet,cour));
		
		//Salle trone 
		salleTrone = new Room ("Salle du trone","La ou la méchante reine vous attend");
		salleTrone.addExit("WEST", new Exit (salleTrone,vestibule));
		
		//Vestibule 
		vestibule = new Room ("Vestibule","Les gardes sont la pour botter ton petiit cul");
		vestibule.addExit("EAST", new Exit (vestibule, salleTrone));
		vestibule.addExit("WEST", new Exit (vestibule, salleBanquet));
		
		//Prison 
		prison = new Room ("Prison","Ceci est la piece ou tu perd tout et tu pleure!!!"); 
		prison.addExit("WEST", new Exit (prison, tour));
		
		//cuisine
		cuisine = new Room ("Cuisine","Ceci est la piece ou tout sens bon et ou tu peut prendre des kilos");
		cuisine.addExit("NORTH", new Exit (cuisine,salleBanquet));	
		
	}
	
	
	
}
