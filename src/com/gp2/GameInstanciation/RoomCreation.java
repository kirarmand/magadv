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
	private ExitCreation roomList;
	
	
	public RoomCreation(){
		
		//tour
		tour = new Room("tour","Salle initiale ou se trouve notre licorne");
		tour.addExit("DOWN", roomList.getAllDoor().get(0));
		listRoom.add(tour);
		
		//cour
		cour = new Room("cour","cour principale du chateau");
		cour.addExit("UP", roomList.getAllDoor().get(2));
		cour.addExit("NORTH", roomList.getAllDoor().get(3));
		cour.addExit("EAST", roomList.getAllDoor().get(4));
		cour.addExit("DOWN", roomList.getAllDoor().get(5));
		listRoom.add(cour);
		
		//reserve
		reserve = new Room("reserve","");
		reserve.addExit("UP", roomList.getAllDoor().get(7));
		listRoom.add(reserve);
		
		//ecurie
		ecurie = new Room("Ecurie","Dans cette ecurie il y a des chevaux");
		ecurie.addExit("SOUTH", roomList.getAllDoor().get(6));
		listRoom.add(ecurie);
		
		//salle banquet 
		salleBanquet = new Room ("Salle du banquet","Salle de banquet avec beaucoup beaucoup beaucoup de personnes");
		salleBanquet.addExit("EAST",roomList.getAllDoor().get(9));
		salleBanquet.addExit("SOUTH",roomList.getAllDoor().get(10));
		salleBanquet.addExit("WEST",roomList.getAllDoor().get(8));
		listRoom.add(salleBanquet);
		
		//Salle trone 
		salleTrone = new Room ("Salle du trone","La ou la mechante reine vous attend");
		salleTrone.addExit("WEST", roomList.getAllDoor().get(14));
		listRoom.add(salleTrone);
		
		//Vestibule 
		vestibule = new Room ("Vestibule","Les gardes sont la pour botter ton petiit cul");
		vestibule.addExit("EAST", roomList.getAllDoor().get(13));
		vestibule.addExit("WEST", roomList.getAllDoor().get(12));
		listRoom.add(vestibule);
		
		//Prison 
		prison = new Room ("Prison","Ceci est la piece ou tu perd tout et tu pleure!!!"); 
		prison.addExit("WEST", roomList.getAllDoor().get(1));
		listRoom.add(prison);
		
		//cuisine
		cuisine = new Room ("Cuisine","Ceci est la piece ou tout sens bon et ou tu peut prendre des kilos");
		cuisine.addExit("NORTH", roomList.getAllDoor().get(11));	
		listRoom.add(cuisine);
	}
	
	public ArrayList<Room> getAllRooms()
	{
		return listRoom; 
		
	}
	
	
	
}
