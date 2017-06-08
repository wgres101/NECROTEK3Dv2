package RTTI;

public class CAbstractProperty {

	
	enum ePropertyType
	{
		eptBOOL,
		eptDWORD,
		eptINT,
		eptFLOAT,
		eptDOUBLE,
		eptSTRING,
		eptCOLOR,
		eptENUM,
		eptPTR,
		eptMAX_PROPERTY_TYPES
		
	};
	
	public ePropertyType GetType() {return null; }
	
	protected String m_szName;
	
	
}
