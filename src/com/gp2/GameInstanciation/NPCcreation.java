package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;

public class NPCcreation {
	
	//NPC
	// Tower
	private NPC unicorn;
	//courtyard
	private NPC otis;
	// banquet hall
	private NPC guest;
	private NPC villager1;
	private NPC villager2;
	private NPC villager3;
	private NPC villager4;
	
	// Vestibule
	private NPC guard1;
	private NPC guard2;
	private NPC guard3;
	private NPC guard4;
	
	// throne hall
	private NPC throneGuard1;
	private NPC throneGuard2;
	private NPC queen;
	private NPC queenCounsel;
	// Kitchen
	private NPC kitchenHelp;
	private NPC kitchenChef;
	private NPC saucier;
	//Stable
	private NPC thief;
	//Stock
	private NPC blueberryChest;
	private NPC raspberryChest;
	private NPC emptyChest;
	private NPC whiteChocolateChest;
	
	private ArrayList<String> otisSentences, unicornSentences, gestSentences;
	private ArrayList<String> villager1Sentences, villager2Sentences, villager3Sentences, villager4Sentences;
	private ArrayList<String> guard1Sentences, guard2Sentences, guard3Sentences, guard4Sentences;
	private ArrayList<String> throneGuard1Sentences, throneGuard2Sentences, queenCounselSentences, queenSentences;
	private ArrayList<String> kitchenHelpSentences, kitchenChefSentences, saucierSentences;
	private ArrayList<String> thiefSentences, blueberryChestSentences, raspberryChestSentences, emptyChestSentences, whiteChocolateChestSentences;
	
