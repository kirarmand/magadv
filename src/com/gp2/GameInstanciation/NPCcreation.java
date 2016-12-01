package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;
import java.util.Arrays;

//class for creation of all NPC
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
	
	private ArrayList<DialogueManager> otisSentences, unicornSentences, guestSentences;
	private ArrayList<DialogueManager> villager1Sentences, villager2Sentences, villager3Sentences, villager4Sentences;
	private ArrayList<DialogueManager> guard1Sentences, guard2Sentences, guard3Sentences, guard4Sentences;
	private ArrayList<DialogueManager> throneGuard1Sentences;
	private ArrayList<DialogueManager> throneGuard2Sentences;
	private ArrayList<DialogueManager> queenCounselSentences;
	private ArrayList<DialogueManager> queenSentences;
	private ArrayList<DialogueManager> kitchenHelpSentences, kitchenChefSentences, saucierSentences;
	private ArrayList<DialogueManager> thiefSentences, blueberryChestSentences, raspberryChestSentences, emptyChestSentences, whiteChocolateChestSentences;

	//room
	private RoomCreation roomCr;
	/**
	 * Creation of all game NPC
	*/
	public void NPCCreation(){
		
		//Unicorn
		DialogueManager dialogueManagerUnicorn = new DialogueManager(new DialogueStage("Snif snif"));
		dialogueManagerUnicorn .addDialogueStage(new DialogueStage("someone stole my horne"));
		dialogueManagerUnicorn .addDialogueStage(new DialogueStage("I was quietly floundering in the water when a pervert, sadistic and psychopath\n"
				+ "took my beautiful, sumptuous, flamboyant horn !"));
		dialogueManagerUnicorn .addDialogueStage(new DialogueStage("Please, find it for me !!"));
		unicornSentences.add(dialogueManagerUnicorn );
		unicorn = new NPC("Coro", "The castle guardian", unicornSentences);
		
		//Otis
		DialogueManager dialogueManagerOtis = new DialogueManager(new DialogueStage("Snif snif"));
		dialogueManagerOtis.addDialogueStage(new DialogueStage("Mais, vous savez, moi je ne crois pas \n"
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
				+ " j\'ai pu ; et je dis merci a la vie, je lui dis merci,\n"
				+ " je chante la vie, je danse la vie... Je ne suis qu\'amour ! \n"
				+ "Et finalement, quand beaucoup de gens aujourd\'hui me disent \n"
				+ "\"Mais comment fais-tu pour avoir cette humanite ?\",\n"
				+ " eh ben je leur reponds tres simplement, je leur dis\n"
				+ " que c\'est ce gout de l\'amour, ce gout donc qui\n"
				+ " m\'a pousse aujourd\'hui a entreprendre une\n"
				+ " construction mecanique, mais demain, qui sait, \n"
				+ "peut-etre seulement a me mettre au service de la communaute,\n"
				+ " a faire le don, le don de soi..."));
		otisSentences.add(dialogueManagerOtis);
		otis = new NPC("Otis"," Villager who gives the purpose of the game and the sense of life", otisSentences);
		
		//In the banquet hall
		
		//Guest
		DialogueManager dialogueManagerGuest = new DialogueManager(new DialogueStage("Hello!"));
		dialogueManagerGuest.addDialogueStage(new DialogueStage("someone stole my horne"));
		dialogueManagerGuest .addDialogueStage(new DialogueStage("I am very honored to see the savior of our dear unicorn!"));
		dialogueManagerGuest .addDialogueStage(new DialogueStageChoice("Do you want to see the queen ?",new ArrayList<>(Arrays.asList("yes","no")),0));

		DialogueManager dialogueManagerGuest2 = new DialogueManager(new DialogueStageGiveObject("Here i have the 'laisser-passer A38', it can help you in your quest. \n"
				+ "Good Luck",new ItemCreation().getA38()));
		guestSentences.add(dialogueManagerGuest);
		guestSentences.add(dialogueManagerGuest2);
		guest = new NPC("Coro", "The castle guardian", guestSentences);

///////************* A REFAIRE *******************

		//villager 1
		DialogueManager dialogueManagerVillager1 = new DialogueManager(new DialogueStage("Hello!"));
		dialogueManagerVillager1.addDialogueStage(new DialogueStage("Go see my friend Otis in the courtyard, he will gives you the meaning of this game"));
		villager1Sentences.add(dialogueManagerVillager1);
		villager1 = new NPC("Edwin", "Villager : Lets get the sense of the game", villager1Sentences);



		//villager 2
		DialogueManager dialogueManagerVillager2 = new DialogueManager(new DialogueStage("I saw someone go in the stable,"));
		dialogueManagerVillager2.addDialogueStage(new DialogueStage("I saw someone go in the stable,\n"
				+ "he seemed hurried \n"
				+ "and suspect. Have you seen my... \n"
				+ "spoon ?"));
		villager2Sentences.add(dialogueManagerVillager2);
		villager2 = new NPC("Theodore", "Villager : Gives an indication of the thief", villager2Sentences);

		//villager 3
		DialogueManager dialogueManagerVillager3 = new DialogueManager(new DialogueStage("Hello!"));
		dialogueManagerVillager3.addDialogueStage(new DialogueStage("Such a nice banquet, it is the season of the berries, what to cook..."));
		villager3Sentences.add(dialogueManagerVillager3);
		villager3 = new NPC("Brunissen", "Villager : Gives a hint for the next steps", villager3Sentences);

		//villager 4
		DialogueManager dialogueManagerVillager4 = new DialogueManager(new DialogueStage("Hello!"));
		dialogueManagerVillager4.addDialogueStage(new DialogueStage("I guess the stable is closed. The Queen may have the key"));
		villager4Sentences.add(dialogueManagerVillager4);
		villager4 = new NPC("Adelaide", "Give an indication for next steps", villager4Sentences);

		
		//In the vestibule

		//guard 1
		DialogueManager dialogueManagerGuard1 = new DialogueManager(new DialogueStage("Do you want to see the queen ? \n"));
		dialogueManagerGuard1.addDialogueStage(new DialogueStage("someone stole my horne"));
		dialogueManagerGuard1 .addDialogueStage(new DialogueStageChoice("Do you have the 'laisser-passer A38' ?",new ArrayList<>(Arrays.asList("yes","no")),0));
		DialogueManager dialogueManagerGuard12 = new DialogueManager (new DialogueStage("Go , but we keep an eye on you !"));
		DialogueManager dialogueManagerGuard13 = new DialogueManager(new DialogueStageExitJail("And you think that we will let you pass without authorization!\n"
				+ "Go in jail, beggar !",new Exit(roomCr.getAllRooms().get(6),roomCr.getAllRooms().get(7))));
		guard1Sentences.add(dialogueManagerGuard1);
		guard1Sentences.add(dialogueManagerGuard12);
		guard1Sentences.add(dialogueManagerGuard13);
		guard1 = new NPC("Alphonse", "Protects the queen from people who bother her", guard1Sentences);


		// guard 2
		DialogueManager dialogueManagerGuard2 = new DialogueManager(new DialogueStage("..."));
		guard2Sentences.add(dialogueManagerGuard2);
		guard2 = new NPC("Amori", "Monitors all the actions of passers-by ", guard2Sentences);

		// guard 3
		DialogueManager dialogueManagerGuard3 = new DialogueManager(new DialogueStage("..."));
		guard3Sentences.add(dialogueManagerGuard3);
		guard3 = new NPC("Amora", "Monitors all the actions of passers-by ", guard2Sentences);

		//guard 4
		DialogueManager dialogueManagerGuard4 = new DialogueManager(new DialogueStage("..."));
		guard4Sentences.add(dialogueManagerGuard4);
		guard4 = new NPC("granola", "Monitors all the actions of passers-by ", guard2Sentences);

		//In the throne hall
		DialogueManager dialogueManagerThroneGuard1 = new DialogueManager(new DialogueStage("The murderer, he wanted to kill our queen with raspberry !!\n"));
		DialogueManager dialogueManagerThroneGuard12 =new DialogueManager (new DialogueStageExitJail("Cassius, send up this man in jail !",new Exit(roomCr.getAllRooms().get(6),roomCr.getAllRooms().get(7))));
		throneGuard1Sentences.add(dialogueManagerThroneGuard1);
		throneGuard1Sentences.add(dialogueManagerThroneGuard12);
		throneGuard1 = new NPC("Boniface", "Be careful of what you do ...", throneGuard1Sentences);

		//throneGuard 2
		DialogueManager dialogueManagerThroneGuard2 = new DialogueManager(new DialogueStage("..."));
		throneGuard2Sentences.add(dialogueManagerThroneGuard2);
		throneGuard2 = new NPC("Cassius", "Monitors all the actions of passers-by ", throneGuard2Sentences);


		//queenCounsel
		DialogueManager dialogueManagerCounsel1 = new DialogueManager(new DialogueStage("The queen is very hungry, she will not talk so much without \n"
				+ "her favorite cake"));
		DialogueManager dialogueManagerCounsel2 = new DialogueManager(new DialogueStage("Very disturbing events are taking place in the kingdom. \n"
				+ "Only the unicorn can save us ! "));
		queenCounselSentences.add(dialogueManagerCounsel1);
		queenCounselSentences.add(dialogueManagerCounsel2);
		queenCounsel = new NPC("Bertille", "She advises on what the queen likes eat", queenCounselSentences);

		//Queen
		DialogueManager dialogueManagerQueen1 = new DialogueManager(new DialogueStage("I love blueberries"));
		DialogueManager dialogueManagerQueen2 = new DialogueManager(new DialogueStage("No, no !! How dare you !\n"
				+ "Are you not tired of giving me raspberry \n"
				+ "I can not bear that name! \n"
				+ "I will show you how a queen dies,\n"
				+ "I will show you the direction of the JAIL"));
		DialogueManager dialogueManagerQueen3 = new DialogueManager(new DialogueStage("OOOOh a blueberries cake, my favorite flavour ! \n"
				+ "Take ,brave knight, the key of the stable. \n"
				+ "But quickly, the thief is leaving !"));
		queenSentences.add(dialogueManagerQueen1);
		queenSentences.add(dialogueManagerQueen2);
		queenSentences.add(dialogueManagerQueen3);
		queen = new NPC("Bertille", "She advises on what the queen likes eat", queenSentences);

		//kitchenHelp
		DialogueManager dialogueManagerKitchenHelp1= new DialogueManager(new DialogueStage("You have nothing to do here ! Get out"));
		DialogueManager dialogueManagerKitchenHelp2= new DialogueManager(new DialogueStage("Do you want a cake for the queen ? \n"
				+ "I need : eggs, flour, raspberries, sugar, white chocolate"));
		DialogueManager dialogueManagerKitchenHelp3= new DialogueManager(new DialogueStage("Ah finally someone helpful in this kitchen ! \n"
				+ "Here is the muffin of the queen !"));
		kitchenHelpSentences.add(dialogueManagerKitchenHelp1);
		kitchenHelpSentences.add(dialogueManagerKitchenHelp2);
		kitchenHelpSentences.add(dialogueManagerKitchenHelp3);
		kitchenHelp = new NPC("Linguini", "He is a kitchen helper", kitchenHelpSentences);

		//kitchenChef
		DialogueManager dialogueManagerKitchenChef1= new DialogueManager(new DialogueStage("You have nothing to do here ! Get out"));
		DialogueManager dialogueManagerKitchenChef2= new DialogueManager(new DialogueStage("Do you want a cake for the queen ? \n"
				+ "I need : eggs, flour, blueberries, sugar, white chocolate"));
		DialogueManager dialogueManagerKitchenChef3= new DialogueManager(new DialogueStage("Ah finally someone helpful in this kitchen ! \n"
				+ "Here is the muffin of the queen !"));
		kitchenChefSentences.add(dialogueManagerKitchenChef1);
		kitchenChefSentences.add(dialogueManagerKitchenChef2);
		kitchenChefSentences.add(dialogueManagerKitchenChef3);
		kitchenChef = new NPC("Gusto", "He is a kitchen chef", kitchenChefSentences);

		//saucier
		DialogueManager dialogueManagerSaucier1= new DialogueManager(new DialogueStage("You have nothing to do here ! Get out"));
		DialogueManager dialogueManagerSaucier2= new DialogueManager(new DialogueStage("What do you want? \n"
				+ "Do I look like someone who makes cakes ? \n"
				+ "I am a 'saucier' chef, I'm the one who takes care of sauces.\n"
				+ "Do I look like someone who makes muffins ?  \n"
				+ "Nobody respects people like me ...\n"
				+ "I am the best saucier ever !!"));
		saucierSentences.add(dialogueManagerSaucier1);
		saucierSentences.add(dialogueManagerSaucier2);
		kitchenHelp = new NPC("Linguini", "He is a kitchen helper", saucierSentences);

		//thief
		DialogueManager dialogueManagerThief1= new DialogueManager(new DialogueStage("Do you want to get back your corn ? \n "
				+ "come with me they are totally crazy in this castle \n"
				+ "I will give a lot of money with this corn \n"
				+ "people loves corns of unicorn"));
		dialogueManagerThief1 .addDialogueStage(new DialogueStageChoice("So you come with me to live a king's life, or you stay here in a crap life ?",new ArrayList<>(Arrays.asList("yes","no")),0));
		DialogueManager dialogueManagerThief2= new DialogueManager(new DialogueStage("come on bro ! on horseback !"));
		DialogueManager dialogueManagerThief3= new DialogueManager(new DialogueStage("Stop it ! take your stupid corn and get out of my sight"));
		thiefSentences.add(dialogueManagerThief1);
		thiefSentences.add(dialogueManagerThief2);
		thiefSentences.add(dialogueManagerThief3);
		thief = new NPC("Gusto", "He is a kitchen chef", thiefSentences);

		//blueberryChest
		DialogueManager dialogueManagerBlueberryChest1= new DialogueManager(new DialogueStageInput("To unlock me, answer to this question ... \n"
				+ "As soon as I am called, I do not exist anymore. Who am I ?",new ArrayList<>(Arrays.asList(""))));
		DialogueManager dialogueManagerBlueberryChest2= new DialogueManager(new DialogueStage("Wrong, retry !"));
		DialogueManager dialogueManagerBlueberryChest3= new DialogueManager (new DialogueStageGiveObject("Congratulations, take the bluberries !",new ItemCreation().getBlueberry()));
		blueberryChestSentences.add(dialogueManagerBlueberryChest1);
		blueberryChestSentences.add(dialogueManagerBlueberryChest2);
		blueberryChestSentences.add(dialogueManagerBlueberryChest3);
		blueberryChest = new NPC("Coffre 1", "locked chest", blueberryChestSentences);

		//raspberryChest
		DialogueManager dialogueManagerRaspberryChest1= new DialogueManager(new DialogueStageInput("To unlock me, answer to this question ... \n"
				+ "What is this thing that lengthens in the hands,\n"
				+ " When it is passed between the breasts and when it is inserted into a slot?",new ArrayList<>(Arrays.asList(""))));
		DialogueManager dialogueManagerRaspberryChest2= new DialogueManager(new DialogueStage("Wrong, retry !"));
		DialogueManager dialogueManagerRaspberryChest3= new DialogueManager (new DialogueStageGiveObject("Congratulations, take the raspberries !",new ItemCreation().getRaspberry()));
		raspberryChestSentences.add(dialogueManagerRaspberryChest1);
		raspberryChestSentences.add(dialogueManagerRaspberryChest2);
		raspberryChestSentences.add(dialogueManagerRaspberryChest3);
		raspberryChest = new NPC("Coffre 2", "locked chest", raspberryChestSentences);


		DialogueManager dialogueManagerEmptyChest1= new DialogueManager(new DialogueStageInput("To unlock me, answer to this question ... \n"
				+ "Find what it may be : \n"
				+ "It is better than god \n"
				+ "It is worst than devil\n"
				+ "Poor people have it.\n"
				+ "Rich people needs it\n"
				+ "If we eat it, we die .\n"
				+ "It is faster than the light",new ArrayList<>(Arrays.asList(""))));
		DialogueManager dialogueManagerEmptyChest2 = new DialogueManager(new DialogueStage("Wrong, retry !"));
		DialogueManager dialogueManagerEmptyChest3 = new DialogueManager(new DialogueStage("Congratulation, you get the solution"));
		emptyChestSentences.add(dialogueManagerEmptyChest1);
		emptyChestSentences.add(dialogueManagerEmptyChest2);
		emptyChestSentences.add(dialogueManagerEmptyChest3);
		emptyChest = new NPC("Coffre 3", "locked chest", emptyChestSentences);

		DialogueManager dialogueManagerwhiteChocolateChest1= new DialogueManager(new DialogueStageInput("To unlock me, answer to this question ... \n"
				+ "The bigger I am, the less you see me. Who am I ?",new ArrayList<>(Arrays.asList(""))));
		DialogueManager dialogueManagerwhiteChocolateChest2 = new DialogueManager(new DialogueStage("Wrong, retry !"));
		DialogueManager dialogueManagerwhiteChocolateChest3 = new DialogueManager(new DialogueStageGiveObject("Congratulation, take the white chocolate",new ItemCreation().getWhiteChocolate()));
		whiteChocolateChestSentences.add(dialogueManagerwhiteChocolateChest1);
		whiteChocolateChestSentences.add(dialogueManagerwhiteChocolateChest2);
		whiteChocolateChestSentences.add(dialogueManagerwhiteChocolateChest3);
		whiteChocolateChest = new NPC("Coffre 4", "locked chest", whiteChocolateChestSentences);
		}
}
