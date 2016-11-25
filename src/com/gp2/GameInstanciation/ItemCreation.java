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

	public class ItemCreation{


    //creation of all attributes
	private Item raspberry;
	private Item blueberry;
	private Item whiteChocolate;
	private Item A38;
	private Item flour;
	private Item blueberryMuffin;
	private Item raspberryMuffin;
	private Item sugar;
	private Item key;
	private Item egg;
	private Item horn;
	private Item zucchini;
	private Item carrot;
	private Item milk;

	//creation of all getters
	public Item getRaspberry() {
		return raspberry;
	}

	public Item getBlueberry() {
		return blueberry;
	}

	public Item getWhiteChocolate() {
		return whiteChocolate;
	}

	public Item getA38() {
		return A38;
	}

	public Item getFlour() {
		return flour;
	}

	public Item getBlueberryMuffin() {
		return blueberryMuffin;
	}

	public Item getRaspberryMuffin() {
		return raspberryMuffin;
	}

	public Item getSugar() {
		return sugar;
	}

	public Item getKey() {
		return key;
	}

	public Item getEgg() {
		return egg;
	}

	public Item getHorn() {
		return horn;
	}

	public Item getZucchini() {
		return zucchini;
	}

	public Item getCarrot() {
		return carrot;
	}

	public Item getMilk() {
		return milk;
	}

    /**
     * instanciation of all items
     */
	public ItemCreation(){

		// instanciate item framboise
		raspberry = new Item ("framboise","Fruit comestible du framboisier, drupe arrondie, formee de nombreux petits grains (drupeoles). [On l'utilise pour fabriquer des jus de fruits, des sirops, des confitures, des sorbets, des liqueurs.]");

		//instanciate item myrtille
		blueberry = new Item ("myrtille","Nom commun d'une airelle qui pousse en Europe sur les montagnes humides et dont les baies, bleu-noir a maturite, sont consommees fraiches, en confitures ou en sorbet et servent a la fabrication de sirops et d'eaux-de-vie.");

		//instanciate item chocolat blanc
		whiteChocolate = new Item("chocolat blanc","est un melange de beurre de cacao, de sucre et de lait.");

		//instanciate item A38
		A38 = new Item ("laisser-passer A38","allez voir l'huissier dans asterix et les 12 travaux pour plus d'informations.");

		//instanciate item farine
		flour = new Item("farine","Produit pulverulent provenant de la mouture des grains de ble et d'autres cereales ou de certaines legumineuses.");

		//instanciate item muffinMyrtille
		blueberryMuffin = new Item("muffin a la myrtille","Petit pain rond a base de myrtille au lait. (Specialite britannique.)");

		//instanciate item muffinFramboise
		raspberryMuffin = new Item("muffin a la framboise","Petit pain rond a base de framboise au lait. (Specialite britannique.)");

		//instanciate item sucre
		sugar = new Item("sucre","Produit alimentaire cristallise, blanc ou roux, de saveur douce, qu'on extrait de la canne à sucre et de la betterave sucriere.");

		//instanciate item key
		key = new Item("ponykey","clee de la delivrance.");

		//instanciate item oeuf
		egg = new Item("oeuf","Cellule vivante, environnee de reserves alimentaires et d'enveloppes protectrices, et qui, apres formation dans le corps d'une femelle, ponte et fecondation (l'ordre de ces trois phenomenes variant selon le groupe), donnera un jeune de la meme espece. (On parle parfois d'oeuf  chez les especes vivipares, pour designer l'embryon et l'ensemble de ses annexes.)");

		//instanciate item corne
		horn = new Item("corne de Corro","Excroissance dure, pointue et relativement allongee pouvant penetrer le corps de ses adversaires pour se defendre ou servant d'ornement.");

		//instanciate item courgette
		zucchini = new Item("courgette","Variete de courge dont les fruits, le plus souvent de forme allongee, sont consommes à un stade tres jeune.");

		//instanciate item carotte
		carrot =  new Item("carotte","Plante cultivee pour sa racine comestible de forme cylindrique, plus ou moins allongee, de couleur rouge. (Il existe aussi des carottes fourrageres a la racine plus volumineuse, blanche ou jaune, ainsi que des carottes sauvages, tres communes dans les pres et au bord des chemins.)");

		//instanciate item lait
		milk = new Item("lait","Liquide blanc, opaque, de saveur légèrement sucrée, constituant un aliment complet et équilibré.");

	}
}