	/**
	 * Creation of all game NPC
	*/
	public void NPCCreation(){
		
		unicorn = new NPC("Coro", "The castle guardian", unicornSentences);
		unicornSentences.add("Snif Snif");
		unicornSentences.add("On m'a vole ma corne");
		unicornSentences.add("Je patogeais tranquillement dans l'eau quand un pervers, sadique et psychopathe \n"
				+ "dangereux m'a pris m'a magnifique, somptueuse, flambloyante corne !");
		unicornSentences.add("Retrouvez-la moi s'il vous plait !!! ");
		
		
		otis = new NPC("Otis"," Villager who gives the purpose of the game and the sense of life", otisSentences);
		otisSentences.add("Mais, vous savez, moi je ne crois pas \n"
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
				+ " j\'ai pu ; et je dis merci � la vie, je lui dis merci,\n"
				+ " je chante la vie, je danse la vie... Je ne suis qu\'amour ! \n"
				+ "Et finalement, quand beaucoup de gens aujourd\'hui me disent \n"
				+ "\"Mais comment fais-tu pour avoir cette humanite ?\",\n"
				+ " eh ben je leur reponds tres simplement, je leur dis\n"
				+ " que c\'est ce gout de l\'amour, ce gout donc qui\n"
				+ " m\'a pousse aujourd\'hui a entreprendre une\n"
				+ " construction mecanique, mais demain, qui sait, \n"
				+ "peut-etre seulement a me mettre au service de la communaute,\n"
				+ " a faire le don, le don de soi...");
		
		//Dans la salle de banquet
		guest = new NPC("Edouard", " Invite to the banquet: Gives the opportunity to advance in the game", gestSentences);
		gestSentences.add("Bonjour !");
		gestSentences.add("Je suis tres honorer de voir le sauveur de notre chere licorne !");
		gestSentences.add("Veux tu voir la reine ? (O/N) ");
		gestSentences.add("Voici le laisser-passer A38, il vous aidera dans votre quete. \n"
				+ "Bonne chance");
		gestSentences.add("Elle est belle la reine");
		
		villager1 = new NPC("Edwin", "Villager : Lets get the sense of the game", villager1Sentences);
		villager1Sentences.add("Bonjour ! \n"
				+ "Allez voir mon ami Otis dans la cours, il vous donnera le sens cach� de ce jeu");
		
		villager2 = new NPC("Th�odore", "Villager : Gives an indication of the thief", villager2Sentences);
		villager2Sentences.add("j�ai vu quelqu�un aller dans l��curie,\n"
				+ " il avait l�air press� � \n"
				+ "suspect � Vous n�auriez pas vu ma � \n"
				+ "cuill�re ?");
		
		villager3 = new NPC("Brunissen", "Villager : Gives a hint for the next steps", villager3Sentences);
		villager3Sentences.add("quel beau banquet, c�est la saison des baies, que faire � cuisiner...");
		
		villager4 = new NPC("Adelaide", "Donne un indice pour les �tapes d'apres", villager4Sentences);
		villager4Sentences.add("je crois que l�ecurie est fermee. La reine doit avoir la clef");
		
		//Dans le vestibule
		guard1 = new NPC("Alphonse", "Protects the queen from people who bother her", guard1Sentences);
		guard1Sentences.add("Vous voulez voir la reine ? \n"
				+ "Avez-vous le laisser-passer A38 ?");
		guard1Sentences.add("Passez, mais on garde un oeil sur vous !");
		guard1Sentences.add("Et vous pensez que l'on va vous laisser passer sans autorisation ! \n"
				+ "Allez hop, en prison le gueux !");
		
		guard2 = new NPC("Amori", "Monitors all the actions of passers-by ", guard2Sentences);
		guard2Sentences.add("...");	
		
		guard3 = new NPC("Amora", "Monitors all the actions of passers-by ", guard3Sentences);
		guard3Sentences.add("...");
		
		guard4 = new NPC("Granola", "Monitors all the actions of passers-by ", guard4Sentences);
		guard4Sentences.add("...");
		
		//Salle du trone
		throneGuard1 = new NPC("Boniface", "Be careful of what you do ...", throneGuard1Sentences);
		throneGuard1Sentences.add("L'assassin, il a voulu tuer notre reine avec de la framboise !! \n"
				+ "Cassius, amene au cachot le mis�rable !");
		
		throneGuard2 = new NPC("Cassius", "Monitors all the actions of passers-by ", throneGuard2Sentences);
		throneGuard2Sentences.add("...");
		
		queenCounsel = new NPC("Bertille", "She advises on what the queen likes eat", queenCounselSentences);
		queenCounselSentences.add("La reine a tres faim, elle ne parlera pas tant \n"
				+ "qu'elle n'aura pas son gateau prefere");
		queenCounselSentences.add("Des evenements tres inquietants se passent dans le royaume. \n"
				+ "Seule la licorne pourrait nous sauver ! ");
		
		queen = new NPC("Framboise", "Gives the key to the stable", queenSentences);
		queenSentences.add("J'adore les myrtilles");
		queenSentences.add("Non, non !!! Comment osez-vous \n"
				+ "Vous n'en avez pas marre de me donner des framboise \n"
				+ "j'en ai assez avec mon prenom ! \n"
				+ "Chercheur venu de loin pour m'accabler de haine,\n"
				+ " je saurais vous montrer comment meurt une reine,\n"
				+ " je saurais vous montrer� LA DIRECTION DE LA PRISON");
		queenSentences.add("OOOOh myrtille mon prefere ! \n"
				+ "Tenez brave chevalier, la clef de l'ecurie. \n"
				+ "mais faites vite le voleur va partir !");
		
		kitchenHelp = new NPC("Linguini", "He is a kitchen helper", kitchenHelpSentences);
		kitchenHelpSentences.add("Vous n'avez rien a faire ici ! Sortez");
		kitchenHelpSentences.add("Vous voulez un gateau pour la reine ? \n"
				+ "il me faut : des oeufs, de la farine, des framboises, du sucre, du chocolat blanc");
		kitchenHelpSentences.add("Ah quelqu'un de serviable dans cette cuisine ! \n"
				+ "voici le muffin de la reine ! ");
		
		kitchenChef = new NPC("Gusto", "He is a kitchen chef", kitchenChefSentences);
		kitchenChefSentences.add("Vous n'avez rien a faire ici ! Sortez");
		kitchenChefSentences.add("Vous voulez un gateau pour la reine ? \n"
				+ "il me faut : des oeufs, de la farine, des myrtilles, du sucre, du chocolat blanc");
		kitchenChefSentences.add("Ah enfin quelqu'un de serviable dans cette cuisine ! \n"
				+ "voici le muffin de la reine ! ");

		saucier = new NPC("Lalo", "He is the castle saucier", saucierSentences);
		saucierSentences.add("Vous n'avez rien a faire ici ! Sortez");
		saucierSentences.add("Vous voulez quoi ? \n"
				+ "j'ai une tete � faire des gateau ?\n"
				+ "je suis un chef saucier, c'est moi qui m'occupe des sauces de daube, de ragout, de bouillon\n"
				+ "j'ai une tete a faire des muffins ? \n"
				+ "personne ne respecte les personnes comme moi ... \n"
				+ "je suis le meilleur dans tout le cont� !!!");
		
		thief = new NPC("Jackouille", "He is the corn thief", thiefSentences);
		thiefSentences.add("Tu veux recuperer la corne ? \n "
				+ "allez viens ce sont des fous dans ce chateau \n"
				+ "je part me faire plein d�argent avec cette corne \n"
				+ "les gens ils adorent les cornes de licorne");
		thiefSentences.add("Alors tu viens avec moi vivre une vie de roi, ou tu reste l� ?! (O/N)");
		thiefSentences.add("Allons y gaiement !! A cheval camarade !");
		thiefSentences.add("Aie ! arrete, arrete, tiens prend la ta licorne");
		
		
		blueberryChest = new NPC("Coffre 1", "locked chest", blueberryChestSentences);
		blueberryChestSentences.add("Pour m'ouvrir, repond a l'enigme suivante ... \n"
				+ "Sit�t que l�on me nomme je n�existe plus. Qui suis-je ?");
		blueberryChestSentences.add("Faux. Recommencez !");
		blueberryChestSentences.add("Felicitation, voici les myrtilles !");

		raspberryChest = new NPC("Coffre 2", "locked chest", raspberryChestSentences);
		raspberryChestSentences.add("Pour m'ouvrir, repond a l'enigme suivante ...\n"
				+ "Quelle est cette chose qui s'allonge quand on la prend entre les mains,\n"
				+ " quand on la passe entre les seins et quand on l'introduit dans une fente ?");
		raspberryChestSentences.add("Faux. Recommencez !");
		raspberryChestSentences.add("Felicitation, voici les framboises !");
	
		emptyChest = new NPC("Coffre 3", "locked chest", emptyChestSentences);
		emptyChestSentences.add("Pour m'ouvrir, repond a l'enigme suivante ...\n"
				+ "Trouvez ce que cela peut bien �tre :\n"
				+ "C'est mieux que dieu \n"
				+ "C'est pire que le diable.\n"
				+ "Les pauvres en ont.\n"
				+ "Les riches en ont besoin.\n"
				+ "Et si on en mange, on meurt.\n"
				+ "Plus rapide que la lumi�re");
		emptyChestSentences.add("Faux. Recommencez !");
		emptyChestSentences.add("Felicitation vous avez r�cuperer la solution !");
		
		whiteChocolateChest = new NPC("Coffre 4", "locked chest", whiteChocolateChestSentences);
		whiteChocolateChestSentences.add("Pour m'ouvrir, repond a l'enigme suivante ...\n"
				+ "Plus je suis grande, moins on me voit. Qui suis-je ?");
		whiteChocolateChestSentences.add("Faux. Recommencez !");
		whiteChocolateChestSentences.add("Felicitation, voici le chocolat blanc !");
		
		}
}
