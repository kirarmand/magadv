package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;

public class RoomCreation {
	
// Attributes which describe each room in the game
	
	private Room tour;
	private Room cour;
	private Room reserve;
	private Room ecurie;
	private Room salleBanquet;
	private Room salleTrone;
	private Room vestibule;
	private Room prison;
	private Room cuisine;
	private ArrayList<Room> listRoom; 
	
	
	public RoomCreation(){
		
		//tour
		tour = new Room("tour","Salle initiale ou se trouve notre licorne");
		tour.addExit("DOWN", new Exit(tour,cour));
		tour.addExit("EAST", new Exit(cour,prison));
		listRoom.add(tour);
		
		//cour
		cour = new Room("cour","cour principale du chateau");
		cour.addExit("NORTH", new Exit(cour,ecurie));
		cour.addExit("EAST", new Exit(cour,salleBanquet));
		cour.addExit("DOWN", new Exit(cour,reserve));
		listRoom.add(cour);
		
		//reserve
		reserve = new Room("reserve","");
		reserve.addExit("UP", new Exit(reserve,cour));
		listRoom.add(reserve);
		
		//ecurie
		ecurie = new Room("Ecurie","Dans cette ecurie il y a des chevaux");
		ecurie.addExit("SOUTH", new Exit(ecurie,cour));
		listRoom.add(ecurie);
		
		//salle banquet 
		salleBanquet = new Room ("Salle du banquet","Salle de banquet avec beaucoup beaucoup beaucoup de personnes");
		salleBanquet.addExit("EAST",new Exit(salleBanquet,vestibule));
		salleBanquet.addExit("SOUTH",new Exit(salleBanquet,cuisine));
		salleBanquet.addExit("WEST",new Exit(salleBanquet,cour));
		listRoom.add(salleBanquet);
		
		//Salle trone 
		salleTrone = new Room ("Salle du trone","La ou la méchante reine vous attend");
		salleTrone.addExit("WEST", new Exit (salleTrone,vestibule));
		listRoom.add(salleTrone);
		
		//Vestibule 
		vestibule = new Room ("Vestibule","Les gardes sont la pour botter ton petiit cul");
		vestibule.addExit("EAST", new Exit (vestibule, salleTrone));
		vestibule.addExit("WEST", new Exit (vestibule, salleBanquet));
		listRoom.add(vestibule);
		
		//Prison 
		prison = new Room ("Prison","Ceci est la piece ou tu perd tout et tu pleure!!!"); 
		prison.addExit("WEST", new Exit (prison, tour));
		listRoom.add(prison);
		
		//cuisine
		cuisine = new Room ("Cuisine","Ceci est la piece ou tout sens bon et ou tu peut prendre des kilos");
		cuisine.addExit("NORTH", new Exit (cuisine,salleBanquet));	
		listRoom.add(cuisine);
	}
	
	public ArrayList<Room> getAllRooms()
	{
		return listRoom; 
		
	}
	
	
	
}
