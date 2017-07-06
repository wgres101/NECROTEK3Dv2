package AI.NPCAttitudes;


//attributes: Competent, Honorable, Ruthless, Charismatic, and Loyal
//				Reknown, Scariness, Morality, Agreeableness, and Attractiveness


public class CAttitude {
	
	/*Entity target; //attitude towards a target */
	float valence;
	float potency;
	int months; //game months in terms of half-life
	
	float Decay;			//compute another month's decay
	float Product; //valence * potency
	
	
}
