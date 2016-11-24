package com.gp2.GameInstanciation;

import com.gp2.component.*;
import java.util.ArrayList;
/**
 * @author group2
 *
 * The item class extends the Entity in order to be carried
 * by our player an Entity must implements the Carriageable
 * interface.
 * So an "item" is the most simple Entity that a Player object
 * is able to carry.
 */

	public class ItemCreation implements Carriageable{

	/**
	 * instanciation of all items
	 */

	private Item framboise;
	private Item myrtille;
	private Item chocolatBlanc;
	private Item A38;
	private Item farine;
	private Item muffinMyrtille;
	private Item muffinFramboise;
	private Item sucre;
	private Item key;
	private Item oeuf;
	private Item corne;
	private Item courgette;
	private Item carotte;
	private Item lait;

	public void itemCreation(){

		// instanciate item framboise
		framboise = new Item ("framboise","Fruit comestible du framboisier, drupe arrondie, formee de nombreux petits grains (drupeoles). [On l'utilise pour fabriquer des jus de fruits, des sirops, des confitures, des sorbets, des liqueurs.]");

		//instanciate item myrtille
		myrtille = new Item ("myrtille","Nom commun d'une airelle qui pousse en Europe sur les montagnes humides et dont les baies, bleu-noir a maturite, sont consommees fraiches, en confitures ou en sorbet et servent a la fabrication de sirops et d'eaux-de-vie.");

		//instanciate item chocolat blanc
		chocolatBlanc = new Item("chocolat blanc","est un melange de beurre de cacao, de sucre et de lait.");

		//instanciate item A38
		A38 = new Item ("laisser-passer A38","allez voir l'huissier dans asterix et les 12 travaux pour plus d'informations.");

		//instanciate item farine
		farine = new Item("farine","Produit pulverulent provenant de la mouture des grains de ble et d'autres cereales ou de certaines legumineuses.");

		//instanciate item muffinMyrtille
		muffinMyrtille = new Item("muffin a la myrtille","Petit pain rond a base de myrtille au lait. (Specialite britannique.)");

		//instanciate item muffinFramboise
		muffinFramboise = new Item("muffin a la framboise","Petit pain rond a base de framboise au lait. (Specialite britannique.)");

		//instanciate item sucre
		sucre = new Item("sucre","Produit alimentaire cristallise, blanc ou roux, de saveur douce, qu'on extrait de la canne à sucre et de la betterave sucriere.");

		//instanciate item key
		key = new Item("ponykey","clée de la delivrance.");

		//instanciate item oeuf
		oeuf = new Item("oeuf","Cellule vivante, environnee de reserves alimentaires et d'enveloppes protectrices, et qui, apres formation dans le corps d'une femelle, ponte et fecondation (l'ordre de ces trois phenomenes variant selon le groupe), donnera un jeune de la meme espece. (On parle parfois d'oeuf  chez les especes vivipares, pour designer l'embryon et l'ensemble de ses annexes.)");

		//instanciate item corne
		corne = new Item("corne de Corro","Excroissance dure, pointue et relativement allongee pouvant penetrer le corps de ses adversaires pour se defendre ou servant d'ornement.");

		//instanciate item courgette
		courgette = new Item("courgette","Variete de courge dont les fruits, le plus souvent de forme allongee, sont consommes à un stade tres jeune.");

		//instanciate item carotte
		carotte =  new Item("carotte","Plante cultivee pour sa racine comestible de forme cylindrique, plus ou moins allongee, de couleur rouge. (Il existe aussi des carottes fourrageres a la racine plus volumineuse, blanche ou jaune, ainsi que des carottes sauvages, tres communes dans les pres et au bord des chemins.)");

		//instanciate item lait
		lait = new Item("lait","Liquide blanc, opaque, de saveur légèrement sucrée, constituant un aliment complet et équilibré.");

	}
}
