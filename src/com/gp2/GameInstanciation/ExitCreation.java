package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;

public class ExitCreation {
	private Exit Door_TC;
	private Exit Door_PT;
	
	private Exit Door_CT;
	private ExitWithItem Door_CE;
	private Exit Door_CsB;
	private Exit Door_CR;
	
	private Exit Door_EC;
	
	private Exit Door_RC;
	
	private Exit Door_sBC;
	private Exit Door_sBV;
	private Exit Door_sBCu;
	
	private Exit Door_CusB;
	
	private Exit Door_VsB;
	private Exit Door_VsT;
	
	private Exit Door_sTV;
	
	private RoomCreation roomCr;
	private ItemCreation unlockItem;
	private ArrayList<Exit> exitList;
	
	public ExitCreation(){
		Door_TC = new Exit(roomCr.getAllRooms().get(0),roomCr.getAllRooms().get(1));
		exitList.add(Door_TC);
		Door_PT = new Exit(roomCr.getAllRooms().get(7),roomCr.getAllRooms().get(0));
		exitList.add(Door_PT);
		
		Door_CT = new Exit(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(0));
		exitList.add(Door_CT);
		Door_CE = new ExitWithItem(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(3),unlockItem.getKey());
		exitList.add(Door_CE);
		Door_CsB = new Exit(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(4));
		exitList.add(Door_CsB);
		Door_CR = new Exit(roomCr.getAllRooms().get(1),roomCr.getAllRooms().get(2));
		exitList.add(Door_CR);
		
		Door_EC = new Exit(roomCr.getAllRooms().get(0),roomCr.getAllRooms().get(1));
		exitList.add(Door_EC);
		
		Door_RC = new Exit(roomCr.getAllRooms().get(3),roomCr.getAllRooms().get(1));
		exitList.add(Door_RC);
		
		Door_sBC = new Exit(roomCr.getAllRooms().get(4),roomCr.getAllRooms().get(1));
		exitList.add(Door_sBC);
		Door_sBV = new Exit(roomCr.getAllRooms().get(4),roomCr.getAllRooms().get(6));
		exitList.add(Door_sBV);
		Door_sBCu = new Exit(roomCr.getAllRooms().get(4),roomCr.getAllRooms().get(8));
		exitList.add(Door_sBCu);
		
		Door_CusB = new Exit(roomCr.getAllRooms().get(8),roomCr.getAllRooms().get(4));
		exitList.add(Door_CusB);
		
		Door_VsB = new Exit(roomCr.getAllRooms().get(6),roomCr.getAllRooms().get(4));
		exitList.add(Door_VsB);
		Door_VsT = new Exit(roomCr.getAllRooms().get(6),roomCr.getAllRooms().get(5));
		exitList.add(Door_VsT);
		
		Door_sTV = new Exit(roomCr.getAllRooms().get(5),roomCr.getAllRooms().get(6));
		exitList.add(Door_sTV);
	}
	
	public ArrayList<Exit> getAllDoor(){
		return exitList;
	}
}

