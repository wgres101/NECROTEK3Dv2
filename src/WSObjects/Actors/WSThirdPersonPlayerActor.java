package WSObjects.Actors;

import org.jdom2.Element;

import AI.BitTables.Character.CAIBits;
import AI.BitTables.Character.CAnotherBitTable;
import AI.BitTables.Character.CBIts;
import Actor.PlayerCharacter.IPlayer;
import WSObjects.WSObject;

public class WSThirdPersonPlayerActor extends WSObject implements IPlayer  {

	CAIBits ai_bits = null;
	CBIts bits = null;
	CAnotherBitTable another_bits = null;
	
	
	
	
	public WSThirdPersonPlayerActor(Element e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	
	
}
