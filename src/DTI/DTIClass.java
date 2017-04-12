package DTI;

//GEMS 2


//DTI Classes yield Dynamic Type Information and should be included
//in every class to change globally accessible class information

public class DTIClass {

	
	private String szName;
	DTIClass pdtiParent;
	
	public DTIClass() { }
	
	public DTIClass(String szSetName, DTIClass pSetParent) { }
	
	String getName() {
		return szName; }
	boolean setName(String szSetName) {
		szName = szSetName;
		return true; }
	
	DTIClass getParent() {
		return pdtiParent; }
	
	boolean setParent(DTIClass parent) {
		pdtiParent = parent;
		return true; }
	
	
	
	
}
