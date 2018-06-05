package ResourceFiles;

import java.util.ArrayList;

public class ResourceFile {

	// resource file header
	String singuture = new String(); //filename
	
	float version;
	int flags;
	int numberOfLumps; //number of lumps
	int offset;  //where the lumps begin
	String currentDirectory; //current directory we are in
	int OffsetOfFirstFile;
	FileLump [] lumpsInFile;
	
	void OpenLump(String lumpName, int lumpOffset) { }
	boolean IsLumpValid() {
		return false; }
	void SetCurrentDirectory(String currentDirectroy) { }
	String GetCurrentDirectory() {
		return currentDirectory; }
	
	
	
}
