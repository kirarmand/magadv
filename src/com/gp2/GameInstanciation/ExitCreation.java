package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;

/**
 * This class create the different doors of the game
 * @author group2
 *
 */
public class ExitCreation {
	
	// Toutes les sorties du jeu
	private Exit Door_TC; // porte entre la tour et la cour 
	private Exit Door_PT;  // porte entre la prison et la tour
	
	private Exit Door_CT; //porte entre la cour et la tour
	private ExitWithItem Door_CE; // porte entre la cour et l'ecurie 
	private Exit Door_CsB; // porte entre la cour et la salle de banquet 
	private Exit Door_CR; // porte entre la cour et la reserve
	
	private Exit Door_EC;  // porte entre l'ecurie et la cour 
	
	private Exit Door_RC;  // porte entre la reserve et la cour 
	
	private Exit Door_sBC;  // porte entre la salle de banquet et la cour 
	private Exit Door_sBV;  // porte entre la salle de banquet et le vestibule
	private Exit Door_sBCu;  // porte entre la salle de banquet et la cuisine
	
	private Exit Door_CusB;  // porte entre la cuisine et la salle de  banquet
	
	private Exit Door_VsB;  // porte entre le vestibule et la salle de banquet 
	private Exit Door_VsT;  // porte entre le vestibule et la salle de trone
	
	private Exit Door_sTV;  // porte entre la salle de trone et le vestibule
	
	private RoomCreation roomCr; // Repuration des rooms crees dans la classe RoomCreation
	private ItemCreation unlockItem; // Recuperation des items crees dans la classe ItemCreation
	private ArrayList<Exit> exitList; // Tableau contenant tout les exits
	
	//Creation des differentes sorties du jeu
	public ExitCreation(){
		// creation de la porte entre la tour et la cour. 
		// 0 correspond à la room au rang 0 dans le tableau listRoom cree dans la class RoomCreation : cour. 
		// 1 correspond à la room au rang 1 dans le tableau listRoom cree dans la class RoomCreation : tour. 
		Door_TC = new Exit(roomCr.getAllRooms().get(0),roomCr.getAllRooms().get(1));
		//Ajout de la porte au tableau
		exitList.add(Door_TC);
		
		// Porte entre la prison et la tour
		Door_PT = new Exit(roomCr.getAllRooms().get(7),roomCr.getAllRooms().get(0));
		//Ajout de la porte au tableau
		exitList.add(Door_PT);
		
		//porte entre la cour et la tour
		Door_CT = new Exit(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(0));
		//Ajout de la porte au tableau
		exitList.add(Door_CT);
		
		// porte entre la cour et l'ecurie 
		// Porte qui necessite un item
		Door_CE = new ExitWithItem(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(3),unlockItem.getKey());
		//Ajout de la porte au tableau
		exitList.add(Door_CE);
		
		// porte entre la cour et la salle de banquet
		Door_CsB = new Exit(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(4));
		//Ajout de la porte au tableau
		exitList.add(Door_CsB);
		
		// porte entre la cour et la reserve
		Door_CR = new Exit(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(2));
		//Ajout de la porte au tableau
		exitList.add(Door_CR);
		
		// porte entre l'ecurie et la cour
		Door_EC = new Exit(roomCr.getAllRooms().get(0),roomCr.getAllRooms().get(1));
		//Ajout de la porte au tableau
		exitList.add(Door_EC);
		
		// porte entre la reserve et la cour 
		Door_RC = new Exit(roomCr.getAllRooms().get(3),roomCr.getAllRooms().get(1));
		//Ajout de la porte au tableau
		exitList.add(Door_RC);
		
		// porte entre la salle de banquet et la cour 
		Door_sBC = new Exit(roomCr.getAllRooms().get(4),roomCr.getAllRooms().get(1));
		//Ajout de la porte au tableau
		exitList.add(Door_sBC);
		
		// porte entre la salle de banquet et le vestibule
		Door_sBV = new Exit(roomCr.getAllRooms().get(4),roomCr.getAllRooms().get(6));
		//Ajout de la porte au tableau
		exitList.add(Door_sBV);
		
		// porte entre la salle de banquet et la cuisine
		Door_sBCu = new Exit(roomCr.getAllRooms().get(4),roomCr.getAllRooms().get(8));
		//Ajout de la porte au tableau
		exitList.add(Door_sBCu);
		
		// porte entre la cuisine et la salle de  banquet
		Door_CusB = new Exit(roomCr.getAllRooms().get(8),roomCr.getAllRooms().get(4));
		//Ajout de la porte au tableau
		exitList.add(Door_CusB);
		
		// porte entre le vestibule et la salle de banquet 
		Door_VsB = new Exit(roomCr.getAllRooms().get(6),roomCr.getAllRooms().get(4));
		//Ajout de la porte au tableau
		exitList.add(Door_VsB);
		
		// porte entre le vestibule et la salle de trone
		Door_VsT = new Exit(roomCr.getAllRooms().get(6),roomCr.getAllRooms().get(5));
		//Ajout de la porte au tableau
		exitList.add(Door_VsT);
		
		// porte entre la salle de trone et le vestibule
		Door_sTV = new Exit(roomCr.getAllRooms().get(5),roomCr.getAllRooms().get(6));
		//Ajout de la porte au tableau
		exitList.add(Door_sTV);
	}
	
	public ArrayList<Exit> getAllDoor(){
		return exitList;
	}
}

