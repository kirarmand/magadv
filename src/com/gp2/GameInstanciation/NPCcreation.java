package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;

public class NPCcreation {
	
	//NPC
	// Tour
	private NPC unicorn;
	//Cour
	private NPC otis;
	// Salle du banquet
	private NPC guest;
	private NPC invite1;
	private NPC invite2;
	private NPC invite3;
	private NPC invite4;
	// Vestibule
	public NPC garde1;
	private NPC garde2;
	private NPC garde3;
	private NPC garde4;
	// Salle du trone
	private NPC gardeTrone;
	private NPC reine;
	private NPC conseiller;
	// Cuisine
	private NPC comisCuisine;
	private NPC chef;
	private NPC chefSaucier;
	//Ecurie
	private NPC voleur;
	//Reserve
	private NPC coffre1;
	private NPC coffre2;
	private NPC coffre3;
	private NPC coffre4;
	
	private ArrayList<String> sentences;
	
	public void NPCCreation(){
		
		otis = new NPC("Otis","Va te donner le but du jeu et le sens de la vie", sentences);
		sentences.add("Mais, vous savez, moi je ne crois pas \n"
				+ "qu'il y ait de bonne ou de mauvaise situation.\n"
				+ " Moi, si je devais resumer ma vie aujourd\'hui \n"
				+ "avec vous, je dirais que c\'est d\'abord des \n"
				+ "rencontres, des gens qui m\'ont tendu la main, \n"
				+ "peut-etre a un moment ou je ne pouvais pas, ou \n"
				+ "j\'etais seul chez moi et c\'est assez curieux \n"
				+ "de se dire que les hasards, les rencontres forgent \n"
				+ " une destinee... Parce que quand on a le gout \n"
				+ "de la chose, quand on a le gout de la chose bien \n"
				+ "faite, le beau geste, parfois on ne trouve pas \n"
				+ "l\'interlocuteur en face, je dirais, le miroir \n"
				+ "qui vous aide a avancer. Or, ce n\'est pas mon \n"
				+ "cas, comme je le disais la, puisque moi au contraire,\n"
				+ " j\'ai pu ; et je dis merci à la vie, je lui dis merci,\n"
				+ " je chante la vie, je danse la vie... Je ne suis qu\'amour ! \n"
				+ "Et finalement, quand beaucoup de gens aujourd\'hui me disent \n"
				+ "\"Mais comment fais-tu pour avoir cette humanite ?\",\n"
				+ " eh ben je leur reponds tres simplement, je leur dis\n"
				+ " que c\'est ce gout de l\'amour, ce gout donc qui\n"
				+ " m\'a pousse aujourd\'hui a entreprendre une\n"
				+ " construction mecanique, mais demain, qui sait, \n"
				+ "peut-etre seulement a me mettre au service de la communaute,\n"
				+ " a faire le don, le don de soi...");
	}


	
}