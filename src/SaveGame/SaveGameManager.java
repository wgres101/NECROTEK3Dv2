package SaveGame;

//Book 3
//Section 1.7

public class SaveGameManager {

	///saveable objects inherit from this
	
	
	//
	SAVERECORD GetSaveData() { //return the data table for object\
		
		return object_save_data;
	}
	
	static SAVERECORD object_savedata[] =
		{ SAVEDATA(Object, var),
		  SAVEPTR(Object, TARGETNTT),
		  SAVEDONE()
		}
	
	SAVEOBJECT GetSaveID()
	{
		//return a uniqure ID for this class
		return PLAY_ID;
	}
	
	// This is the class factory function
	// It takes a classID and makes an object of the correct type
	SAVEOBJECT MakeObject(int classID)
	{
		switch(classID)
		{
			class PLAY_ID:
				return new SAVEOBJECT();
		}
		return null;
	}
}

