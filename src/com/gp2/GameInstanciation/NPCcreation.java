package com.gp2.GameInstanciation;
import com.gp2.component.*;
import java.util.ArrayList;
import java.util.Arrays;

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
	private ArrayList<DialogueManager> throneGuard1Sentences, throneGuard2Sentences, queenCounselSentences, queenSentences;
	private ArrayList<DialogueManager> kitchenHelpSentences, kitchenChefSentences, saucierSentences;
	private ArrayList<DialogueManager> thiefSentences, blueberryChestSentences, raspberryChestSentences, emptyChestSentences, whiteChocolateChestSentences;
	
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
		dialogueManagerGuest .addDialogueStage(new DialogueStageGiveObject("Here i have the 'laisser-passer A38', it can help you in your quest. \n"
				+ "Good Luck",new ItemCreation().getA38()));
		guestSentences.add(dialogueManagerGuest);
		guest = new NPC("Coro", "The castle guardian", guestSentences);

///////************* A REFAIRE *******************
		
		villager1 = new NPC("Edwin", "Villager : Lets get the sense of the game", villager1Sentences);
		villager1Sentences.add("Hello ! \n"
				+ "Go see my friend Otis in the courtyard, he will gives you the meaning of this game");
		
		villager2 = new NPC("Theodore", "Villager : Gives an indication of the thief", villager2Sentences);
		villager2Sentences.add("I saw someone go in the stable,\n"
				+ "he seemed hurried \n"
				+ "and suspect. Have you seen my... \n"
				+ "spoon ?");
		
		villager3 = new NPC("Brunissen", "Villager : Gives a hint for the next steps", villager3Sentences);
		villager3Sentences.add("Such a nice banquet, it is the season of the berries, what to cook...");
		
		villager4 = new NPC("Adelaide", "Give an indication for next steps", villager4Sentences);
		villager4Sentences.add("I guess the stable is closed. The Queen may have the key");
		
		//In the vestibule
		guard1 = new NPC("Alphonse", "Protects the queen from people who bother her", guard1Sentences);
		guard1Sentences.add("Do you want to see the queen ? \n"
				+ "Do you have the 'laisser-passer A38' ?");
		guard1Sentences.add("Go , but we keep an eye on you !");
		guard1Sentences.add("And you think that we will let you pass without authorization!\n"
				+ "Go in jail, beggar !");
		
		guard2 = new NPC("Amori", "Monitors all the actions of passers-by ", guard2Sentences);
		guard2Sentences.add("...");	
		
		guard3 = new NPC("Amora", "Monitors all the actions of passers-by ", guard3Sentences);
		guard3Sentences.add("...");
		
		guard4 = new NPC("Granola", "Monitors all the actions of passers-by ", guard4Sentences);
		guard4Sentences.add("...");
		
		//In the throne hall
		throneGuard1 = new NPC("Boniface", "Be careful of what you do ...", throneGuard1Sentences);
		throneGuard1Sentences.add("The murderer, he wanted to kill our queen with raspberry !!\n"
				+ "Cassius, send up this man in jail !");
		
		throneGuard2 = new NPC("Cassius", "Monitors all the actions of passers-by ", throneGuard2Sentences);
		throneGuard2Sentences.add("...");
		
		queenCounsel = new NPC("Bertille", "She advises on what the queen likes eat", queenCounselSentences);
		queenCounselSentences.add("The queen is very hungry, she will not talk so much without \n"
				+ "her favorite cake");
		queenCounselSentences.add("Very disturbing events are taking place in the kingdom. \n"
				+ "Only the unicorn can save us ! ");
		
		queen = new NPC("Raspberry", "Gives the key to the stable", queenSentences);
		queenSentences.add("I love blueberries");
		queenSentences.add("No, no !! How dare you !\n"
				+ "Are you not tired of giving me raspberry \n"
				+ "I can not bear that name! \n"
				+ "I will show you how a queen dies,\n"
				+ "I will show you the direction of the JAIL");
		queenSentences.add("OOOOh a blueberries cake, my favorite flavour ! \n"
				+ "Take ,brave knight, the key of the stable. \n"
				+ "But quickly, the thief is leaving !");
		
		kitchenHelp = new NPC("Linguini", "He is a kitchen helper", kitchenHelpSentences);
		kitchenHelpSentences.add("You have nothing to do here ! Get out");
		kitchenHelpSentences.add("Do you want a cake for the queen ? \n"
				+ "I need : eggs, flour, raspberries, sugar, white chocolate");
		kitchenHelpSentences.add("Ah finally someone helpful in this kitchen ! \n"
				+ "Here is the muffin of the queen !");
		
		kitchenChef = new NPC("Gusto", "He is a kitchen chef", kitchenChefSentences);
		kitchenChefSentences.add("You have nothing to do here ! Get out");
		kitchenChefSentences.add("Do you want a cake for the queen ? \n"
				+ "I need : eggs, flour, blueberries, sugar, white chocolate");
		kitchenChefSentences.add("Ah finally someone helpful in this kitchen !\n"
				+ "Here is the muffin of the queen ! ");

		saucier = new NPC("Lalo", "He is the castle saucier", saucierSentences);
		saucierSentences.add("You have nothing to do here ! Get out");
		saucierSentences.add("What do you want? \n"
				+ "Do I look like someone who makes cakes ? \n"
				+ "I am a 'saucier' chef, I'm the one who takes care of sauces.\n"
				+ "Do I look like someone who makes muffins ?  \n"
				+ "Nobody respects people like me ...\n"
				+ "I am the best saucier ever !!");
		
		thief = new NPC("Jackouille", "He is the corn thief", thiefSentences);
		thiefSentences.add("Do you want to get back your corn ? \n "
				+ "come with me they are totally crazy in this castle \n"
				+ "I will give a lot of money with this corn \n"
				+ "people loves corns of unicorn");
		thiefSentences.add("So you come with me to live a king's life, or you stay here in a crap life ? (Y/N)");
		thiefSentences.add("come on bro ! on horseback ! ");
		thiefSentences.add("Stop it ! take your stupid corn and get out of my sight");
		
		
		blueberryChest = new NPC("Coffre 1", "locked chest", blueberryChestSentences);
		blueberryChestSentences.add("To unlock me, answer to this question ... \n"
				+ "As soon as I am called, I do not exist anymore. Who am I ?");
		blueberryChestSentences.add("Wrong, retry !");
		blueberryChestSentences.add("Congratulations, take the bluberries !");

		raspberryChest = new NPC("Coffre 2", "locked chest", raspberryChestSentences);
		raspberryChestSentences.add("To unlock me, answer to this question ... \n"
				+ "What is this thing that lengthens in the hands,\n"
				+ " When it is passed between the breasts and when it is inserted into a slot?");
		raspberryChestSentences.add("Wrong, retry !");
		raspberryChestSentences.add("Congratulations, take the raspberries !");
	
		emptyChest = new NPC("Coffre 3", "locked chest", emptyChestSentences);
		emptyChestSentences.add("To unlock me, answer to this question ... \n"
				+ "Find what it may be : \n"
				+ "It is better than god \n"
				+ "It is worst than devil\n"
				+ "Poor people have it.\n"
				+ "Rich people needs it\n"
				+ "If we eat it, we die .\n"
				+ "It is faster than the light");
		emptyChestSentences.add("Wrong, retry !");
		emptyChestSentences.add("Congratulation, you get the solution");
		
		whiteChocolateChest = new NPC("Coffre 4", "locked chest", whiteChocolateChestSentences);
		whiteChocolateChestSentences.add("To unlock me, answer to this question ...\n"
				+ "The bigger I am, the less you see me. Who am I ?");
		whiteChocolateChestSentences.add("Wrong, retry !");
		whiteChocolateChestSentences.add("Congratulation, take the white chocolate");
		
		}
}
