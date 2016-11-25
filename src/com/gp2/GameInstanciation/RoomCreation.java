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
	
	private Room tower;
	private Room courtYard;
	private Room stock;
	private Room stable;
	private Room banquetHall;
	private Room throneHall;
	private Room vestibule;
	private Room jail;
	private Room kitchen;
	
	// Board which contains all game rooms
	private ArrayList<Room> listRoom; 
	//  List of exit 
	private ExitCreation roomList;
	
	
	public RoomCreation(){
		
		// tower creation 
		tower = new Room("tower","Salle initiale ou se trouve notre licorne");
		//addition of doors in room
		tower.addExit("DOWN", roomList.getAllDoor().get(0));
		//addition of room in board
		listRoom.add(tower);
		
		// courtYard creation 
		courtYard = new Room("courtYard","courtYard principale du chateau");
		//addition of doors in room
		courtYard.addExit("UP", roomList.getAllDoor().get(2));
		courtYard.addExit("NORTH", roomList.getAllDoor().get(3));
		courtYard.addExit("EAST", roomList.getAllDoor().get(4));
		courtYard.addExit("DOWN", roomList.getAllDoor().get(5));
		//addition of doors in room
		listRoom.add(courtYard);
		
		// stock creation 
		stock = new Room("stock","");
		//addition of doors in room
		stock.addExit("UP", roomList.getAllDoor().get(7));
		//addition of doors in room
		listRoom.add(stock);
		
		//stable creation
		stable = new Room("stable","Dans cette stable il y a des chevaux");
		//addition of doors in room
		stable.addExit("SOUTH", roomList.getAllDoor().get(6));
		//addition of doors in room
		listRoom.add(stable);
		
		//banquet hall creation 
		banquetHall = new Room ("Salle du banquet","Salle de banquet avec beaucoup beaucoup beaucoup de personnes");
		//addition of doors in room
		banquetHall.addExit("EAST",roomList.getAllDoor().get(9));
		banquetHall.addExit("SOUTH",roomList.getAllDoor().get(10));
		banquetHall.addExit("WEST",roomList.getAllDoor().get(8));
		//addition of doors in room
		listRoom.add(banquetHall);
		
		//throne hall creation  
		throneHall = new Room ("Salle du trone","La ou la mechante reine vous attend");
		//addition of doors in room
		throneHall.addExit("WEST", roomList.getAllDoor().get(14));
		//addition of doors in room
		listRoom.add(throneHall);
		
		//vestibule creation
		vestibule = new Room ("Vestibule","Les gardes sont la pour botter ton petiit cul");
		//addition of doors in room
		vestibule.addExit("EAST", roomList.getAllDoor().get(13));
		vestibule.addExit("WEST", roomList.getAllDoor().get(12));
		//addition of doors in room
		listRoom.add(vestibule);
		
		//jail creation
		jail = new Room ("jail","Ceci est la piece ou tu perd tout et tu pleure!!!"); 
		//addition of doors in room
		jail.addExit("WEST", roomList.getAllDoor().get(1));
		//addition of doors in room
		listRoom.add(jail);
		
		//kitchen creation
		kitchen = new Room ("kitchen","Ceci est la piece ou tout sens bon et ou tu peut prendre des kilos");
		//addition of doors in room
		kitchen.addExit("NORTH", roomList.getAllDoor().get(11));
		//addition of doors in room
		listRoom.add(kitchen);
	}
	
	/**
	 * Method getters which, 
	 * @return the rooms list of the castle
	 */
	
	public ArrayList<Room> getAllRooms()
	{
		return listRoom; 
		
	}
	
	
	
}
