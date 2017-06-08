package PlayerCharacter;

import Component.IComponent;

public interface ICmpHealth extends IComponent {

	public int GetHealth();
	public static void RegisterInterface()
	{
		GetObjectManager().RegisterInterfaceWithComponent(IID_HEALTH, compID);
	}
	
	
	
	
}
