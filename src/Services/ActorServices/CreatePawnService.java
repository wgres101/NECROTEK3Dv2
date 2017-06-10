package Services.ActorServices;

import MessageManagement.Message;
import SchedulingManager.EEventMachine;

public class CreatePawnService extends CreateCharacterService {

	// adds to a list that are to be saved
	public static void AddSaveObject() {

	}

	public static void Load() {
		// load on demand
	}

	public static void Save() {

		// performs that action of saving game
		// calls SaveData() (this does the actual writing of the save)
	}

	public static void Update() {
	}; // called every tick

	public static void Message(Message message) {

		// do some stuff

		// process messages
		switch (message.mflag) {

		// copy text into a parameter
		case EM_CLSNAME:
			break;

		// return text from parameter
		case EM_CLSINIT:
			break;

		// perform free class
		case EM_CLSFREE:
			break;

		// create an entity
		case EM_CREATE:
			break;

		// shuts down, doesn't necessarily remove from memory
		case EM_SHUTDOWN:
			break;

		// completely remove entity from game
		case EM_DESTROY:

			break;
		// start an entity
		case EM_START:
			break;

		// called by the main loop to update environmemnt
		case EM_UPDATE:
			break;

		// rendres the entity
		case EM_DRAW:
			break;

		default:
		}

	}

}
