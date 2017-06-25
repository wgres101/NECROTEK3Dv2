package SaveGame.Resources;

import java.io.File;

public class ResourceFileModule {

	int version;
	int flags;
	int numberOfLumps;
	int offset;
	String virtualDirectory;
	File file; //actual stream data for file
	
	void OpenLump(String lumpName, LumpModule lumpModule) {}
	void IsLumpValidD(String lumpName, int lumpPosition) {}
	void SetCurrentDirectory(String directory) {}
	String GetCurrentDirectory() { return null;}
	
	
}
