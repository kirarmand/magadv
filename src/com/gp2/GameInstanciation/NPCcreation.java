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
	private NPC garde1;
	private NPC garde2;
	private NPC garde3;
	private NPC garde4;
	
	// Salle du trone
	private NPC gardeTrone1;
	private NPC gardeTrone2;
	private NPC reine;
	private NPC conseiller;
	// Cuisine
	private NPC commisCuisine;
	private NPC chef;
	private NPC chefSaucier;
	//Ecurie
	private NPC voleur;
	//Reserve
	private NPC coffreAMyrtille;
	private NPC coffreAFramboise;
	private NPC coffreVide;
	private NPC coffreChocolatBlanc;
	
	private ArrayList<String> otisSentences, unicornSentences, gestSentences;
	private ArrayList<String> invite1Sentences, invite2Sentences, invite3Sentences, invite4Sentences;
	private ArrayList<String> garde1Sentences, garde2Sentences, garde3Sentences, garde4Sentences;
	private ArrayList<String> gardeTrone1Sentences, gardeTrone2Sentences, conseillerSentences, reineSentences;
	private ArrayList<String> commisCuisineSentences, chefSentences, chefSaucierSentences;
	private ArrayList<String> voleurSentences, coffreAMyrtilleSentences, coffreAFramboiseSentences, coffreVideSentences, coffreChocolatBlancSentences;
	
	public void NPCCreation(){
		
		unicorn = new NPC("Coro", "Pleure et veut qu'on lui rende sa corne", unicornSentences);
		unicornSentences.add("Snif Snif");
		unicornSentences.add("On m'a vole ma corne");
		unicornSentences.add("Je patogeais tranquillement dans l'eau quand un pervers, sadique et psychopathe \n"
				+ "dangereux m'a pris m'a magnifique, somptueuse, flambloyante corne !");
		unicornSentences.add("Retrouvez-la moi s'il vous plait !!! ");
		
		
		otis = new NPC("Otis","Va te donner le but du jeu et le sens de la vie", otisSentences);
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
		
		//Dans la salle de banquet
		guest = new NPC("Edouard", "Te donne la possibilite d'avancer dans le jeu", gestSentences);
		gestSentences.add("Bonjour !");
		gestSentences.add("Je suis tres honorer de voir le sauveur de notre chere licorne !");
		gestSentences.add("Veux tu voir la reine ? (O/N) ");
		gestSentences.add("Voici le laisser-passer A38, il vous aidera dans votre quete. \n"
				+ "Bonne chance");
		gestSentences.add("Elle est belle la reine");
		
		invite1 = new NPC("Edwin", "Demande d'aller voir Otis pour connaitre le sens du jeu", invite1Sentences);
		invite1Sentences.add("Bonjour ! \n"
				+ "Allez voir mon ami Otis dans la cours, il vous donnera le sens caché de ce jeu");
		
		invite2 = new NPC("Théodore", "Donne une indication sur le voleur", invite2Sentences);
		invite2Sentences.add("j’ai vu quelqu’un aller dans l’écurie,\n"
				+ " il avait l’air pressé … \n"
				+ "suspect … Vous n’auriez pas vu ma … \n"
				+ "cuillère ?");
		
		invite3 = new NPC("Brunissen", "Donne un indice pour les étapes d'apres", invite3Sentences);
		invite3Sentences.add("quel beau banquet, c’est la saison des baies, que faire à cuisiner...");
		
		invite4 = new NPC("Adelaide", "Donne un indice pour les étapes d'apres", invite4Sentences);
		invite4Sentences.add("je crois que l’ecurie est fermee. La reine doit avoir la clef");
		
		//Dans le vestibule
		garde1 = new NPC("Alphonse", "Laisse passer avec le Laisser-Passer A38, sinon t'ammene en prison", garde1Sentences);
		garde1Sentences.add("Vous voulez voir la reine ? \n"
				+ "Avez-vous le laisser-passer A38 ?");
		garde1Sentences.add("Passez, mais on garde un oeil sur vous !");
		garde1Sentences.add("Et vous pensez que l'on va vous laisser passer sans autorisation ! \n"
				+ "Allez hop, en prison le gueux !");
		
		garde2 = new NPC("Amori", "Surveille tous les faits et gestes des passants ", garde2Sentences);
		garde2Sentences.add("...");	
		
		garde3 = new NPC("Amora", "Surveille tous les faits et gestes des passants ", garde3Sentences);
		garde3Sentences.add("...");
		
		garde4 = new NPC("Granola", "Surveille tous les faits et gestes des passants ", garde4Sentences);
		garde4Sentences.add("...");
		
		//Salle du trone
		gardeTrone1 = new NPC("Boniface", "t'envoie en prison si tu n'a pas le bon gateau ", gardeTrone1Sentences);
		gardeTrone1Sentences.add("L'assassin, il a voulu tuer notre reine avec de la framboise !! \n"
				+ "Cassius, amene au cachot le misérable !");
		
		gardeTrone2 = new NPC("Cassius", "Surveille tous les faits et gestes des passants ", gardeTrone2Sentences);
		gardeTrone2Sentences.add("...");
		
		conseiller = new NPC("Bertille", "Il conseille sur ce que voudra la reine a manger", conseillerSentences);
		conseillerSentences.add("La reine a tres faim, elle ne parlera pas tant \n"
				+ "qu'elle n'aura pas son gateau prefere");
		conseillerSentences.add("Des evenements tres inquietants se passent dans le royaume. \n"
				+ "Seule la licorne pourrait nous sauver ! ");
		
		reine = new NPC("Framboise", "donne la clef de l'ecurie si bon gateau", reineSentences);
		reineSentences.add("J'adore les myrtilles");
		reineSentences.add("Non, non !!! Comment osez-vous \n"
				+ "Vous n'en avez pas marre de me donner des framboise \n"
				+ "j'en ai assez avec mon prenom ! \n"
				+ "Chercheur venu de loin pour m'accabler de haine,\n"
				+ " je saurais vous montrer comment meurt une reine,\n"
				+ " je saurais vous montrer… LA DIRECTION DE LA PRISON");
		reineSentences.add("OOOOh myrtille mon prefere ! \n"
				+ "Tenez brave chevalier, la clef de l'ecurie. \n"
				+ "mais faites vite le voleur va partir !");
		
		commisCuisine = new NPC("Linguini", "Ceci est un commis de cuisine", commisCuisineSentences);
		commisCuisineSentences.add("Vous n'avez rien a faire ici ! Sortez");
		commisCuisineSentences.add("Vous voulez un gateau pour la reine ? \n"
				+ "il me faut : des oeufs, de la farine, des framboises, du sucre, du chocolat blanc");
		commisCuisineSentences.add("Ah quelqu'un de serviable dans cette cuisine ! \n"
				+ "voici le muffin de la reine ! ");
		
		chef = new NPC("Gusto", "Il est le chef du chateau", chefSentences);
		chefSentences.add("Vous n'avez rien a faire ici ! Sortez");
		chefSentences.add("Vous voulez un gateau pour la reine ? \n"
				+ "il me faut : des oeufs, de la farine, des myrtilles, du sucre, du chocolat blanc");
		chefSentences.add("Ah enfin quelqu'un de serviable dans cette cuisine ! \n"
				+ "voici le muffin de la reine ! ");

		chefSaucier = new NPC("Lalo", "Est le chef saucier du chateau", chefSaucierSentences);
		chefSaucierSentences.add("Vous n'avez rien a faire ici ! Sortez");
		chefSaucierSentences.add("Vous voulez quoi ? \n"
				+ "j'ai une tete à faire des gateau ?\n"
				+ "je suis un chef saucier, c'est moi qui m'occupe des sauces de daube, de ragout, de bouillon\n"
				+ "j'ai une tete a faire des muffins ? \n"
				+ "personne ne respecte les personnes comme moi ... \n"
				+ "je suis le meilleur dans tout le conté !!!");
		
		voleur = new NPC("Jackouille", "Le voleur de corne", voleurSentences);
		voleurSentences.add("Tu veux recuperer la corne ? \n "
				+ "allez viens ce sont des fous dans ce chateau \n"
				+ "je part me faire plein d’argent avec cette corne \n"
				+ "les gens ils adorent les cornes de licorne");
		voleurSentences.add("Alors tu viens avec moi vivre une vie de roi, ou tu reste là ?! (O/N)");
		voleurSentences.add("Allons y gaiement !! A cheval camarade !");
		voleurSentences.add("Aie ! arrete, arrete, tiens prend la ta licorne");
		
		
		coffreAMyrtille = new NPC("Coffre 1", "Coffre verrouille", coffreAMyrtilleSentences);
		coffreAMyrtilleSentences.add("Pour m'ouvrir, repond a l'enigme suivante ... \n"
				+ "Sitôt que l’on me nomme je n’existe plus. Qui suis-je ?");
		coffreAMyrtilleSentences.add("Faux. Recommencez !");
		coffreAMyrtilleSentences.add("Felicitation, voici les myrtilles !");

		coffreAFramboise = new NPC("Coffre 2", "Coffre verrouille", coffreAFramboiseSentences);
		coffreAFramboiseSentences.add("Pour m'ouvrir, repond a l'enigme suivante ...\n"
				+ "Quelle est cette chose qui s'allonge quand on la prend entre les mains,\n"
				+ " quand on la passe entre les seins et quand on l'introduit dans une fente ?");
		coffreAFramboiseSentences.add("Faux. Recommencez !");
		coffreAFramboiseSentences.add("Felicitation, voici les framboises !");
	
		coffreVide = new NPC("Coffre 3", "Coffre verrouille", coffreVideSentences);
		coffreVideSentences.add("Pour m'ouvrir, repond a l'enigme suivante ...\n"
				+ "Trouvez ce que cela peut bien être :\n"
				+ "C'est mieux que dieu \n"
				+ "C'est pire que le diable.\n"
				+ "Les pauvres en ont.\n"
				+ "Les riches en ont besoin.\n"
				+ "Et si on en mange, on meurt.\n"
				+ "Plus rapide que la lumière");
		coffreVideSentences.add("Faux. Recommencez !");
		coffreVideSentences.add("Felicitation vous avez récuperer la solution !");
		
		coffreChocolatBlanc = new NPC("Coffre 4", "Coffre verrouille", coffreChocolatBlancSentences);
		coffreChocolatBlancSentences.add("Pour m'ouvrir, repond a l'enigme suivante ...\n"
				+ "Plus je suis grande, moins on me voit. Qui suis-je ?");
		coffreChocolatBlancSentences.add("Faux. Recommencez !");
		coffreChocolatBlancSentences.add("Felicitation, voici le chocolat blanc !");
		
		}
}
