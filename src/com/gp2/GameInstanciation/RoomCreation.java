package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;

/**
 * This class create the different rooms of the game
 * @author group2
 *
 */
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
	
	// Tableau qui contiendra toutes les pieces du jeu
	private ArrayList<Room> listRoom; 
	private ExitCreation roomList;
	
	
	public RoomCreation(){
		
		//Creation de la tour
		tour = new Room("tour","Salle initiale ou se trouve notre licorne");
		//Ajout des portes a la piece
		tour.addExit("DOWN", roomList.getAllDoor().get(0));
		//Ajout de la piece au tableau
		listRoom.add(tour);
		
		//Creation de la cour
		cour = new Room("cour","cour principale du chateau");
		//Ajout des portes a la piece
		cour.addExit("UP", roomList.getAllDoor().get(2));
		cour.addExit("NORTH", roomList.getAllDoor().get(3));
		cour.addExit("EAST", roomList.getAllDoor().get(4));
		cour.addExit("DOWN", roomList.getAllDoor().get(5));
		//Ajout de la piece au tableau
		listRoom.add(cour);
		
		// Creation de la reserve
		reserve = new Room("reserve","");
		//Ajout des portes a la piece
		reserve.addExit("UP", roomList.getAllDoor().get(7));
		//Ajout de la piece au tableau
		listRoom.add(reserve);
		
		//Creation de l'ecurie
		ecurie = new Room("Ecurie","Dans cette ecurie il y a des chevaux");
		//Ajout des portes a la piece
		ecurie.addExit("SOUTH", roomList.getAllDoor().get(6));
		//Ajout de la piece au tableau
		listRoom.add(ecurie);
		
		//Creation de la salle banquet 
		salleBanquet = new Room ("Salle du banquet","Salle de banquet avec beaucoup beaucoup beaucoup de personnes");
		//Ajout des portes a la piece
		salleBanquet.addExit("EAST",roomList.getAllDoor().get(9));
		salleBanquet.addExit("SOUTH",roomList.getAllDoor().get(10));
		salleBanquet.addExit("WEST",roomList.getAllDoor().get(8));
		//Ajout de la piece au tableau
		listRoom.add(salleBanquet);
		
		//Creation de la Salle trone 
		salleTrone = new Room ("Salle du trone","La ou la mechante reine vous attend");
		//Ajout des portes a la piece
		salleTrone.addExit("WEST", roomList.getAllDoor().get(14));
		//Ajout de la piece au tableau
		listRoom.add(salleTrone);
		
		//Creation du Vestibule 
		vestibule = new Room ("Vestibule","Les gardes sont la pour botter ton petiit cul");
		//Ajout des portes a la piece
		vestibule.addExit("EAST", roomList.getAllDoor().get(13));
		vestibule.addExit("WEST", roomList.getAllDoor().get(12));
		//Ajout de la piece au tableau
		listRoom.add(vestibule);
		
		//Creation de la Prison 
		prison = new Room ("Prison","Ceci est la piece ou tu perd tout et tu pleure!!!"); 
		//Ajout des portes a la piece
		prison.addExit("WEST", roomList.getAllDoor().get(1));
		//Ajout de la piece au tableau
		listRoom.add(prison);
		
		//Creation de la cuisine
		cuisine = new Room ("Cuisine","Ceci est la piece ou tout sens bon et ou tu peut prendre des kilos");
		//Ajout des portes a la piece
		cuisine.addExit("NORTH", roomList.getAllDoor().get(11));
		//Ajout de la piece au tableau
		listRoom.add(cuisine);
	}
	
	public ArrayList<Room> getAllRooms()
	{
		return listRoom; 
		
	}
	
	
	
}
