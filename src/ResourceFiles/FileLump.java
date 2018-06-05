package ResourceFiles;

import java.util.ArrayList;

public class FileLump {

	int lumpSize;
	String fileName;
	int lumpPosition;
	int flags;
	Byte [] bytes;
	
	int GetLumpSize() { return lumpSize; }
	String GetLumpName() { return fileName; }
	
	int Read(Byte [] bytes, int ReadSize) {
		return ReadSize; }
	int Write (Byte [] bytes, int WriteSize) {
		return WriteSize; }
	
	int Seek(Byte [] bytes, int SeekType) {
		return 0;
	}
	boolean isValid() {
		return false; }
	
	
}
