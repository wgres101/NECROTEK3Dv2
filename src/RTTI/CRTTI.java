package RTTI;

//Book 4 zSection 1.12

//Book 3 Section 1.4


public class CRTTI < T,  BaseClass,  CLID>   {

	
	
	final int CLASSNAME_LENGTH = 32;
	
	class ClassFactoryFunc
	{
		
	}
	
	public  CRTTI(long CLID, String szClassName, CRTTI pBaseClassCRTTI, ClassFactoryFunc pFactory)
	{
		
		
	}
	
	private long		m_CLID;
	private String 	[]	m_szClassName = new String[CLASSNAME_LENGTH];
	CRTTI 				m_pBaseRTTI;
	ClassFactoryFunc	m_pObjectFactory;

	
	
}
